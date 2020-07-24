package com.example.employeeservice.repository;

import com.example.employeeservice.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;



public interface EmployeeRepository extends CrudRepository<Employee,Long> {


	
}
