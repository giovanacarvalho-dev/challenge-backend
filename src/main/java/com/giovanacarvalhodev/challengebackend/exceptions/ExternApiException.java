package com.giovanacarvalhodev.challengebackend.exceptions;

import feign.FeignException;

public class ExternApiException extends FeignException {
    public ExternApiException(int status, String message) {
        super(status, message);
    }
}
