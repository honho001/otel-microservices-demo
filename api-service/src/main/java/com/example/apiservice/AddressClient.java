package com.example.apiservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

@Component
public class AddressClient {
    private final RestTemplate restTemplate;
    private final String baseUrl;

    public AddressClient(
            RestTemplate restTemplate,
            @Value("${addressClient.baseUrl}") String baseUrl) {
        this.restTemplate = restTemplate;
        this.baseUrl = baseUrl;
    }

    Address getAddressForCustomerId(@PathVariable("id") String id) {
        String url = String.format("%s/addresses/%s", baseUrl, id);
        return restTemplate.getForObject(url, Address.class);
    }
}
