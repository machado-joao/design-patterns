package com.github.singleton;

public class AgendaTest {

    public static void main(String[] args) {

        bookAppointmentEager("Saturday");
        bookAppointmentEager("Sunday");
        bookAppointmentLazy("Friday");
        bookAppointmentLazy("Saturday");
    }

    public static void bookAppointmentEager(String day) {
        AgendaEager agenda = AgendaEager.getInstance();
        agenda.bookAppointment(day);
        System.out.println(agenda.getDays());
    }

    public static void bookAppointmentLazy(String day) {
        AgendaLazy agenda = AgendaLazy.getInstance();
        agenda.bookAppointment(day);
        System.out.println(agenda.getDays());
    }

}
