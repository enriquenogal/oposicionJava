/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABBPrograjacionJava8;

/**
 *
 * @author enrique
 */
public class Modulo {
    private String nombre;
    private String siglas;
    private int horas;
    private Ciclo ciclo;

    public Modulo(String nombre, String siglas, int horas, Ciclo ciclo) {
        this.nombre = nombre;
        this.siglas = siglas;
        this.horas = horas;
        this.ciclo = ciclo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Ciclo getCiclo() {
        return ciclo;
    }

    public void setCiclo(Ciclo ciclo) {
        this.ciclo = ciclo;
    }

    @Override
    public String toString() {
        return "Modulo{" + "nombre=" + nombre + ", siglas=" + siglas + ", horas=" + horas + ", ciclo=" + ciclo.getNombre() + '}';
    }

}
