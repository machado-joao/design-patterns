package com.github.proxy;

import java.util.HashMap;
import java.util.Map;

public class PersonRepository {

    private static final Map<Long, Person> PEOPLE = new HashMap<>();
    private static Long id = 1L;

    public void save(Person person) {
        PEOPLE.put(id, person);
        id++;
    }

    public Person findById(Long id) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return PEOPLE.get(id);
    }
}
