package com.example.mycustomerservice.service.impl;

import com.example.mycustomerservice.dao.CustomerRepository;
import com.example.mycustomerservice.dao.entities.CustomerEntity;
import com.example.mycustomerservice.dto.CustomerDTO;
import com.example.mycustomerservice.dto.CustomerMapper;
import com.example.mycustomerservice.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    /**
     * Handle to the Data Access Layer.
     */
    @Autowired
    private CustomerRepository customerRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);


    @Override
    public CustomerDTO getCustomer(Integer customerId) throws Exception {
        LOGGER.info("Fetching Customer details for CustomerId: {}", customerId);
        Optional<CustomerEntity> customerEntity = customerRepository.findById(customerId);
        CustomerDTO customerDTO = null;

        if (customerEntity.isPresent()) {
            customerDTO = CustomerMapper.INSTANCE.customerEntityToDTO(customerEntity.get());
        }

        return customerDTO;
    }
}
