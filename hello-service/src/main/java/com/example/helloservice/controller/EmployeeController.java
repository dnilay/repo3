package com.example.helloservice.controller;

import com.example.helloservice.model.Employee;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
public class EmployeeController {

    public RestTemplate<Employee> getEmployee()
    {
        return new RestTemplate(Employee.builder().build())
    }
}
