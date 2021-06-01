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
public class NumeroApocaliptico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un número: ");
        double n = Double.parseDouble(sc.nextLine());
        n = Math.pow(2, n);
        String s = Double.toString(n);
        System.out.println("2 elevado a n es: "+ s);
        if (s.contains("666")) {
            System.out.println("Es un número apocalíptico");
        } else {
            System.out.println("No es un número apocalíptico");
        }
        
    }
    
}
