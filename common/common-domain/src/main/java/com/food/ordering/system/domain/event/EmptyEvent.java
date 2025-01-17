package com.food.ordering.system.domain.event;

/**
 * @author sony
 * @description
 * @since 2025.01.17
 **********************************************************************************************************************/
public final class EmptyEvent implements DomainEvent<Void>{

    public static final EmptyEvent INSTANCE = new EmptyEvent();

    private EmptyEvent() {}

    @Override
    public void fire() {

    }
}