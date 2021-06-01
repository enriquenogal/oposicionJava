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
public class BarcoPesquero extends Barco{
    double metrosEslora;
    double potencia;
    int numeroPescadores;

    public BarcoPesquero(double metrosEslora, double potencia, int numeroPescadores) {
        this.metrosEslora = metrosEslora;
        this.potencia = potencia;
        this.numeroPescadores = numeroPescadores;
        System.out.println("Metros eslora: " + this.metrosEslora);
        System.out.println("Potencia: " + this.potencia);
        System.out.println("Número Pescadores: " + this.numeroPescadores);
    }
}
