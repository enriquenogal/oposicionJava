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
public class BarcoPasajeros extends Barco{
    double metrosEslora;
    int numeroCamas;

    public BarcoPasajeros(double metrosEslora, int numeroCamas) {
        this.metrosEslora = metrosEslora;
        this.numeroCamas = numeroCamas;
        System.out.println("Metros eslora: " + this.metrosEslora);
        System.out.println("Número camas: " + this.numeroCamas);
    }
    
}
