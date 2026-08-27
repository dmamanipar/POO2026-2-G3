package pe.edu.upeu.enums;

import lombok.Getter;


public enum DiasSemana {
    DOMINGO ("Domingo"),
    LUNES("Lunes"),
    MARTES("Martes"),
    MIERCOLES ("Miercoles"),
    JUEVES("Jueves"),
    VIERNES("Viernes"),
    SABADO("Sábado");

    String nombreDias;

    DiasSemana(String nombreDias) {
        this.nombreDias = nombreDias;
    }

    public String getNombreDias() {
        return nombreDias;
    }
}
