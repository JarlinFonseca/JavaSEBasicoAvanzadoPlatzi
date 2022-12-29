package com.anncode.enumerations;

public enum Days {
    SUNDAY("Domingo"),
    MONDAY("Lunes"),
    TUESDAY("Martes"),
    WEDNESDAY("Miercoles"),
    THURSDAY("Jueves"),
    FRIDAY("Viernes"),
    SATURDAY("Sabado");

    private final String spanish;
    private  Days(String spanish) {

        this.spanish = spanish;

    }

    public String getSpanish() {
        return spanish;

    }
}
