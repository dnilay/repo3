package com.example.customerservice.dto;

import lombok.Data;

/**
 * POJO for holding Customer related data
 */
@Data
public class CustomerDTO {

    private Integer customerId;

    private String firstName;

    private String lastName;

    private String city;

    private String country;
}
