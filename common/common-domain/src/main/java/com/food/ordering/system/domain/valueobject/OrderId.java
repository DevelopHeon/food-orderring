package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

/**
 * @since       2024.12.14
 * @author      sony
 * @description
 **********************************************************************************************************************/
public class OrderId extends BaseId<UUID>{
    public OrderId(UUID value) {
        super(value);
    }
}