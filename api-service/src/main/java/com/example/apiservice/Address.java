package com.example.apiservice;

import lombok.Data;

@Data
public class Address {
    private String id;
    private String customerId;
    private String street;
    private String city;
}
