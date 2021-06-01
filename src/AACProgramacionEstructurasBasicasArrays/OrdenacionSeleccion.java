/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AACProgramacionEstructurasBasicasArrays;

/**
 *
 * @author enrique
 */
public class OrdenacionSeleccion {

    public static void main(String[] args) {
        int[] entrada = new int[]{5, 4, 3, 2, 1, 6, 7, 8, 9, 0};
        int[] salida = new int[entrada.length];
        boolean[] usado = new boolean[entrada.length];
        int menor, posMenor;

        for (int i = 0; i < salida.length; i++) {
            menor = Integer.MAX_VALUE;
            posMenor = 0;
            for (int j = 0; j < 10; j++) {
                if (entrada[j] < menor && usado[j] == false) {
                    menor = entrada[j];
                    posMenor = j;
                }
            }
            salida[i] = menor;
            usado[posMenor] = true;
        }
        for (int i = 0; i < salida.length; i++) {
            System.out.print(salida[i] + " ");
        }
        System.out.println();
    }

}
