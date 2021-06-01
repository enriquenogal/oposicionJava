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
public class FactoresPrimos {

    public static boolean esPrimo(int n) {
        boolean primo = true;
        int i = 2;
        while (primo == true && i < n) {
            if ((n % i) == 0) {
                primo = false;
            }
            i++;
        }
        return primo;
    }

    public static void main(String[] args) {

        int i;
        boolean division;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un número: ");
        int n = Integer.parseInt(sc.nextLine());

        while (n > 1) {
            if (esPrimo(n)) {
                System.out.println(n+".");
                n = 1;
            } else {
                i = 2;
                division = false;
                while (division == false) {
                    if ((esPrimo(i)) && (n % i == 0)) {
                        n = n / i;
                        division = true;
                        System.out.print(i+",");
                    } else {
                        i++;
                    }
                }
            }
        }

    }

}
