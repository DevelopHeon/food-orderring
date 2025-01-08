package com.food.ordering.system.payment.service.domain.ports.input.message.listener;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.payment.service.domain.dto.PaymentRequest;
import payment.service.domain.event.PaymentCompletedEvent;

/**
 * @author sony
 * @description
 * @since 2025.01.08
 **********************************************************************************************************************/
public interface PaymentRequestMessageListener {

    void completePayment(PaymentRequest paymentRequest);
    void cancelPayment(PaymentRequest paymentRequest);
}