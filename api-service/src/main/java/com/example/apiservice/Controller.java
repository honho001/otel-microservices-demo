package com.example.apiservice;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Controller {
    private CustomerClient customerClient;
    private AddressClient addressClient;

    private final Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping(path = "customers/{id}")
    public CustomerAndAddress getCustomerWithAddress(@PathVariable("id") long customerId) {
        logger.info("COLLECTING CUSTOMER AND ADDRESS WITH ID {} FROM UPSTREAM SERVICE", customerId);
        Customer customer = customerClient.getCustomer(customerId);
        Address address = addressClient.getAddressForCustomerId(customerId);
        return new CustomerAndAddress(customer, address);
    }
}
