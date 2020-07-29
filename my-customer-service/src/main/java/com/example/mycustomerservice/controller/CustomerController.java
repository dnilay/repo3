package com.example.mycustomerservice.controller;

import com.example.mycustomerservice.dto.CustomerDTO;
import com.example.mycustomerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(value = "/customers/{customerId}", method = RequestMethod.GET)
    public CustomerDTO getCustomer(@PathVariable Integer customerId) throws Exception {
        return customerService.getCustomer(customerId);
    }
}
