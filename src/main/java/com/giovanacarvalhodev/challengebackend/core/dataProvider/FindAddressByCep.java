package com.giovanacarvalhodev.challengebackend.core.dataProvider;

import com.giovanacarvalhodev.challengebackend.dataProvider.client.response.AddressResponse;

public interface FindAddressByCep {
    AddressResponse find(final String cep);
}
