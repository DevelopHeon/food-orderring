package com.food.ordering.system.order.service.domain.dto.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

/**
 * @author sony
 * @description
 * @since 2024.12.16
 **********************************************************************************************************************/
@Getter
@Builder
@AllArgsConstructor
public class OrderAddress {
    @NotNull
    @Max(value=50)
    private final String street;
    @NotNull
    @Max(value=10)
    private final String postalCode;
    @NotNull
    @Max(value=50)
    private final String city;
}