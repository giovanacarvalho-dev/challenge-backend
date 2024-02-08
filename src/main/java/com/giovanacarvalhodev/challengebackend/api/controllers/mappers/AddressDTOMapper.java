package com.giovanacarvalhodev.challengebackend.api.controllers.mappers;

import com.giovanacarvalhodev.challengebackend.api.controllers.DTOs.AddressDTO;
import com.giovanacarvalhodev.challengebackend.dataProvider.client.response.AddressResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Component
public class AddressDTOMapper {
    public AddressDTO toAddressDTO( AddressResponse addressResponse) {
        AddressDTO dto = new AddressDTO();
        dto.setCep(addressResponse.getCep());
        dto.setUf(addressResponse.getUf());
        dto.setBairro(addressResponse.getBairro());
        dto.setLogradouro(addressResponse.getLogradouro());
        dto.setLocalidade(addressResponse.getLocalidade());
        dto.setComplemento(addressResponse.getComplemento());

        return dto;
    }
}