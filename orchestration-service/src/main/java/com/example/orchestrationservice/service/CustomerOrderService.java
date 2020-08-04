package com.example.orchestrationservice.service;

import com.example.orchestrationservice.dto.CustomerOrderDTO;

public interface CustomerOrderService {

    CustomerOrderDTO getCustomerOrder(Integer orderId) throws Exception;
}
