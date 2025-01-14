package com.food.ordering.system.dataaccess.restaurant.exception;

/**
 * @author sony
 * @description
 * @since 2024.12.29
 **********************************************************************************************************************/
public class RestaurantDataAccessException extends RuntimeException{

    public RestaurantDataAccessException(String message) {
        super(message);
    }
}