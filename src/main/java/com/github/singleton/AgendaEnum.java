package com.github.singleton;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public enum AgendaEnum {

    INSTANCE;

    private Map<String, Boolean> days;

    private AgendaEnum() {
        this.days = new HashMap<>();
        this.days.put("Sunday", Boolean.FALSE);
        this.days.put("Monday", Boolean.FALSE);
        this.days.put("Tuesday", Boolean.FALSE);
        this.days.put("Wednesday", Boolean.FALSE);
        this.days.put("Thursday", Boolean.FALSE);
        this.days.put("Friday", Boolean.FALSE);
        this.days.put("Saturday", Boolean.FALSE);
    }

    public static AgendaEnum getInstance() {
        return INSTANCE;
    }

    public void bookAppointment(String day) {
        this.days.replace(day, Boolean.TRUE);
    }
}
