package com.github.proxy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public class PersonRepositoryProxy extends PersonRepository implements IProxy {

    private static final Logger LOGGER = Logger.getLogger(PersonRepositoryProxy.class.getName());
    private final Map<Long, Person> CACHE = new HashMap<>();

    @Override
    public void save(Person person) {
        LOGGER.info("Saving person to the database...");
        super.save(person);
        LOGGER.info("Person saved successfully!");
    }

    @Override
    public Person findById(Long id) {
        LOGGER.info("Searching person...");

        if (Objects.nonNull(CACHE.get(id))) {
            LOGGER.info("Getting data from cache...");
            return CACHE.get(id);
        }

        Person person = super.findById(id);
        CACHE.put(id, person);
        return person;
    }
}
