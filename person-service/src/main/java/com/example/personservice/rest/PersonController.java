package com.example.personservice.rest;

import com.example.personservice.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/persons")
    public ResponseEntity<Person> getPerson()
    {
        Person person=Person.builder().build();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setEmail("john@luv2code.com");
        return new ResponseEntity<>(person, HttpStatus.OK);
    }
}
