package com.food.ordering.system.order.service.messaging.listener.kafka;

import com.food.ordering.system.kafka.consumer.KafkaConsumer;
import com.food.ordering.system.kafka.order.avro.model.OrderApprovalStatus;
import com.food.ordering.system.kafka.order.avro.model.RestaurantApprovalResponseAvroModel;
import com.food.ordering.system.order.service.domain.ports.input.message.listener.restaurantapproval.RestaurantApprovalResponseMessageListener;
import com.food.ordering.system.order.service.messaging.mapper.OrderMessagingDataMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.food.ordering.system.order.service.domain.entity.Order.FAILURE_MESSAGE_DELIMITER;

/**
 * @author sony
 * @description
 * @since 2024.12.30
 **********************************************************************************************************************/
@Slf4j
@Component
public class RestaurantApprovalResponseKafkaListener implements KafkaConsumer<RestaurantApprovalResponseAvroModel> {

    private final RestaurantApprovalResponseMessageListener restaurantApprovalResponseMessageListener;
    private OrderMessagingDataMapper orderMessagingDataMapper;

    public RestaurantApprovalResponseKafkaListener(RestaurantApprovalResponseMessageListener restaurantApprovalResponseMessageListener, OrderMessagingDataMapper orderMessagingDataMapper) {
        this.restaurantApprovalResponseMessageListener = restaurantApprovalResponseMessageListener;
        this.orderMessagingDataMapper = orderMessagingDataMapper;
    }

    @Override
    @KafkaListener(id="${kafka-consumer-config.restaurant-approval-consumer-group-id}",
            topics="${order-service.restaurant-approval-response-topic-name}")
    public void receive(@Payload List<RestaurantApprovalResponseAvroModel> message,
                        @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) List<String> keys,
                        @Header(KafkaHeaders.RECEIVED_PARTITION_ID) List<Integer> partitions,
                        @Header(KafkaHeaders.OFFSET) List<Long> offsets) {
        log.info("{} number of restaurant approval responses received with keys {}, partitions {} and offsets {}",
                message.size(),
                keys.toString(),
                partitions.toString(),
                offsets.toString());

        message.forEach(restaurantApprovalResponse -> {
            if (OrderApprovalStatus.APPROVED == restaurantApprovalResponse.getOrderApprovalStatus()) {
                log.info("Processing approved order for order id: {}",
                        restaurantApprovalResponse.getOrderId());
                restaurantApprovalResponseMessageListener
                        .orderApproved(orderMessagingDataMapper.approvalResponseAvroModelToApprovalResponse(restaurantApprovalResponse));

            } else if (OrderApprovalStatus.REJECTED == restaurantApprovalResponse.getOrderApprovalStatus()) {
                log.info("Processing rejected order for order id: {}, with failure messages: {}",
                        restaurantApprovalResponse.getOrderId(),
                        String.join(FAILURE_MESSAGE_DELIMITER, restaurantApprovalResponse.getFailureMessages()));
                restaurantApprovalResponseMessageListener
                        .orderRejected(orderMessagingDataMapper.approvalResponseAvroModelToApprovalResponse(restaurantApprovalResponse));

            }
        });
    }
}