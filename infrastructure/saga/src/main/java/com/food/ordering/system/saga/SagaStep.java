package com.food.ordering.system.saga;

import com.food.ordering.system.domain.event.DomainEvent;

/**
 * @author sony
 * @description
 * @since 2025.01.17
 **********************************************************************************************************************/
public interface SagaStep <T>{
    void process(T data);
    void rollback(T data);
}