package com.example.demo.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ToDo;
import com.example.demo.service.ToDoService;

@RestController
@RequestMapping("/api")
public class ToDoController {
	private ToDoService toDoService;
	private Environment environment;
	
	@Autowired
	public ToDoController(ToDoService toDoService, Environment environment) {
		super();
		this.toDoService = toDoService;
		this.environment = environment;
	}

	@GetMapping("/status")
	@LoadBalanced
	public ResponseEntity<String> getStatus()
	{
		return new ResponseEntity<>(environment.getProperty("local.server.port"),HttpStatus.OK);
	}
	
	@GetMapping("/todos")
	@LoadBalanced
	public ResponseEntity<Iterable<ToDo>> getAllToDos() {
		return new ResponseEntity<>(toDoService.getAllToDo(), HttpStatus.OK);
	}
	@PostMapping("/todos")
	@LoadBalanced
	public ResponseEntity<Optional<ToDo>> createToDo(@RequestBody ToDo toDo)
	{
		return new ResponseEntity<>(toDoService.createToDo(toDo),HttpStatus.CREATED);
	}

}
