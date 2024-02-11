package com.giovanacarvalhodev.challengebackend.api.controllers;

import com.giovanacarvalhodev.challengebackend.api.controllers.mappers.AddressDTOMapper;
import com.giovanacarvalhodev.challengebackend.core.services.impl.ViaCepServiceImpl;
import com.giovanacarvalhodev.challengebackend.dataProvider.client.response.AddressResponse;
import com.giovanacarvalhodev.challengebackend.exceptions.AddressNotFoundException;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = AddressController.class)
@ComponentScan(basePackages = "com.giovanacarvalhodev.challengebackend.api.controllers.mappers")
public class AddressControllerTest {

    @MockBean
    private ViaCepServiceImpl viaCepService;

    @Autowired
    private AddressDTOMapper addressDTOMapper;

    @Autowired
    private MockMvc mockMvc;
    @BeforeEach()
    public void init() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void testFindAddressWithSuccess() throws Exception {
        AddressResponse addressResponse = new AddressResponse("any_zipCode", "any_street", "any_complement", "any_neighborhood", "any_local", "any_city", "any_state", "any_ibge", "any_gia", "any_ddd");
        when(viaCepService.findAddressByCep(anyString())).thenReturn(addressResponse);

        mockMvc.perform(get("/api/cep/12345678"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"cep\":\"any_zipCode\",\"logradouro\":\"any_street\",\"complemento\":\"any_complement\",\"bairro\":\"any_neighborhood\",\"localidade\":\"any_local\",\"uf\":\"any_city\"}"));
    }

    @Test
    public void testFindAddressWithInvalidCep() throws Exception {
        AddressResponse addressResponse = new AddressResponse("any_zipCode", "any_street", "any_complement", "any_neighborhood", "any_local", "any_city", "any_state", "any_ibge", "any_gia", "any_ddd");
        when(viaCepService.findAddressByCep(anyString())).thenReturn(addressResponse);

        mockMvc.perform(get("/api/cep/invalid_cep"))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void testFindAddressWhenCepNotFound() throws Exception {
        when(viaCepService.findAddressByCep(anyString())).thenThrow(AddressNotFoundException.class);

        mockMvc.perform(get("/api/cep/12345678"))
                .andExpect(status().isNotFound());
    }
}