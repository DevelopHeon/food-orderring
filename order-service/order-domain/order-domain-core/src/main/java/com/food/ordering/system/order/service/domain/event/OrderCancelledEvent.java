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


    public OrderCancelledEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}