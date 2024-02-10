package com.giovanacarvalhodev.challengebackend.core.services.impl;

import com.giovanacarvalhodev.challengebackend.core.dataProvider.FindAddressByCep;
import com.giovanacarvalhodev.challengebackend.core.services.ViaCepService;
import com.giovanacarvalhodev.challengebackend.dataProvider.client.response.AddressResponse;
import com.giovanacarvalhodev.challengebackend.exceptions.AddressNotFoundException;
import com.giovanacarvalhodev.challengebackend.exceptions.ExternApiException;

import feign.FeignException;

public class ViaCepServiceImpl implements ViaCepService {

    private final FindAddressByCep findAddressByCep;
    public ViaCepServiceImpl(FindAddressByCep findAddressByCep) {
        this.findAddressByCep = findAddressByCep;
    }
    @Override
    public AddressResponse findAddressByCep(String cep) {
        try {
            AddressResponse address = findAddressByCep.find(cep);
            if(address.getErro()) throw new ExternApiException(
                    404,
                    "Address not found"
            );
            return address;
        } catch (AddressNotFoundException  | ExternApiException exception) {
            if( exception.status() == 404) throw new AddressNotFoundException(
                    404,
                    "Address not found"
            );
            throw new ExternApiException(500, "Server Error");
        }
    }
}
