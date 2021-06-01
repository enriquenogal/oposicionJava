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
public class NodoArbol {

        public NodoArbol(double dato) {
            clave = dato;
            iz = null;
            de = null;
        }
        public double clave;
        public NodoArbol iz, de;
    }
