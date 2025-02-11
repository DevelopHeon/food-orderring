package com.food.ordering.system.restaurant.service.domain.event;

import com.food.ordering.system.restaurant.service.domain.entity.OrderApproval;
import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.domain.valueobject.RestaurantId;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * @author sony
 * @description
 * @since 2025.01.13
 **********************************************************************************************************************/
public class OrderRejectedEvent extends OrderApprovalEvent{

    private final DomainEventPublisher<OrderRejectedEvent> orderRejectedEventDomainEventPublisher;

    public OrderRejectedEvent(OrderApproval orderApproval,
                              RestaurantId restaurantId,
                              List<String> failureMessages,
                              ZonedDateTime createdAt,
                              DomainEventPublisher<OrderRejectedEvent> orderRejectedEventDomainEventPublisher) {
        super(orderApproval, restaurantId, failureMessages, createdAt);
        this.orderRejectedEventDomainEventPublisher = orderRejectedEventDomainEventPublisher;
    }

    @Override
    public void fire() {
        orderRejectedEventDomainEventPublisher.publish(this);
    }
}