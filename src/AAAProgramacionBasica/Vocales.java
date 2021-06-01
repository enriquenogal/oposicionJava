/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AAAProgramacionBasica;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Vocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame una frase: ");
        String s = sc.nextLine();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) == 'a'
                    || Character.toLowerCase(s.charAt(i)) == 'e'
                    || Character.toLowerCase(s.charAt(i)) == 'i'
                    || Character.toLowerCase(s.charAt(i)) == 'o'
                    || Character.toLowerCase(s.charAt(i)) == 'u') {
                c++;
            }
        }
        System.out.println("El número de vocales de la frase introducida es: " + c);
    }
}
