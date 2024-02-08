package com.giovanacarvalhodev.challengebackend.config;

import com.giovanacarvalhodev.challengebackend.core.services.impl.ViaCepServiceImpl;
import com.giovanacarvalhodev.challengebackend.dataProvider.client.FindAddressByCepClient;
import com.giovanacarvalhodev.challengebackend.dataProvider.client.response.impl.FindAddressByCepImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCepConfiguration {

    @Bean
    public ViaCepServiceImpl viaCepService(FindAddressByCepImpl findAddressByCep) {
        return new ViaCepServiceImpl(findAddressByCep);
    }
}
