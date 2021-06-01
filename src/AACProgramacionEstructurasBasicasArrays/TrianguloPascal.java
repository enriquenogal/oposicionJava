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
public class TrianguloPascal {

    public static final int T = 10;

    public static void pascal1() {
        int[][] pascal = new int[T][T];
        for (int i = 0; i < T; i++) {
            pascal[i][0] = 1;
        }
        for (int i = 1; i < T; i++) {
            for (int j = 1; j < T; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }
        for (int i = 0; i < T; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void pascal2() {
        int numero;
        for (int linea = 1; linea <= T; linea++) {
            numero = 1;
            for (int i = 1; i <= linea; i++) {
                System.out.print(numero + "\t");
                numero = numero * (linea - i) / i;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("-------------");
        pascal1();
        System.out.println("-------------");
        pascal2();
    }

}
