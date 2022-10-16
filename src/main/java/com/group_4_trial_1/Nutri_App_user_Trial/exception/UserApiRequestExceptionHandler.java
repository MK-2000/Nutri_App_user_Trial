package com.group_4_trial_1.Nutri_App_user_Trial.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class UserApiRequestExceptionHandler {

    @ExceptionHandler(value = {UserApiRequestException.class})
    public ResponseEntity<Object> handleUserApiRequestException(UserApiRequestException ue) {
        // Creating payload to send into the response entity containing exception details
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        UserApiException userApiException = new UserApiException(
                ue.getMessage(),
//                ue,
                badRequest,
                ZonedDateTime.now(ZoneId.of("Z"))
        );

        //Return response entity
        return new ResponseEntity<>(userApiException, badRequest);

    }
}
