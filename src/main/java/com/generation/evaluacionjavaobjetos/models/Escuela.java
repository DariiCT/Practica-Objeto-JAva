package com.generation.evaluacionjavaobjetos.models;

public class Escuela {

    public String alumnos;
    public String asignatura;
    public String curso;
    public String profesorJefe;
    
    public Escuela() {
    }

    public Escuela(String alumnos, String asignatura, String curso, String profesorJefe) {
        this.alumnos = alumnos;
        this.asignatura = asignatura;
        this.curso = curso;
        this.profesorJefe = profesorJefe;
    }

    public String getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String alumnos) {
        this.alumnos = alumnos;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfesorJefe() {
        return profesorJefe;
    }

    public void setProfesorJefe(String profesorJefe) {
        this.profesorJefe = profesorJefe;
    }

    @Override
    public String toString() {
        return "Escuela [alumnos=" + alumnos + ", asignatura=" + asignatura + ", curso=" + curso + ", profesorJefe="
                + profesorJefe + "]";
    }


    
    
}
