package com.github.proxy;

import java.time.LocalDate;

public class PersonTest {

    public static void main(String[] args) {

        // PersonService personService = new PersonService(new PersonRepository());
        PersonService personService1 = new PersonService(new PersonRepositoryProxy());

        Person person1 = Person.builder().name("João").surname("Machado").birth(LocalDate.of(2002, 5, 29)).build();
        personService1.save(person1);
        Person savedPerson1 = personService1.findById(1L);
        System.out.println(savedPerson1);

        PersonService personService2 = new PersonService(new NewPersonRepositoryProxy());

        Person person2 = Person.builder().name("Letícia").surname("Castro").birth(LocalDate.of(1994, 9, 16)).build();
        personService2.save(person2);
        Person savedPerson2 = personService2.findById(2L);
        System.out.println(savedPerson2);
    }

}
