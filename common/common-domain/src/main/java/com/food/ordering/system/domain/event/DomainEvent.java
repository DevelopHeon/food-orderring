package com.food.ordering.system.domain.event;

/**
 * @since       2024.12.14
 * @author      sony
 * @description
 **********************************************************************************************************************/
public interface DomainEvent<T> {
    void fire();
}