package com.example.mytodo.model.dao;

import com.example.mytodo.model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoDao extends CrudRepository<ToDo,Integer> {
}
