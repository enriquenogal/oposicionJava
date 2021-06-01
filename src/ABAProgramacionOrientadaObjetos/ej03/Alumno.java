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
public class Alumno extends Persona {
    
    private String nia;
    
    public Alumno(String nombre, LocalDate fNacimiento, String nia) {
        super(nombre, fNacimiento);
        this.nia = nia;
    }
    
}
