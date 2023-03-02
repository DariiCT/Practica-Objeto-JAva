package com.generation.evaluacionjavaobjetos.models;

public class Cursos {

    public String nombreAlumno;
    public String numeroDelCurso;
    public Integer cantidadDeAlum;
   
    public Cursos() {
    }

    public Cursos(String nombreAlumno, String numeroDelCurso, Integer cantidadDeAlum) {
        this.nombreAlumno = nombreAlumno;
        this.numeroDelCurso = numeroDelCurso;
        this.cantidadDeAlum = cantidadDeAlum;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getNumeroDelCurso() {
        return numeroDelCurso;
    }

    public void setNumeroDelCurso(String numeroDelCurso) {
        this.numeroDelCurso = numeroDelCurso;
    }

    public Integer getCantidadDeAlum() {
        return cantidadDeAlum;
    }

    public void setCantidadDeAlum(Integer cantidadDeAlum) {
        this.cantidadDeAlum = cantidadDeAlum;
    }

    @Override
    public String toString() {
        return "Cursos [nombreAlumno=" + nombreAlumno + ", numeroDelCurso=" + numeroDelCurso + ", cantidadDeAlum="
                + cantidadDeAlum + "]";
    }




    
    


    
}
