package com.giovanacarvalhodev.challengebackend.dataProvider.client.response.impl;

import com.giovanacarvalhodev.challengebackend.core.dataProvider.FindAddressByCep;
import com.giovanacarvalhodev.challengebackend.dataProvider.client.FindAddressByCepClient;
import com.giovanacarvalhodev.challengebackend.dataProvider.client.response.AddressResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByCepImpl implements FindAddressByCep {

    @Autowired
    private FindAddressByCepClient findAddressByCepClient;
    @Override
    public AddressResponse find(String cep) {

        AddressResponse address = findAddressByCepClient.find(cep, "/json");
        return address;
    }
}
