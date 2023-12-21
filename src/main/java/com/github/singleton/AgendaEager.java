package com.github.singleton;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class AgendaEager {

    private static final AgendaEager INSTANCE = new AgendaEager();
    private Map<String, Boolean> days;

    private AgendaEager() {
        this.days = new HashMap<>();
        this.days.put("Sunday", Boolean.FALSE);
        this.days.put("Monday", Boolean.FALSE);
        this.days.put("Tuesday", Boolean.FALSE);
        this.days.put("Wednesday", Boolean.FALSE);
        this.days.put("Thursday", Boolean.FALSE);
        this.days.put("Friday", Boolean.FALSE);
        this.days.put("Saturday", Boolean.FALSE);
    }

    public static AgendaEager getInstance() {
        return INSTANCE;
    }

    public void bookAppointment(String day) {
        this.days.replace(day, Boolean.TRUE);
    }
}
