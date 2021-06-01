/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nogal.trazas;

/**
 *
 * @author enrique
 */
public class Test {
    
    public static void main(String[] args) {
        String[] palabras = new String[4];
        palabras[1] = "p1";
        palabras[2] = "p2";
        palabras[3] = "p3";
        
        try {
            System.out.println("Antes del for");
            for (int i = 1; i < palabras.length; i++) {
                System.out.println(palabras[i%3]);
            }
            System.out.println("Después del for");
        } catch (NullPointerException e) {
            System.out.println("Puntero null");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Fuera de límites");
        } catch (Exception e) {
            System.out.println("Excepción");
        } finally {
            System.out.println("Todo bien?");
        }
        
    }
    
}
