/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABAProgramacionOrientadaObjetos.ej05;

/**
 *
 * @author enogal
 */
public class Serie implements Entregable {

    private String titulo = "GOT";
    private int nTemporadas = 3;
    private boolean entregado = false;
    private String genero = "DRAMA";
    private String creador = "Scott";

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.nTemporadas = nTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public Serie(String titulo, int nTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.nTemporadas = nTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", nTemporadas=" + nTemporadas + ", entregado=" + entregado + ", genero=" + genero + ", creador=" + creador + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getnTemporadas() {
        return nTemporadas;
    }

    public void setnTemporadas(int nTemporadas) {
        this.nTemporadas = nTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object o) {
        Serie s = (Serie) o;
        return this.nTemporadas - s.getnTemporadas();
    }

}
