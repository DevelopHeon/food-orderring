package com.food.ordering.system.domain.event.publisher;

import com.food.ordering.system.domain.event.DomainEvent;

/**
 * @author sony
 * @description
 * @since 2024.12.16
 **********************************************************************************************************************/
public interface DomainEventPublisher<T extends DomainEvent> {

    void publish(T domainEvent);
}