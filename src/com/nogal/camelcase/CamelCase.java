/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nogal.camelcase;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class CamelCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada, salida;
        boolean flagMay;
        do {
            System.out.print("introduzca un texto: ");
            entrada = sc.nextLine();
            if (entrada.equals("")) {
                break;
            }
            salida = "";
            flagMay = false;
            for (int i = 0; i < entrada.length(); i++) {
                if (entrada.charAt(i) == '-' || entrada.charAt(i) == '_') {
                    flagMay = true;
                } else {
                    if (i == 0) {
                        salida += entrada.charAt(i);
                    } else if (flagMay == true) {
                        salida += Character.toUpperCase(entrada.charAt(i));
                        flagMay = false;
                    } else {
                        salida += Character.toLowerCase(entrada.charAt(i));
                    }
                }
            }
            System.out.println(salida);
        } while (true);

    }

}
