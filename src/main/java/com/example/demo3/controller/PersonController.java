package com.example.demo3.controller;

import com.example.demo3.model.Person;
import com.example.demo3.service.PersonService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Persons")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService PersonService;

@GetMapping
    public List<Person> getAllPersons() {
	
		System.out.println("get knkm");
        return PersonService.getAllPersons();
    }

@PostMapping
    public Person createPerson(@RequestBody Person Person) {
		System.out.println("post knkam");
        return PersonService.savePerson(Person);
    }
}
