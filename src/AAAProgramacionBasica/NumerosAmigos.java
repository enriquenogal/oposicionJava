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
public class NumerosAmigos {

    public static int sumaDivisores(int n) {
        int suma = 0;
        for (int i = n - 1; i > 0; i--) {
            if ((n % i) == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime el primer número: ");
        int n1 = Integer.parseInt(sc.nextLine());
        System.out.print("Dime el segundo número: ");
        int n2 = Integer.parseInt(sc.nextLine());

        if ((sumaDivisores(n1) == n2) && (sumaDivisores(n2) == n1)) {
            System.out.println("Son números amigos");
        } else {
            System.out.println("No son números amigos");
        }

    }

}
