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
public class IntToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduce un número: ");
            n = Integer.parseInt(sc.nextLine());
            System.out.println("Binario: " + Integer.toBinaryString(n));
            System.out.println("Binario: " + devuelveBinario(n));
        } while (n != 0);
    }

    public static String devuelveBinario(int n) {
        String binario = "";
        int i = 0;
        int r = 0;
        while (n > 0) {
            r = n % 2;
            if (r == 0) {
                binario = "0" + binario;
            } else {
                binario = "1" + binario;
            }
            //n = n - r * (int)Math.pow(2, i);
            n = n / 2;
            i++;
        }
        return binario;
    }
}
