package com.example.demo3.service;

import com.example.demo3.model.Person;
import com.example.demo3.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository PersonRepository;

    public Person savePerson(Person Person) {
        return PersonRepository.save(Person);
    }

    public List<Person> getAllPersons() {
        return PersonRepository.findAll();
    }
}
