/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AACProgramacionEstructurasBasicasArrays;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class BusquedaSecuencial {

    public static int busqueda(int[] a, int n) {
        int pos = -1, i = 0;
        while (pos == -1 && i < a.length) {
            if (a[i] == n) {
                pos = i;
            }
            i++;
        }
        return pos;
    }

    public static void main(String[] args) {
        int[] a = new int[]{5, 4, 3, 2, 1, 6, 7, 8, 9, 0};
        Scanner sc = new Scanner(System.in);
        System.out.print("Número a buscar: ");
        int n = Integer.parseInt(sc.nextLine());
        int pos = busqueda(a,n);
        if (pos!=-1) {
            System.out.println("Encontrado en la posición " + pos);
        } else {
            System.out.println("No encontrado");
        }
    }

}
