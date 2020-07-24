package com.example.employeeservice.controller;

import java.util.Optional;

import com.example.employeeservice.model.Employee;
import com.example.employeeservice.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
	EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeController(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@PostMapping("/")
	public Employee add(@RequestBody Employee employee) {
		LOGGER.info("Employee add: {}", employee);
		return employeeRepository.save(employee);
	}
	
	@GetMapping("/{id}")
	public Optional<Employee> findById(@PathVariable("id") Long id) {
		LOGGER.info("Employee find: id={}", id);
		return employeeRepository.findById(id);
	}
	
	@GetMapping("/")
	public Iterable<Employee> findAll() {
		LOGGER.info("Employee find");
		return employeeRepository.findAll();
	}

}
