/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nogal.arbolbinario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author enrique
 */
public class Arbol {

    private NodoArbol raiz;

    public Arbol() {
        raiz = null;
    }

    public void insertar2(double dato) {
        if (this.raiz == null) {
            this.raiz = new NodoArbol(dato);
        } else {
            NodoArbol padre = raiz;
            do {
                if (dato == padre.clave) {
                    break;
                } else if (dato < padre.clave) {
                    if (padre.iz == null) {
                        padre.iz = new NodoArbol(dato);
                    } else {
                        padre = padre.iz;
                    }
                } else if (dato > padre.clave) {
                    if (padre.de == null) {
                        padre.de = new NodoArbol(dato);
                    } else {
                        padre = padre.de;
                    }
                }

            } while (true);
        }
    }

    public void insertar(double dato) {
        if (this.raiz == null) {
            this.raiz = new NodoArbol(dato);
        } else {
            insertar(new NodoArbol(dato), this.raiz);
        }
    }

    private void insertar(NodoArbol nuevo, NodoArbol padre) {
        if (padre.clave > nuevo.clave) {
            if (padre.iz == null) {
                padre.iz = nuevo;
            } else {
                insertar(nuevo, padre.iz);
            }
        }
        if (padre.clave < nuevo.clave) {
            if (padre.de == null) {
                padre.de = nuevo;
            } else {
                insertar(nuevo, padre.de);
            }
        }
    }

    public int profundidad() {
        int r = 0;
        ArrayList<Integer> profundidades = new ArrayList<Integer>();
        calculaProfundidad(raiz, profundidades, 0);
        r = Collections.max(profundidades);
        return r;
    }

    public void calculaProfundidad(NodoArbol n, ArrayList<Integer> profundidades, int p) {
        if (n == null) {
            profundidades.add(p);
        } else {
            calculaProfundidad(n.iz, profundidades, p + 1);
            calculaProfundidad(n.de, profundidades, p + 1);
        }
    }

    public String toString() {
        return "[" + recorrer(this.raiz) + "]";
    }

    private String recorrer(NodoArbol n) {
        if (n != null) {
            return recorrer(n.iz) + " " + n.clave + " " + recorrer(n.de);
        } else {
            return "";
        }
    }

    public boolean contiene(double dato) {
        return contiene(dato, this.raiz);
    }

    private boolean contiene(double dato, NodoArbol n) {
        if (n == null) {
            return false;
        } else if (n.clave == dato) {
            return true;
        } else if (n.clave > dato) {
            return contiene(dato, n.iz);
        } else {
            return contiene(dato, n.de);
        }
    }
}
