/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nogal.grafo;

import java.util.ArrayList;

/**
 *
 * @author enrique
 */
public class CheckBucle {

    //primero monto el método inicial en el que recorro cada nodo del grafo
    //y llamo a un método que buscará ese mismo nodo desde si mismo de modo recursivo.
    //si en algún momento encuentro bucle actualizo el resultado y dejo de buscar
    //finalmente devuelvo el resultado
    public static boolean bucle(GrafoLA g) {
        boolean r = false;
        int nodos = g.listaAdy.length;
        for (int i = 0; i < nodos; i++) {
            ArrayList<NodoLista> al = new ArrayList<NodoLista>();
            r = buscarme(al, g.listaAdy[i].inicio);
            if (r) {
                break;
            }
        }
        return r;
    }

    //ahora monto el método que recibe la lista (que contien el inicio, y el punto de partida de la búsqueda
    //si el inicio de la lista es igual a lo que ha llegado en sig, entonces hay bucle y devuelvo true
    //si no y sig contiene información vuelvo a llamar a este mismo método, con el mismo dato de lista y el siguiente nodo
    //si sig == null ya no tengo que seguir buscando 
    //pues he llegado al final del camino posible sin haber encontrado el inicio y devuelvo false
    public static boolean buscarme(ArrayList<NodoLista> al, NodoLista nodo) {
        if (al.contains(nodo)) {
            return true;
        } else if (nodo.sig == null) {
            return false;
        } else {
            al.add(nodo);
            return buscarme(al, nodo.sig);
        }
    }
    
    //monto un método main para generar un grafo y probarlo
    public static void main(String[] args) {
        GrafoLA g = new GrafoLA(5, true);
        for (int i = 0; i < g.listaAdy.length; i++) {
            g.listaAdy[i] = new Lista();
            g.listaAdy[i].inicio = new NodoLista();
        }
        g.listaAdy[0].inicio.dato = 0;
        g.listaAdy[0].inicio.sig = g.listaAdy[1].inicio;
        g.listaAdy[1].inicio.dato = 1;
        g.listaAdy[1].inicio.sig = g.listaAdy[2].inicio;
        g.listaAdy[2].inicio.dato = 2;
        g.listaAdy[2].inicio.sig = g.listaAdy[3].inicio;
        g.listaAdy[3].inicio.dato = 3;
        g.listaAdy[3].inicio.sig = g.listaAdy[4].inicio;
        g.listaAdy[4].inicio.dato = 4;
        g.listaAdy[4].inicio.sig = null;
        
        System.out.println("Tiene bucle? " + bucle(g));
    }

}
