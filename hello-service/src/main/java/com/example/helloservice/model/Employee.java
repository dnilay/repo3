package com.example.helloservice.model;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Employee {
    private String firstName;
    private String lastName;
    private String email;
    private Double salary;
}
