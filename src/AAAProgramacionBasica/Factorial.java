/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AAAProgramacionBasica;

import static AAAProgramacionBasica.Fibonacci.fibonacciIterator;
import static AAAProgramacionBasica.Fibonacci.fibonacciRecursivo;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca número del cual hallar el factorial: ");
        int n = Integer.parseInt(sc.nextLine());
        int r1 = factorialIterator(n);
        System.out.println("Resultado " + r1);
        int r2 = factorialRecursivo(n);
        System.out.println("Resultado " + r2);
    }
    
    public static int factorialIterator(int n) {
        int resultado=1;
        for (int i = 1; i <= n; i++) {
            resultado=resultado*i;
        }
        return resultado;
    }
    public static int factorialRecursivo(int n) {
        if (n<=1) return 1;
        else return n*factorialRecursivo(n-1);
    }
    
}
