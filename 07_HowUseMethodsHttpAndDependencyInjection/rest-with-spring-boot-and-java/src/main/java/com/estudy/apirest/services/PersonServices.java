package com.estudy.apirest.services;

import com.estudy.apirest.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findall(){
        logger.info("FINDING ALL people!");
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            personList.add(person);
        }
        return personList;
    }

    public Person findById(String id) {
        logger.info("FINDING ONE person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFistName("Guilherme");
        person.setLastName("Prata");
        person.setAddress("Recife - Pernambuco - Brasil");
        person.setGender("Male");

        return person;
    }

    public Person create(Person person) {
        logger.info("CREATING one person!");

        return person;
    }

    public Person update(Person person) {
        logger.info("UPDATING one person!");

        return person;
    }

    public void delete(String id) {
        logger.info("DELETING one person!");
    }

   private Person mockPerson(int i) {

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFistName("Person name " + i);
        person.setLastName("Last name " + i);
        person.setAddress("Some address in Brasil " + i);
        person.setGender("Male");

        return person;
    }

}
