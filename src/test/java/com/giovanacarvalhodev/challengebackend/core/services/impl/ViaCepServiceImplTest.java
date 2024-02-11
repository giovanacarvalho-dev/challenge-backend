package com.giovanacarvalhodev.challengebackend.core.services.impl;

import com.giovanacarvalhodev.challengebackend.core.dataProvider.FindAddressByCep;
import com.giovanacarvalhodev.challengebackend.dataProvider.client.response.AddressResponse;
import com.giovanacarvalhodev.challengebackend.exceptions.AddressNotFoundException;
import com.giovanacarvalhodev.challengebackend.exceptions.ExternApiException;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class ViaCepServiceImplTest {
    @Mock
    FindAddressByCep findAddressByCep;
    @InjectMocks
    ViaCepServiceImpl viaCepService;

    @BeforeEach()
    public void init() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void validateFindCepWhenCepExists() {
        AddressResponse addressResponse = new AddressResponse("any_zipCode", "any_street", "any_complement", "any_neighborhood", "any_local", "any_city", "any_state", "any_ibge", "any_gia", "any_ddd");
        when(findAddressByCep.find(anyString())).thenReturn(addressResponse);
        AddressResponse response = viaCepService.findAddressByCep(anyString());
        assertEquals(response.getCep(), addressResponse.getCep());
    }

    @Test
    public void validateFindCepWhenReturnHasError() {
        AddressResponse addressResponse = new AddressResponse(true);
        when(findAddressByCep.find(anyString())).thenReturn(addressResponse);
        assertThrows(AddressNotFoundException.class, () -> {
            viaCepService.findAddressByCep(anyString());
        });
    }
}