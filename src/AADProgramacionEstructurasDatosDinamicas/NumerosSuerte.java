/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AADProgramacionEstructurasDatosDinamicas;

import java.util.ArrayList;

/**
 *
 * @author enrique
 */
public class NumerosSuerte {

    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * (max + 1 - min) + min);
    }

    public static void main(String[] args) {
        int n = 120, n1 = 0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> aux = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            al.add(aleatorio(1, 100));
        }
        n1 = aleatorio(2, 10);
        System.out.println("Aleatorio inicial: " + n1);
        while (n1 <= al.size()) {
            System.out.println("Números: " + al.toString());
            aux = new ArrayList<Integer>();
            for (int i = 0; i < al.size(); i++) {
                if ((i + 1) % n1 == 1) {
                    System.out.println("borro posicion: " + (i + 1));
                } else {
                    aux.add(al.get(i));
                }
            }
            al = aux;
            n1 = aleatorio(2, 10);
            System.out.println("Aleatorio: " + n1);
        }
        System.out.println("Números finales: " + al.toString());
    }
}
