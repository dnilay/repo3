package com.example.customerservice.service;

import com.example.dto.CustomerDTO;

/**
 * Service interface that masks the caller from the implementation that fetches / acts on CustomerDTO
 * related data.
 *
 * @author Sohan
 */
public interface CustomerService {

    /**
     * Gets the Customers Details for the given CustomerId.
     *
     * @param customerId
     * @return CustomerDTO
     */
    CustomerDTO getCustomer(Integer customerId) throws Exception;
}
