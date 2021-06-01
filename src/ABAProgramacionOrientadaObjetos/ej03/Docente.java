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
public class Docente extends Persona{
    private String idProfesor;
    private String cuerpo;
    private String especialidad;

    public Docente(String idProfesor, String cuerpo, String especialidad, String nombre, LocalDate fNacimiento) {
        super(nombre, fNacimiento);
        this.idProfesor = idProfesor;
        this.cuerpo = cuerpo;
        this.especialidad = especialidad;
    }
}
