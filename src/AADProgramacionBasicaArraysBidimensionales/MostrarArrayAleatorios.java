/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AADProgramacionBasicaArraysBidimensionales;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class MostrarArrayAleatorios {

    public static final int DIM = 5;
    public static final int INI = 0;
    public static final int FIN = 9;

    public static void mostrarPosicion(int[][] a, int i, int j) {
        System.out.println(a[i][j]);
    }

    public static void mostrarArrayBidimensional(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void rellenarAleatorios(int[][] a, int inicio, int fin) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = aleatorio(inicio, fin);
            }
        }
    }

    public static int aleatorio(int inicio, int fin) {
        int resultado = 0;
        resultado = inicio + (int) Math.floor(Math.random() * ((fin + 1) - inicio));
        return resultado;
    }

    public static int[][] trasponer(int[][] a) {
        int[][] t = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                t[i][j] = a[j][i];
            }
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[DIM][DIM];
        rellenarAleatorios(a, 0, 9);
        mostrarArrayBidimensional(a);
        System.out.println("--------------------------");
        mostrarArrayBidimensional(trasponer(a));
        System.out.println("------------");
        System.out.println("Dame la posición a mostrar: ");
        int i = Integer.parseInt(sc.nextLine());
        int j = Integer.parseInt(sc.nextLine());
        while (i >= 0 && i < DIM && j >= 0 && j < DIM) {
            mostrarPosicion(a, i, j);
            System.out.println("Dame la posición a mostrar: ");
            i = Integer.parseInt(sc.nextLine());
            j = Integer.parseInt(sc.nextLine());
        }

    }

}
