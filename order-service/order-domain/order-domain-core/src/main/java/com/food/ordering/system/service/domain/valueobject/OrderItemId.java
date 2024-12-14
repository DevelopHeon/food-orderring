package com.food.ordering.system.service.domain.valueobject;

import com.food.ordering.system.domain.valueobject.BaseId;

import java.util.UUID;

/**
 * @since       2024.12.14
 * @author      sony
 * @description
 **********************************************************************************************************************/
public class OrderItemId extends BaseId<Long> {
    public OrderItemId(Long value) {
        super(value);
    }
}