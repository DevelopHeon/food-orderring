package com.food.ordering.system.payment.service.domain.ports.output.message.publisher;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import payment.service.domain.event.PaymentFailedEvent;

/**
 * @author sony
 * @description
 * @since 2025.01.08
 **********************************************************************************************************************/
public interface PaymentFailedMessagePublisher extends DomainEventPublisher<PaymentFailedEvent> {
}