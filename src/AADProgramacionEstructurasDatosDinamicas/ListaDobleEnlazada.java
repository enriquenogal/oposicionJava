/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AADProgramacionEstructurasDatosDinamicas;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class ListaDobleEnlazada {

    class Nodo {

        char c;
        Nodo ant;
        Nodo sig;

        public Nodo(char c) {
            this.c = c;
        }
    }

    Nodo listaInicio;

    public void mostrar() {
        if (listaInicio == null) {
            System.out.println("NULL");
        } else {
            String salida = "";
            Nodo aux = listaInicio;
            while (aux != null) {
                salida += aux.c;
                aux = aux.sig;
            }
            System.out.println(salida);
        }
    }

    public int contar(char c) {
        if (listaInicio == null) {
            return 0;
        } else {
            int cont = 0;
            Nodo aux = listaInicio;
            while (aux != null) {
                if (aux.c == c) {
                    cont++;
                }
                aux = aux.sig;
            }
            return cont;
        }
    }

    public void insertarFin(char c) {
        Nodo insertar = new Nodo(c);
        if (listaInicio == null) {
            listaInicio = insertar;
        } else {
            Nodo aux = listaInicio;
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = insertar;
            insertar.ant = aux;
        }
    }
    
    public char charPosicion(int posicion) {
        char c = ' ';
        Nodo aux = listaInicio;
        for (int i = 0; i < posicion; i++) {
            aux = aux.sig;
        }
        return aux.c;
    }

    public static void main(String[] args) {
        ListaDobleEnlazada lde = new ListaDobleEnlazada();
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un texto: ");
        String entrada = sc.nextLine();
        for (int i = 0; i < entrada.length(); i++) {
            lde.insertarFin(entrada.charAt(i));
        }
        System.out.println("Número de letras a: " + lde.contar('a'));
        System.out.println("Caracter en la posición 3: " + lde.charPosicion(3));

        lde.mostrar();
        
    }

}
