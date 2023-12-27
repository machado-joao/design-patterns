package com.github.proxy;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Builder
@Getter
@ToString
public class Person {

    private String name;
    private String surname;
    private LocalDate birth;
}
