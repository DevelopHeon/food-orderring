package com.food.ordering.restaurant.service.domain.exception;

import com.food.ordering.system.domain.exception.DomainException;

/**
 * @author sony
 * @description
 * @since 2025.01.13
 **********************************************************************************************************************/
public class RestaurantNotFoundException extends DomainException {


    public RestaurantNotFoundException(String message) {
        super(message);
    }

    public RestaurantNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}