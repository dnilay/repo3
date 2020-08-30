package com.example.unittesting.unittesting.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello-world")
	public ResponseEntity<String> helloWorld() {
		return new ResponseEntity<String>("Hello World",HttpStatus.OK);
	}
	
}
