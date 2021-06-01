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
public class EcuacionCuadratica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame los valores a, b, c de la ecuación cuadrática");
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());

        double discriminante = (b * b) - (4 * a * c);

        if (discriminante < 0) {
            System.out.println("No tiene soluciones");
        } else if (discriminante == 0) {
            double resultado = (-b) / (2 * a);
            System.out.println("Resultado: " + resultado);
        } else {
            double resultado1 = ((-b) + (Math.sqrt(discriminante))) / (2 * a);
            double resultado2 = ((-b) - (Math.sqrt(discriminante))) / (2 * a);
            System.out.println("Resultado 1: " + resultado1);
            System.out.println("Resultado 2: " + resultado2);
        }

    }
}
