package com.github.singleton;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Getter
public class AgendaLazy {

    private static AgendaLazy INSTANCE;
    private Map<String, Boolean> days;

    public AgendaLazy() {
        this.days = new HashMap<>();
        this.days.put("Sunday", Boolean.FALSE);
        this.days.put("Monday", Boolean.FALSE);
        this.days.put("Tuesday", Boolean.FALSE);
        this.days.put("Wednesday", Boolean.FALSE);
        this.days.put("Thursday", Boolean.FALSE);
        this.days.put("Friday", Boolean.FALSE);
        this.days.put("Saturday", Boolean.FALSE);
    }

    public static AgendaLazy getInstance() {

        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new AgendaLazy();
        }

        return INSTANCE;
    }

    public void bookAppointment(String day) {
        this.days.replace(day, Boolean.TRUE);
    }
}
