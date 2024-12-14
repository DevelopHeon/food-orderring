package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

/**
 * @since       2024.12.14
 * @author      sony
 * @description
 **********************************************************************************************************************/
public class RestaurantId extends BaseId<UUID>{
    public RestaurantId(UUID value) {
        super(value);
    }
}