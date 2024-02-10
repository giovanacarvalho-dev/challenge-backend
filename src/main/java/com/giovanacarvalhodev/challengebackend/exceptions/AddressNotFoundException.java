package com.giovanacarvalhodev.challengebackend.exceptions;

import feign.FeignException;
import feign.Request;

import java.util.Collection;
import java.util.Map;

public class AddressNotFoundException extends FeignException {
    public AddressNotFoundException(int status, String message) {
        super(status, message);
    }
}
