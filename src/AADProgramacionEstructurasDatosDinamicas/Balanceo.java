/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AADProgramacionEstructurasDatosDinamicas;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author enrique
 */
public class Balanceo {

    public static boolean checkBalanceo(String s) {
        Stack<Character> pila = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                pila.push(s.charAt(i));
            } else if (s.charAt(i)=='}' && pila.peek()=='{'){
                pila.pop();
            } else if (s.charAt(i)==']' && pila.peek()=='['){
                pila.pop();
            } else if (s.charAt(i)==')' && pila.peek()=='('){
                pila.pop();
            }  
        }
        if (pila.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cadena de llaves, corchetes y paréntesis a balancear: ");
        String entrada = sc.nextLine();
        boolean balanceo = checkBalanceo(entrada);
        if (balanceo) {
            System.out.println("Está balanceada");
        } else {
            System.out.println("No está balanceada");
        }
    }

}
