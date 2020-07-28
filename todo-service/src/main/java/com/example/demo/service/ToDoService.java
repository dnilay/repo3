package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.ToDo;

public interface ToDoService {

	public Iterable<ToDo> getAllToDo();
	public Optional<ToDo> createToDo(ToDo toDo);

}
