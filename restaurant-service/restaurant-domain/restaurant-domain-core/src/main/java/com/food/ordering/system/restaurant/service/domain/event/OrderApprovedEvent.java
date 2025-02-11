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
public class OrderApprovedEvent extends OrderApprovalEvent{

    private final DomainEventPublisher<OrderApprovedEvent> orderApprovedEventDomainEventPublisher;

    public OrderApprovedEvent(OrderApproval orderApproval,
                              RestaurantId restaurantId,
                              List<String> failureMessages,
                              ZonedDateTime createdAt,
                              DomainEventPublisher<OrderApprovedEvent> orderApprovedEventDomainEventPublisher) {
        super(orderApproval, restaurantId, failureMessages, createdAt);
        this.orderApprovedEventDomainEventPublisher = orderApprovedEventDomainEventPublisher;
    }

    @Override
    public void fire() {
        orderApprovedEventDomainEventPublisher.publish(this);
    }
}