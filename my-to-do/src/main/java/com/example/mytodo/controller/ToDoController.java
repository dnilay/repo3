package com.example.mytodo.controller;

import com.example.mytodo.dto.ToDoDto;
import com.example.mytodo.model.ToDo;
import com.example.mytodo.model.dao.ToDoDao;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.modelmapper.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

@RestController
public class ToDoController {
    private ToDoDao toDoDao;

    public ToDoController(ToDoDao toDoDao) {
        this.toDoDao = toDoDao;
    }
    @RequestMapping("/todos")
    public Iterable<ToDoDto> getAllToDos()
    {
        ModelMapper mapper=new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        Type listType = new TypeToken<List<ToDoDto>>(){}.getType();
        List<ToDoDto> postDtoList = mapper.map(toDoDao.findAll(),listType);
        return postDtoList;
    }
}
