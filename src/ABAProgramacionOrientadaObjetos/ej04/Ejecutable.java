/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABAProgramacionOrientadaObjetos.ej04;

import java.util.Scanner;

/**
 *
 * @author enogal
 */
public class Ejecutable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduzca la edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca el sexo (H/M): ");
        char sexo = sc.nextLine().toUpperCase().trim().charAt(0);
        System.out.print("Introduzca el peso (kg); ");
        double peso = Double.parseDouble(sc.nextLine());
        System.out.print("Introduzca la altura (m): ");
        double altura = Double.parseDouble(sc.nextLine());

        Persona[] personas = new Persona[3];
        personas[0] = new Persona();
        personas[1] = new Persona(nombre, edad, sexo);
        personas[2] = new Persona(nombre, edad, sexo, peso, altura);

        for (int i = 0; i < personas.length; i++) {
            System.out.println("-----------------------");
            System.out.println("Persona " + (i + 1));
            if (personas[i].calcularIMC() == -1) {
                System.out.println("Infrapeso");
            } else if (personas[i].calcularIMC() == 1) {
                System.out.println("sobrepeso");
            } else {
                System.out.println("saludable");
            }
            //System.out.println("Es hombre: " + personas[i].comprobarSexo('H'));
            System.out.println(personas[i].toString());
        }

    }

}
