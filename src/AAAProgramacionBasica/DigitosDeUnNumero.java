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
public class DigitosDeUnNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un número: ");
        int n = Integer.parseInt(sc.nextLine());
        int suma = sumaDigitos(n);
        System.out.println("Suma de sus dígitos: " + suma);
        int suma2 = sumaDigitosSecuencial(n);
        System.out.println("Suma de sus dígitos: " + suma2);
    }

    public static int sumaDigitos(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumaDigitos(n / 10);
        }
    }

    public static int sumaDigitosSecuencial(int n) {
        int suma = 0;
        while (n > 0) {
            suma += n % 10;
            n = n / 10;
        }
        return suma;
    }
}
