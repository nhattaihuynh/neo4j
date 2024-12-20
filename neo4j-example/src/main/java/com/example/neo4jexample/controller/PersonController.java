package com.example.neo4jexample.controller;

import com.example.neo4jexample.entity.Person;
import com.example.neo4jexample.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
    
    @Autowired
    private PersonRepository personRepository;
    
    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }
    
    @GetMapping
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
