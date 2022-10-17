package com.example.demo.exception;

public class NutritionPlanApiRequestException extends RuntimeException {

    public NutritionPlanApiRequestException(String message) {
        super(message);
    }

    public NutritionPlanApiRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
