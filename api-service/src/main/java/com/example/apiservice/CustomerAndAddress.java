package com.example.apiservice;

import lombok.Data;

@Data
public class CustomerAndAddress {
    private String name;
    private String age;
    private String street;
    private String city;

    public CustomerAndAddress(Customer customer, Address address) {
        this.name = customer.getName();
        this.age = customer.getAge();
        this.street = address.getStreet();
        this.city = address.getCity();
    }
}
