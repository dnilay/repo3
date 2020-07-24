package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
@Document(value = "to-do")
@Data
public class ToDo {
	@Id
	private Long toDoId;
	private String todoName;
	private Boolean isCompleted;

}
