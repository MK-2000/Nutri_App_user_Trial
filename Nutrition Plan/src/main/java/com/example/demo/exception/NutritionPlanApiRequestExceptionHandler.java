package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class NutritionPlanApiRequestExceptionHandler {

    @ExceptionHandler(value = {NutritionPlanApiRequestException.class})
    public ResponseEntity<Object> handleNutritionPlanApiRequestException(NutritionPlanApiRequestException e){
        //create payload containing exception details
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;

        NutritionPlanApiException nutritionPlanApiException = new NutritionPlanApiException(
                e.getMessage(),
                //e,
                badRequest,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        // return response entity
        return new ResponseEntity<>(nutritionPlanApiException, badRequest);
    }
}
