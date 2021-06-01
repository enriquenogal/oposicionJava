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
public class Ahorcado {

    public static String[] palabras = new String[]{"pepe", "juan", "manuela"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Elija un número del 1 al 3: ");
        int nPalabra = Integer.parseInt(sc.nextLine());
        String palabra = palabras[nPalabra - 1];
        int intentos = 10;
        int aciertos = 0;
        int longitud = palabra.length();
        boolean resuelto = false;
        String palabraFake = "", aux;
        for (int i = 0; i < longitud; i++) {
            palabraFake += "*";
        }
        String letra;

        System.out.println("La palabra tiene " + longitud + " letras");

        while (resuelto == false && intentos > 0) {
            System.out.println("Le quedan " + intentos + " intentos");
            System.out.println(palabraFake);
            System.out.print("Introduzca una letra: ");
            letra = sc.nextLine();
            if (palabra.contains(letra)) {
                System.out.println("ACIERTO");
                aux = "";
                for (int i = 0; i < palabraFake.length(); i++) {
                    if (palabra.charAt(i) == letra.charAt(0)) {
                        aciertos++;
                        aux += letra;
                    } else {
                        aux += palabraFake.charAt(i);
                    }
                }
                palabraFake = aux;
            } else {
                System.out.println("ERROR");
                intentos--;
            }
            if (aciertos == longitud) {
                resuelto = true;

            }
        }
        if (resuelto) {
            System.out.println("Enhorabuena ha encontrado la palabra");
            System.out.println(palabra);
        } else {
            System.out.println("No ha sido capaz de encontrar la palabra");
            System.out.println(palabra);
        }
    }

}
