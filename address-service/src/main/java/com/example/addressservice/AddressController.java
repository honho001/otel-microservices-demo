package com.example.addressservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AddressController {
    private final Logger logger = LoggerFactory.getLogger(AddressController.class);

    @GetMapping(path = "addresses/{id}")
    public ResponseEntity<Address> getAddress(@PathVariable("id") String customerId) {
        logger.info("GETTING ADDRESS FOR CUSTOMER WITH ID {}", customerId);
        Address address = new Address("9DAILVA", "4SSJ9S8", "123 Vo Nguyen Giap", "Da Nang");
        return new ResponseEntity<>(address, HttpStatus.OK);
    }
}
