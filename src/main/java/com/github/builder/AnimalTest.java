package com.github.builder;

public class AnimalTest {

    public static void main(String[] args) {

        Animal animal = Animal.builder().name("Apollo").age(1).color("Yellow").isDomesticated(Boolean.TRUE).build();
        System.out.println(animal);
    }

}
