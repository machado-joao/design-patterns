package com.github.builder;

public class PersonTest {

    public static void main(String[] args) {

        // Person person = new Person(1L, "João", "Machado");
        Person person = new Person.PersonBuilder().id(1L).name("João").surname("Machado").build();
        System.out.println(person);
    }

}
