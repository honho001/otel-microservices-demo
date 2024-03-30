package com.example.apiservice;

import lombok.Data;

@Data
public class CustomerAndAddress {
    private Customer customer;
    private Address address;

    public CustomerAndAddress(Customer customer, Address address) {
        this.customer = customer;
        this.address = address;
    }
}
