package com.food.ordering.system.outbox;

/**
 * @author sony
 * @description
 * @since 2025.01.18
 **********************************************************************************************************************/
public interface OutboxScheduler {

    void processOutboxMessage();
}