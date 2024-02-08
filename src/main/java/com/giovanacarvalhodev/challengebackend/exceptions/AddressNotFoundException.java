package com.giovanacarvalhodev.challengebackend.exceptions;

import feign.FeignException;
import feign.Request;

import java.util.Collection;
import java.util.Map;

public class AddressNotFoundException extends FeignException.FeignClientException {
    public AddressNotFoundException(int status, String message, Request request, byte[] body, Map<String, Collection<String>> headers) {
        super(status, message, request, body, headers);
    }
}
