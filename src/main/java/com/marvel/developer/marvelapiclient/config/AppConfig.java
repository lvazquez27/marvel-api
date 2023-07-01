package com.marvel.developer.marvelapiclient.config;

import mx.openpay.marvel_sdk.client.MarvelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {
    @Value("${marvel.private_key}")
    private String PRIVATE_KEY;

    @Value("${marvel.public_key}")
    private String PUBLIC_KEY;
    @Bean
    public MarvelClient marvelClient(){

        return new MarvelClient(PUBLIC_KEY, PRIVATE_KEY);
    }
}
