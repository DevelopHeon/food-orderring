package com.food.ordering.system.restaurant.service.domain.exception;

import com.food.ordering.system.domain.exception.DomainException;

/**
 * @author sony
 * @description
 * @since 2025.01.13
 **********************************************************************************************************************/
public class RestaurantDomainException extends DomainException {


    public RestaurantDomainException(String message) {
        super(message);
    }

    public RestaurantDomainException(String message, Throwable cause) {
        super(message, cause);
    }
}