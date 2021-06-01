/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABAProgramacionOrientadaObjetos.ej03;

/**
 *
 * @author enogal
 */
public class CentroEducativo implements Comparable<CentroEducativo> {

    private String nombre;
    private String direccion;
    private String comunidadAutonoma;

    public CentroEducativo(String nombre, String direccion, String comunidadAutonoma) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.comunidadAutonoma = comunidadAutonoma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComunidadAutonoma() {
        return comunidadAutonoma;
    }

    public void setComunidadAutonoma(String comunidadAutonoma) {
        this.comunidadAutonoma = comunidadAutonoma;
    }

    @Override
    public int compareTo(CentroEducativo o) {
        return this.nombre.compareTo(o.getNombre());
    }

}
