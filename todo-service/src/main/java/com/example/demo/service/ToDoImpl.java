package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.ToDoRepository;
import com.example.demo.model.ToDo;

@Service

public class ToDoImpl implements ToDoService {
	private ToDoRepository toDoRepository;

	public ToDoImpl(ToDoRepository toDoRepository) {
		super();
		this.toDoRepository = toDoRepository;
	}

	@Override
	@Transactional
	public Iterable<ToDo> getAllToDo() {
		// TODO Auto-generated method stub
		return toDoRepository.findAll();
	}

	@Override
	@Transactional
	public Optional<ToDo> createToDo(ToDo toDo) {
		// TODO Auto-generated method stub
		return Optional.of(toDoRepository.save(toDo));
	}

}
