package com.food.ordering.system.payment.service.domain.valueobject;

import com.food.ordering.system.domain.valueobject.BaseId;

import java.util.UUID;

/**
 * @author sony
 * @description
 * @since 2025.01.07
 **********************************************************************************************************************/
public class CreditEntryId extends BaseId<UUID> {

    public CreditEntryId(UUID value) {
        super(value);
    }
}