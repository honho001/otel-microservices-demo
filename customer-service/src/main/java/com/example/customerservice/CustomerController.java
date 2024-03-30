package com.example.customerservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @GetMapping(path = "customers/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") String customerId) {
        logger.info("GETTING CUSTOMER WITH ID {}", customerId);
        Customer customer = new Customer("4SSJ9S8", "John Doe", "30");
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
}
