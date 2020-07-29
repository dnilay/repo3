package com.example.mycustomerservice.service;


import com.example.mycustomerservice.dto.CustomerDTO;

public interface CustomerService {
    CustomerDTO getCustomer(Integer customerId) throws Exception;
}
