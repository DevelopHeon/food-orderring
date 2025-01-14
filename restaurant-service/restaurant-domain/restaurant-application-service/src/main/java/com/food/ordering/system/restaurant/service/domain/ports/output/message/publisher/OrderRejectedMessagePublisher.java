package com.food.ordering.system.restaurant.service.domain.ports.output.message.publisher;

import com.food.ordering.system.restaurant.service.domain.event.OrderRejectedEvent;
import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;

/**
 * @author sony
 * @description
 * @since 2025.01.13
 **********************************************************************************************************************/
public interface OrderRejectedMessagePublisher extends DomainEventPublisher<OrderRejectedEvent> {
}