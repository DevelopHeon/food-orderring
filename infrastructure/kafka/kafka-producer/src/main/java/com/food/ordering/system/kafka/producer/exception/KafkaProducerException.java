package com.food.ordering.system.kafka.producer.exception;

/**
 * @author sony
 * @description
 * @since 2024.12.24
 **********************************************************************************************************************/
public class KafkaProducerException extends RuntimeException{

    public KafkaProducerException(String message) {
        super(message);
    }
}