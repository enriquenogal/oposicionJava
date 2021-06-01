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
public class Iniciales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una frase: ");
        String frase = sc.nextLine();
        String[] palabras = frase.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print(Character.toUpperCase(palabras[i].charAt(0)));
            System.out.print(palabras[i].substring(1));
            System.out.print(" ");
        }
        System.out.println();
    }
    
}
