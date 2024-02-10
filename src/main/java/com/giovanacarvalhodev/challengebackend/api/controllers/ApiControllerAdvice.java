package com.giovanacarvalhodev.challengebackend.api.controllers;

import com.giovanacarvalhodev.challengebackend.api.ApiErrors;
import com.giovanacarvalhodev.challengebackend.exceptions.AddressNotFoundException;
import com.giovanacarvalhodev.challengebackend.exceptions.ExternApiException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.HandlerMethodValidationException;

@RestControllerAdvice
public class ApiControllerAdvice {
    Logger logger = LoggerFactory.getLogger(ApiControllerAdvice.class);

    @ExceptionHandler(AddressNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiErrors handleAddressNotFoundException(AddressNotFoundException exception) {
        String messageErr = exception.getMessage();
        logger.error("status code: " + HttpStatus.NOT_FOUND);
        logger.error(messageErr);
        return new ApiErrors(messageErr);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(HandlerMethodValidationException.class)
    public ApiErrors handleValidationException(HandlerMethodValidationException exception) {
        String messageErr = "Invalid cep";
        logger.error("status code: " + HttpStatus.BAD_REQUEST);
        logger.error(messageErr);
        return new ApiErrors(messageErr);
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(ExternApiException.class)
    public ApiErrors handleExternApiException(ExternApiException exception) {
        String messageErr = "Server Error";
        logger.error("status code: " + HttpStatus.INTERNAL_SERVER_ERROR);
        logger.error(messageErr);
        return new ApiErrors(messageErr);
    }
}
