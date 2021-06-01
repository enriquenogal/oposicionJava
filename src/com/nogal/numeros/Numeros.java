/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nogal.numeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Numeros {

    public static void main(String[] args) {
        int[] numeros = new int[20];
        int[] primos = null;
        int[] compuestos = null;
        int nPrimos = 0, nCompuestos = 0;
        int aux;
        boolean valido;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            do {
                System.out.print("Introduzca un número (" + (i + 1) + "): ");
                aux = Integer.parseInt(sc.nextLine());
                valido = esValido(aux, numeros);
            } while (!valido);
            numeros[i] = aux;
            if (esPrimo(aux)) {
                nPrimos++;
            } else {
                nCompuestos++;
            }
        }
        primos = new int[nPrimos];
        compuestos = new int[nCompuestos];
        separar(numeros, primos, compuestos);
        System.out.println("Primos");
        mostrarDescendente(primos);
        System.out.println("Compuestos");
        mostrarAscendente(compuestos);     
    }

    public static void separar(int[] numeros, int[] primos, int[] compuestos) {
        int nPrimos = 0;
        int nCompuestos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                primos[nPrimos] = numeros[i];
                nPrimos++;
            } else {
                compuestos[nCompuestos] = numeros[i];
                nCompuestos++;
            }
        }
    }

    public static void mostrarDescendente(int[] n) {
        Arrays.sort(n);
        System.out.print("Longitud: " + n.length + ":: ");
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }

    public static void mostrarAscendente(int[] n) {
        Arrays.sort(n);
        System.out.print("Longitud: " + n.length + ":: ");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }

    public static boolean esPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean esValido(int num, int[] numeros) {
        if (num <= 0) {
            return false;
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                return false;
            }
        }
        return true;
    }

}
