package com.food.ordering.system.service.domain.exception;

import com.food.ordering.system.domain.exception.DomainException;

/**
 * @author sony
 * @description
 * @since 2024.12.14
 **********************************************************************************************************************/
public class OrderDomainException extends DomainException {


    public OrderDomainException(String message) {
        super(message);
    }

    public OrderDomainException(String message, Throwable cause) {
        super(message, cause);
    }
}