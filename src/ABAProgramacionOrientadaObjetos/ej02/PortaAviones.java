/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABAProgramacionOrientadaObjetos.ej02;

/**
 *
 * @author enogal
 */
public class PortaAviones extends Barco {
    int numeroAviones;
    int numeroMarinos;

    public PortaAviones(int numeroAviones, int numeroMarinos) {
        this.numeroAviones = numeroAviones;
        this.numeroMarinos = numeroMarinos;
        System.out.println("Número aviones: " + this.numeroAviones);
        System.out.println("Número marinos: " + this.numeroMarinos);
    }
    
    
    
}
