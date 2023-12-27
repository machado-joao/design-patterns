package com.github.proxy;

public class PersonService {

    private final PersonRepositoryProxy personRepositoryProxy;

    public PersonService(PersonRepositoryProxy personRepositoryProxy) {
        this.personRepositoryProxy = personRepositoryProxy;
    }

    public void save(Person person) {
        this.personRepositoryProxy.save(person);
    }

    public Person findById(Long id) {
        return this.personRepositoryProxy.findById(id);
    }
}
