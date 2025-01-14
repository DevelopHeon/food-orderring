package com.food.ordering.system.payment.service.domain.event;

import com.food.ordering.system.payment.service.domain.entity.Payment;
import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;

import java.time.ZonedDateTime;
import java.util.Collections;

/**
 * @author sony
 * @description
 * @since 2025.01.08
 **********************************************************************************************************************/
public class PaymentCompletedEvent extends PaymentEvent{

    private final DomainEventPublisher<PaymentCompletedEvent> paymentCompletedEventDomainEventPublisher;
    public PaymentCompletedEvent(Payment payment,
                                 ZonedDateTime createdAt,
                                 DomainEventPublisher<PaymentCompletedEvent> paymentCompletedEventDomainEventPublisher) {
        super(payment, createdAt, Collections.emptyList());
        this.paymentCompletedEventDomainEventPublisher = paymentCompletedEventDomainEventPublisher;
    }

    @Override
    public void fire() {
        paymentCompletedEventDomainEventPublisher.publish(this);
    }
}