package com.giovanacarvalhodev.challengebackend.api.controllers.DTOs;

import lombok.Data;

@Data
public class AddressDTO {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
}
