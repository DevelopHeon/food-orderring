package com.food.ordering.system.domain.exception;

/**
 * @author sony
 * @description
 * @since 2024.12.14
 **********************************************************************************************************************/
public class DomainException extends RuntimeException{
    public DomainException(String message) {
        super(message);
    }

    public DomainException(String message, Throwable cause) {
        super(message, cause);
    }
}