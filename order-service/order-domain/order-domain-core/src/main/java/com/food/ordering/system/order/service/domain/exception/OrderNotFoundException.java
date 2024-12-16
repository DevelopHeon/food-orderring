package com.food.ordering.system.order.service.domain.exception;

import com.food.ordering.system.domain.exception.DomainException;

/**
 * @author sony
 * @description
 * @since 2024.12.17
 **********************************************************************************************************************/
public class OrderNotFoundException extends DomainException {


    public OrderNotFoundException(String message) {
        super(message);
    }

    public OrderNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}