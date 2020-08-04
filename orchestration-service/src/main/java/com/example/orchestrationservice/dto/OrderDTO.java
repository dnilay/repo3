package com.example.orchestrationservice.dto;

import lombok.Data;

@Data
public class OrderDTO {

    private Integer orderId;

    private Integer customerId;

    private String status;

    private Double totalAmount;
}
