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
public class Palindromo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una palabra: ");
        String palabra = sc.nextLine();
        if (palindromo(palabra)) {
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
    }

    public static boolean palindromo(String s) {
        String aux = "";
        for (int i = 0; i < s.length(); i++) {
            aux = s.charAt(i) + aux;
        }
        if (aux.equals(s)) {
            return true;
        } else {
            return false;
        }
    }

}
