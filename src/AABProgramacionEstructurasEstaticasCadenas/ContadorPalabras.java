/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AABProgramacionEstructurasEstaticasCadenas;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class ContadorPalabras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una frase: ");
        String frase = sc.nextLine().trim();
        String[] palabras = frase.split(" ");
        System.out.println("Número de palabras: " + palabras.length);
        int nPalabras = 1;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ' && frase.charAt(i-1)!=' ') {
                nPalabras++;
            }
        }
        System.out.println("Número de palabras: " + nPalabras);

    }

}
