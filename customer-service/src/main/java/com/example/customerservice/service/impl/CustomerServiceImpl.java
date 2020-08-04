package com.example.customerservice.service.impl;

import com.example.customerservice.dao.CustomerRepository;
import com.example.customerservice.dao.entities.CustomerEntity;
import com.example.customerservice.dto.CustomerDTO;
import com.example.customerservice.dto.CustomerMapper;
import com.example.customerservice.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
@Service
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
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
