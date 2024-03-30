package com.example.addressservice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private String id;
    private String customerId;
    private String street;
    private String city;
}
