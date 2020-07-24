package com.example.demo.rest;

import java.util.Optional;

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

	public ToDoController(ToDoService toDoService) {
		super();
		this.toDoService = toDoService;
	}

	@GetMapping("/todos")
	public ResponseEntity<Iterable<ToDo>> getAllToDos() {
		return new ResponseEntity<>(toDoService.getAllToDo(), HttpStatus.OK);
	}
	@PostMapping("/todos")
	public ResponseEntity<Optional<ToDo>> createToDo(@RequestBody ToDo toDo)
	{
		return new ResponseEntity<>(toDoService.createToDo(toDo),HttpStatus.CREATED);
	}

}
