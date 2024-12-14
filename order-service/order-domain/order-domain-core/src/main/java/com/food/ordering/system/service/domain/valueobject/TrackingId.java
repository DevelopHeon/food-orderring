package com.food.ordering.system.service.domain.valueobject;

import com.food.ordering.system.domain.valueobject.BaseId;

import java.util.UUID;

/**
 * @author sony
 * @description
 * @since 2024.12.14
 **********************************************************************************************************************/
public class TrackingId extends BaseId<UUID> {
    public TrackingId(UUID value) {
        super(value);
    }
}