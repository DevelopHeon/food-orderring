package com.food.ordering.system.payment.service.domain.mapper;

import com.food.ordering.system.domain.valueobject.CustomerId;
import com.food.ordering.system.domain.valueobject.Money;
import com.food.ordering.system.domain.valueobject.OrderId;
import com.food.ordering.system.payment.service.domain.dto.PaymentRequest;
import org.springframework.stereotype.Component;
import payment.service.domain.entity.Payment;

import java.util.UUID;

/**
 * @author sony
 * @description
 * @since 2025.01.08
 **********************************************************************************************************************/
@Component
public class PaymentDataMapper {

    public Payment paymentRequestModelToPayment(PaymentRequest paymentRequest) {
        return Payment.builder()
                .orderId(new OrderId(UUID.fromString(paymentRequest.getOrderId())))
                .customer(new CustomerId(UUID.fromString(paymentRequest.getCustomerId())))
                .price(new Money(paymentRequest.getPrice()))
                .build();
    }

}