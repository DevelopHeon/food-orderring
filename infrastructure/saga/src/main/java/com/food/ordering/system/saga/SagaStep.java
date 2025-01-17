package com.food.ordering.system.saga;

import com.food.ordering.system.domain.event.DomainEvent;

/**
 * @author sony
 * @description
 * @since 2025.01.17
 **********************************************************************************************************************/
public interface SagaStep <T, S extends DomainEvent, U extends DomainEvent>{
    S process(T data);
    U rollback(T data);
}