package com.food.ordering.system.saga;

/**
 * @author sony
 * @description
 * @since 2025.01.18
 **********************************************************************************************************************/
public enum SagaStatus {

    STARTED, FAILED, SUCCEEDED, PROCESSING, COMPENSATING, COMPENSATED
}