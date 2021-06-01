/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nogal.arbolbinario;

/**
 *
 * @author enrique
 */
public class Exec {
    public static void main(String[] args) {
        Arbol a = new Arbol();
        a.insertar2(0);
        
        a.insertar2(-1);
        a.insertar2(-2);
        a.insertar2(-3);
        
        a.insertar2(3);
        a.insertar2(2);
        a.insertar2(1);
        a.insertar2(0.5d);
        a.insertar2(1.5d);
        a.insertar2(1.3d);
        
        a.insertar2(4);
        a.insertar2(5);

        System.out.println("Profundidad: " + a.profundidad());
        
        System.out.println("Contenido: " + a.toString());
        
        System.out.println("Contiene 1.3: " + a.contiene(1.3));
        System.out.println("Contiene 1.8: " + a.contiene(1.8));
    }
    
}
