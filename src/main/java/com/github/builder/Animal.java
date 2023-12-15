package com.github.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Animal {

    private String name;
    private Integer age;
    private String color;
    private Boolean isDomesticated;
}
