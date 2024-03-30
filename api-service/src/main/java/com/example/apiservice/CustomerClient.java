package com.example.apiservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

@Component
public class CustomerClient {
    private final RestTemplate restTemplate;
    private final String baseUrl;

    public CustomerClient(
            RestTemplate restTemplate,
            @Value("${customerClient.baseUrl}") String baseUrl) {
        this.restTemplate = restTemplate;
        this.baseUrl = baseUrl;
    }

    Customer getCustomer(@PathVariable("id") String id) {
        String url = String.format("%s/customers/%s", baseUrl, id);
        return restTemplate.getForObject(url, Customer.class);
    }
}
