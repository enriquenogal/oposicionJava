/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AADProgramacionEstructurasDatosDinamicas;

import java.util.*;

/**
 *
 * @author enrique
 */
public class NumerosSuerteB {

    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * (max + 1 - min) + min);
    }

    public static void main(String[] args) {
        int n = 120, n1 = 0, a;
        Queue<Integer> q = new LinkedList<Integer>();
        
        for (int i = 0; i < n; i++) {
            a = aleatorio(1, 100);
            q.add(a);
        }
        n1 = aleatorio(2, 10);
        System.out.println("Aleatorio inicial: " + n1);
        while (n1 <= n) {
            System.out.println("Números: " + q.toString());
            for (int i = 1; i <= n; i++) {
                if (i % n1 == 1) {
                    System.out.println("borro posicion: " + i);
                    q.poll();
                } else {
                    q.add(q.poll());
                }
            }
            n1 = aleatorio(2, 10);
            n = q.size();
            System.out.println("Aleatorio: " + n1);
        }
        System.out.println("Números finales: " + q.toString());
    }
}
