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
public class Contrasenna {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una contraseña: ");
        String contrasenna = sc.nextLine();
        boolean correcta = true;
        int contMayusculas = 0, contMinusculas = 0, contNumeros = 0, contLetras = 0, contEspecial = 0;

        if (contrasenna.length() < 8) {
            correcta = false;
        } else {
            for (int i = 0; i < contrasenna.length(); i++) {
                if (Character.isLowerCase(contrasenna.charAt(i))) {
                    contMinusculas++;
                }
                if (Character.isDigit(contrasenna.charAt(i))) {
                    contNumeros++;
                }
                if (Character.isLetter(contrasenna.charAt(i))) {
                    contLetras++;
                }                
            }
            contMayusculas = contLetras - contMinusculas;
            contEspecial = contrasenna.length() - contLetras - contNumeros;
            if (contMayusculas==0 || contMinusculas==0 || contNumeros==0 || contLetras==0 || contEspecial==0) {
                correcta=false;
            }
        }
        if (correcta) {
            System.out.println("Contraseña correcta");
        } else {
            System.out.println("Contraseña incorrecta, debe tener una longitud de al menos ocho caracteres y debe contener letras, números, caracteres especiales, mayúsculas y minúsculas");
        }
    }
}
