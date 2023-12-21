package com.github.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AgendaReflectionTest {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Constructor<AgendaEager> agendaEagerConstructor = AgendaEager.class.getDeclaredConstructor();
        agendaEagerConstructor.setAccessible(true);
        AgendaEager agendaEager1 = agendaEagerConstructor.newInstance();
        AgendaEager agendaEager2 = agendaEagerConstructor.newInstance();
        System.out.println(agendaEager1);
        System.out.println(agendaEager2);

        Constructor<AgendaEnum> agendaEnumConstructor = AgendaEnum.class.getDeclaredConstructor();
        agendaEnumConstructor.setAccessible(true);
        AgendaEnum agendaEnum = agendaEnumConstructor.newInstance();
        System.out.println(agendaEnum);
    }

}
