package com.giovanacarvalhodev.challengebackend.dataProvider.client;

import com.giovanacarvalhodev.challengebackend.dataProvider.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name="FindAddressByCepImpl",
        url="${viaCep.url}"
)
public interface FindAddressByCepClient {

    @GetMapping("/{cep}/{typeResponse}")
    AddressResponse find(@PathVariable("cep") String cep, @PathVariable("typeResponse") String typeResponse);
}
