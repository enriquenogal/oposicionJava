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
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el límite que quiere alcanzar: ");
        int limite = Integer.parseInt(sc.nextLine());
        String s1 = fibonacciIterator(limite);
        System.out.println(s1);
        String s2 = fibonacciRecursivo(limite, 0, 0, "0");
        System.out.println(s2);
    }
    


    public static String fibonacciIterator(int limite) {
        String s = "0";
        int anterior1 = 0;
        int anterior2 = 0;
        int suma = 1;
        while (suma <= limite) {
            s = s + "," + suma;
            anterior1 = anterior2;
            anterior2 = suma;
            suma = anterior1 + anterior2;
        }
        return s;
    }

    public static String fibonacciRecursivo(int limite, int anterior1, int anterior2, String s) {
        int suma;
        if (anterior1+anterior2 == 0) {
            suma=1;
        } else {
            suma=anterior1+anterior2;
        }
        if (suma > limite) {
            return s; 
        } else if (suma==limite){
            return s+","+suma;
        } else {
            return fibonacciRecursivo(limite, anterior2, suma, s+","+suma);
        }
    }

}
