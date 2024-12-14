package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

/**
 * @since       2024.12.14
 * @author      sony
 * @description
 **********************************************************************************************************************/
public class ProductId extends BaseId<UUID> {
    public ProductId(UUID value) {
        super(value);
    }
}