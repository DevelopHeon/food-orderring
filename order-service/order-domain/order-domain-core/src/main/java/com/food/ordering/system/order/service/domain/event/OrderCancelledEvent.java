package com.food.ordering.system.order.service.domain.event;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

/**
 * @author sony
 * @description
 * @since 2024.12.14
 **********************************************************************************************************************/
public class OrderCancelledEvent extends OrderEvent {

    private final DomainEventPublisher<OrderCancelledEvent> orderCanceledEventDomainEventPublisher;

    public OrderCancelledEvent(Order order, ZonedDateTime createdAt, DomainEventPublisher<OrderCancelledEvent> orderCanceledEventDomainEventPublisher) {
        super(order, createdAt);
        this.orderCanceledEventDomainEventPublisher = orderCanceledEventDomainEventPublisher;
    }

    @Override
    public void fire() {
        orderCanceledEventDomainEventPublisher.publish(this);
    }
}