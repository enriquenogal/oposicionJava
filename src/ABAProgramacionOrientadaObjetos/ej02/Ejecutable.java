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
public class Ejecutable {

    public static void main(String[] args) {
        Barco[] b = new Barco[3];
        b[0] = new BarcoPasajeros(50, 300);
        b[1] = new PortaAviones(30, 600);
        b[2] = new BarcoPesquero(30.0d, 500.0d, 6);
        for (int i = 0; i < b.length; i++) {
            b[i].alarma();
            b[i].mensajeSocorro("Mensaje desde el barco " + i);
        }

    }

}
