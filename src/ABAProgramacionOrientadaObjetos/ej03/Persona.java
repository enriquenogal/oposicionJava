/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABAProgramacionOrientadaObjetos.ej03;

import java.time.LocalDate;

/**
 *
 * @author enogal
 */
public class Persona implements Comparable<Persona>{
    private String nombre;
    private LocalDate fNacimiento;

    public Persona(String nombre, LocalDate fNacimiento) {
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    @Override
    public int compareTo(Persona o) {
        return (this.fNacimiento.compareTo(o.getfNacimiento()));
    }
    
    
    
}
