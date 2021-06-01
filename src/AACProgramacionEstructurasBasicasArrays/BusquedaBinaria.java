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
public class BusquedaBinaria {

    public static int busqueda(int[] a, int n) {
        int pos = -1;
        int inicio = 0;
        int fin = a.length - 1;
        int medio, compara;
        while (pos == -1 && inicio != fin) {
            medio = ((fin - inicio) / 2) + inicio;
            compara = a[medio];
            if (n == compara) {
                pos = medio;
            } else {
                if (compara > n) {
                    fin = medio - 1;
                }
                if (compara < n) {
                    inicio = medio + 1;
                }
                if (inicio == fin && n == a[inicio]) {
                    pos = inicio;
                }
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int[] a = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Número a buscar: ");
        int n = Integer.parseInt(sc.nextLine());
        int pos = busqueda(a, n);
        if (pos != -1) {
            System.out.println("Encontrado en la posición " + pos);
        } else {
            System.out.println("No encontrado");
        }
    }

}
