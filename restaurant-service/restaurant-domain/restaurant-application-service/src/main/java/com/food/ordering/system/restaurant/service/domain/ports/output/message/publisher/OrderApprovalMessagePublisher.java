package com.food.ordering.system.restaurant.service.domain.ports.output.message.publisher;

import com.food.ordering.restaurant.service.domain.entity.OrderApproval;
import com.food.ordering.restaurant.service.domain.event.OrderApprovalEvent;
import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import org.springframework.core.annotation.Order;

/**
 * @author sony
 * @description
 * @since 2025.01.13
 **********************************************************************************************************************/
public interface OrderApprovalMessagePublisher extends DomainEventPublisher<OrderApprovalEvent> {
}