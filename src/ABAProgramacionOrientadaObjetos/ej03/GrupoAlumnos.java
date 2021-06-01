/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABAProgramacionOrientadaObjetos.ej03;

import java.util.HashMap;

/**
 *
 * @author enogal
 */
public abstract class GrupoAlumnos implements Comparable<GrupoAlumnos>{
    private int numeroAlumnos;
    private Alumno[] alumnos;
    private String titulacion;
    private int curso;
    private CentroEducativo centroEducativo;
    private HashMap<String,Docente> asignacionModulos;

    public GrupoAlumnos(int numeroAlumnos, Alumno[] alumnos, String titulacion, int curso, CentroEducativo centroEducativo) {
        this.numeroAlumnos = numeroAlumnos;
        this.alumnos = alumnos;
        this.titulacion = titulacion;
        this.curso = curso;
        this.centroEducativo = centroEducativo;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public CentroEducativo getCentroEducativo() {
        return centroEducativo;
    }

    public void setCentroEducativo(CentroEducativo centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    public HashMap<String, Docente> getAsignacionModulos() {
        return asignacionModulos;
    }

    public void setAsignacionModulos(HashMap<String, Docente> asignacionModulos) {
        this.asignacionModulos = asignacionModulos;
    }

    
   
    @Override
    public int compareTo(GrupoAlumnos o){
        return (this.numeroAlumnos-o.getNumeroAlumnos());
    }
}
