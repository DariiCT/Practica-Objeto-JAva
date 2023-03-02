package com.generation.evaluacionjavaobjetos.models;

public class Materia {
    
    public String asignatura;
    public String nombreProfesor;
    
    public Materia() {
    }

    public Materia(String asignatura, String nombreProfesor) {
        this.asignatura = asignatura;
        this.nombreProfesor = nombreProfesor;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    @Override
    public String toString() {
        return "Materia [asignatura=" + asignatura + ", nombreProfesor=" + nombreProfesor + "]";
    }

    
    
}
