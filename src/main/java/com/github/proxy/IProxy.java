package com.github.proxy;

public interface IProxy {

    void save(Person person);

    Person findById(Long id);
}
