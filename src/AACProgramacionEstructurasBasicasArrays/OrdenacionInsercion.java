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
public class OrdenacionInsercion {

    public static void main(String[] args) {
        int[] entrada = new int[]{5,4,3,2,1,6,7,8,9,0};
        int[] salida = new int[entrada.length];
        int numeroOrdenar;
        int posInsertar;
        int j;

        salida[0] = entrada[0];
        for (int i = 1; i < entrada.length; i++) {
            numeroOrdenar = entrada[i];
            posInsertar = -1;
            j = 0;
            while (posInsertar == -1 && j < entrada.length) {
                if (salida[j]>numeroOrdenar) posInsertar=j;
                j++;
            }
            if (posInsertar == -1) {
                salida[i]=numeroOrdenar;
            } else {
                for (int k = entrada.length-1; k > posInsertar; k--) {
                    salida[k]=salida[k-1];
                }
                salida[posInsertar]=numeroOrdenar;
            }
        }

        for (int i = 0; i < salida.length; i++) {
            System.out.print(salida[i] + " ");
        }
        System.out.println();
    }

}
