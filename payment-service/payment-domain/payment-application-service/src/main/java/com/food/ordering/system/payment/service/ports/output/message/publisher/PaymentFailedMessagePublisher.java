package com.food.ordering.system.payment.service.ports.output.message.publisher;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.payment.service.event.PaymentFailedEvent;

/**
 * @author sony
 * @description
 * @since 2025.01.08
 **********************************************************************************************************************/
public interface PaymentFailedMessagePublisher extends DomainEventPublisher<PaymentFailedEvent> {
}