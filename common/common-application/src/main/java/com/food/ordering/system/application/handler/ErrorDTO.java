package com.food.ordering.system.application.handler;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author sony
 * @description
 * @since 2024.12.29
 **********************************************************************************************************************/
@Data
@Builder
@AllArgsConstructor
public class ErrorDTO {

    private final String code;
    private String message;
}