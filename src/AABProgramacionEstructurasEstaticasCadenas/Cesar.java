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
public class Cesar {

    public static final String abc = "abcdefghijklmnñopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una frase: ");
        String entrada = sc.nextLine();
        System.out.print("Introduzca un desplazamiento: ");
        int d = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce C para cifrar y D para descifrar: ");
        String resp = sc.nextLine();
        if (resp.equalsIgnoreCase("D")) {
            d = d * -1;
        }
        System.out.println(cesar(entrada, d));
    }

    public static String cesar(String entrada, int d) {
        String salida = "";
        int posEntrada;
        int posSalida;
        for (int i = 0; i < entrada.length(); i++) {
            posEntrada = abc.indexOf(entrada.charAt(i));
            if (posEntrada != -1) {
                posSalida = (posEntrada + d);
                if (posSalida<0) {
                    posSalida=abc.length()+posSalida;
                }
                posSalida=posSalida%abc.length();
                salida += abc.charAt(posSalida);
            } else {
                salida += entrada.charAt(i);
            }
        }
        return salida;
    }
}
