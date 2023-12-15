package com.github.builder;

public class Person {

    private Long id;
    private String name;
    private String surname;

    private Person(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("Full name: %s %s", name, surname);
    }

    static class PersonBuilder {

        private Long id;
        private String name;
        private String surname;

        public PersonBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Person build() {
            return new Person(id, name, surname);
        }
    }
}
