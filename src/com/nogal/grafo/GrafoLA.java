/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nogal.grafo;

/**
 *
 * @author enrique
 */
public class GrafoLA {

    int maxNodos;
    public int numVertices;
    public Lista listaAdy[];
    boolean dirigido = true;

    public GrafoLA(int n, boolean d) {
        dirigido = d;
        maxNodos = n;
        numVertices = 0;
        listaAdy = new Lista[n];
    }
}
