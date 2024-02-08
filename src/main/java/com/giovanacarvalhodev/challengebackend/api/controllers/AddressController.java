package com.giovanacarvalhodev.challengebackend.api.controllers;

import com.giovanacarvalhodev.challengebackend.api.controllers.DTOs.AddressDTO;
import com.giovanacarvalhodev.challengebackend.api.controllers.mappers.AddressDTOMapper;
import com.giovanacarvalhodev.challengebackend.core.services.ViaCepService;
import com.giovanacarvalhodev.challengebackend.dataProvider.client.response.AddressResponse;
import jakarta.validation.constraints.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cep")
public class AddressController {
    Logger logger = LoggerFactory.getLogger(AddressController.class);
    @Autowired
    private AddressDTOMapper addressDTOMapper;

    @Autowired
    private ViaCepService viaCepService;
    @GetMapping("/{cep}")
    public ResponseEntity<AddressDTO> findAddress(@PathVariable @Pattern(regexp = "^(?!([0-9])\\1{7})\\d{8}$") String cep) {
        AddressResponse response = viaCepService.findAddressByCep(cep);
        logger.info("success: "+ HttpStatus.OK);
        logger.info(String.valueOf(response));
        return ResponseEntity.ok().body(addressDTOMapper.toAddressDTO(response));
    }
}
