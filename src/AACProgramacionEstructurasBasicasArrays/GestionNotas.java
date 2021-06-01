/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AACProgramacionEstructurasBasicasArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class GestionNotas {

    public static double[] introNotas(Scanner sc) {
        double[] notas;
        System.out.print("Cuantos alumnos tiene: ");
        int n = Integer.parseInt(sc.nextLine());
        notas = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce la nota del alumno " + (i + 1) + ": ");
            notas[i] = Double.parseDouble(sc.nextLine());
        }
        return notas;
    }

    public static void mostrarNotas(double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();
    }

    public static int buscarNota(double n, double[] notas) {
        int pos = -1;
        int i = 0;
        while (pos == -1 && i < notas.length) {
            if (notas[i] == n) {
                pos = i + 1;
            }
            i++;
        }
        return pos;
    }
    
    public static double media(double[] notas){
        double acum=0;
        for (double n:notas){
            acum+=n;
        }
        return acum/notas.length;
    }
    
    public static double aprobados(double[] notas){
        double acum=0;
        for (double n:notas){
            if (n>=5) acum++;
        }
        return acum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = introNotas(sc);
        mostrarNotas(notas);
        Arrays.sort(notas);
        double[] notasOrden= Arrays.copyOf(notas, notas.length);
        mostrarNotas(notasOrden);
        System.out.print("Introduzca una nota a buscar: ");
        double n = Double.parseDouble(sc.nextLine());
        int pos = buscarNota(n, notas);
        if (pos != -1) {
            System.out.println("Encontrada en la posición " + pos);
        } else {
            System.out.println("Nota no encontrada");
        }
        System.out.println("Media: " + media(notas));
        System.out.println("Aprobados: " + aprobados(notas));
        System.out.println("Nota más alta: " + notasOrden[notasOrden.length-1]);
    }
}
