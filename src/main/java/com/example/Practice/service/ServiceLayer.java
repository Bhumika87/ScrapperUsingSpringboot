package com.example.Practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.security.PrivateKey;

@Service
public class ServiceLayer {
    private final RestTemplate restTemplate;
    @Autowired
    public ServiceLayer(RestTemplate restTemplate)
    {
        this.restTemplate=restTemplate;
    }
    public String consumeAPI(){
        return restTemplate.getForObject("https://jservice.io/api/random", String.class);
    }


}
