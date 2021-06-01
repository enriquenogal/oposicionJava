/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AADProgramacionEstructurasDatosDinamicas;

/**
 *
 * @author enrique
 */
public class ListaCircularDoble {

    class Nodo {

        String ciudad;
        Nodo ant;
        Nodo sig;

        public Nodo(String s) {
            this.ciudad = s;
        }
    }

    Nodo inicioLista;
    Nodo finLista;

    public void insertar(String s) {
        Nodo insertar = new Nodo(s);
        if (inicioLista == null) {
            inicioLista = insertar;
            inicioLista.sig = inicioLista;
            inicioLista.ant = inicioLista;
            finLista = inicioLista;
        } else {
            insertar.ant = finLista;
            finLista.sig = insertar;
            finLista = insertar;
            insertar.sig = inicioLista;
            inicioLista.ant = finLista;
        }
    }

    public void mostrarDirecto() {
        if (inicioLista == null) {
            System.out.println("VACIO");
        } else {
            Nodo aux = inicioLista;
            String salida = "";
            do {
                salida += " " + aux.ciudad;
                aux = aux.sig;
            } while (aux != inicioLista);
            System.out.println(salida.trim());
        }
    }

    public void mostrarPorInicial(char inicial) {
        if (inicioLista == null) {
            System.out.println("VACIO");
        } else {
            Nodo aux = inicioLista;
            String salida = "";
            do {
                if (aux.ciudad.charAt(0) == inicial) {
                    salida += " " + aux.ciudad;
                }
                aux = aux.sig;
            } while (aux != inicioLista);
            System.out.println(salida.trim());
        }
    }

    public void borrar(String s) {
        boolean encontrado = false;
        if (inicioLista.ciudad.equals(s)) {
            finLista.sig = inicioLista.sig;
            inicioLista = inicioLista.sig;
            inicioLista.ant = finLista;
            encontrado = true;
        } else if (encontrado == false) {
            Nodo aux = inicioLista;
            do {
                if (aux.sig.ciudad.equals(s)) {
                    if (aux.sig == finLista) {
                        finLista = aux;
                    }
                    aux.sig = aux.sig.sig;
                    aux.sig.ant = aux;

                }
                aux = aux.sig;
            } while (aux != inicioLista && encontrado == false);
        }

    }

    public void mostrarInverso() {
        if (finLista == null) {
            System.out.println("VACIO");
        } else {
            Nodo aux = finLista;
            String salida = "";
            do {
                salida += " " + aux.ciudad;
                aux = aux.ant;
            } while (aux != finLista);
            System.out.println(salida.trim());
        }
    }

    public static void main(String[] args) {
        ListaCircularDoble lcd = new ListaCircularDoble();
        String c1;
        System.out.println("Inserto ciudades y muestro directo e inverso");
        c1 = "MADRID";
        lcd.insertar(c1);
        c1 = "BARCELONA";
        lcd.insertar(c1);
        c1 = "PARIS";
        lcd.insertar(c1);
        c1 = "LONDRES";
        lcd.insertar(c1);
        c1 = "SEVILLA";
        lcd.insertar(c1);
        c1 = "PALENCIA";
        lcd.insertar(c1);
        lcd.mostrarDirecto();
        lcd.mostrarInverso();
        System.out.println("--------------------------------");
        System.out.println("Muestro las ciudades que empiecen por P");
        lcd.mostrarPorInicial('P');
        System.out.println("--------------------------------");
        System.out.println("Borro Paris");
        lcd.borrar("PARIS");
        lcd.mostrarDirecto();
        lcd.mostrarInverso();
        System.out.println("--------------------------------");
        System.out.println("Borro Madrid");
        lcd.borrar("MADRID");
        lcd.mostrarDirecto();
        lcd.mostrarInverso();
        System.out.println("--------------------------------");
        System.out.println("Borro Palencia");
        lcd.borrar("PALENCIA");
        lcd.mostrarDirecto();
        lcd.mostrarInverso();
    }

    

}
