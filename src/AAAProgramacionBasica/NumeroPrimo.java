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
public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un número: ");
        int n = Integer.parseInt(sc.nextLine());

        if (esPrimo(n)) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
    
    public static boolean esPrimo(int n){
        boolean primo=true;
        int i=2;
        while (primo==true && i<n) {
            if ((n%i)==0) primo = false;
            i++;
        }
        return primo;
    }
    
}
