package com.food.ordering.system.payment.service.valueobject;

import com.food.ordering.system.domain.valueobject.BaseId;

import java.util.UUID;

/**
 * @author sony
 * @description
 * @since 2025.01.07
 **********************************************************************************************************************/
public class PaymentId extends BaseId<UUID> {

    public PaymentId(UUID value) {
        super(value);
    }
}