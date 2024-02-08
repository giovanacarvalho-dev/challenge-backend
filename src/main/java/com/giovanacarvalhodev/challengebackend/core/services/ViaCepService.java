package com.giovanacarvalhodev.challengebackend.core.services;

import com.giovanacarvalhodev.challengebackend.dataProvider.client.response.AddressResponse;

public interface ViaCepService {
    AddressResponse findAddressByCep(String cep );
}
