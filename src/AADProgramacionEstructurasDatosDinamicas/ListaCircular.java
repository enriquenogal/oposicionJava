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
public class ListaCircular {

    class Nodo {

        int valor;
        Nodo sig;

        public Nodo(int valor) {
            this.valor = valor;
            this.sig = null;
        }
    }

    Nodo listaInicio = null;
    Nodo listaFin = null;

    public Nodo fin() {
        return listaFin;
    }

    public void insertaInicio(Nodo insertar) {
        if (listaInicio == null) {
            listaInicio = insertar;
            listaFin = listaInicio;
            listaFin.sig = listaInicio;
        } else {
            insertar.sig = listaInicio;
            listaInicio = insertar;
            listaFin.sig = listaInicio;
        }
    }

    public void insertaInicio(int valor) {
        Nodo insertar = new Nodo(valor);
        if (listaInicio == null) {
            listaInicio = insertar;
            listaFin = listaInicio;
            listaFin.sig = listaInicio;
        } else {
            insertar.sig = listaInicio;
            listaInicio = insertar;
            listaFin.sig = listaInicio;
        }
    }

    public void insertaFin(Nodo insertar) {
        if (listaInicio == null) {
            insertaInicio(insertar);
        } else {
            listaFin.sig = insertar;
            listaFin = insertar;
            listaFin.sig = listaInicio;
        }
    }

    public void insertaFin(int valor) {
        Nodo insertar = new Nodo(valor);
        if (listaInicio == null) {
            insertaInicio(insertar);
        } else {
            listaFin.sig = insertar;
            listaFin = insertar;
            listaFin.sig = listaInicio;
        }
    }

    public void insertaPosicion(Nodo insertar, int posicion) {
        if (posicion == 0) {
            insertaInicio(insertar);
        } else {
            Nodo aux = buscarPosicion(posicion - 1);
            Nodo aux2 = aux.sig;
            aux.sig = insertar;
            insertar.sig = aux2;
        }
    }

    public void insertaPosicion(int valor, int posicion) {
        Nodo insertar = new Nodo(valor);
        if (posicion == 0) {
            insertaInicio(insertar);
        } else {
            Nodo aux = buscarPosicion(posicion - 1);
            Nodo aux2 = aux.sig;
            aux.sig = insertar;
            insertar.sig = aux2;
        }
    }

    public Nodo inicio() {
        return listaInicio;
    }

    public void visualizar() {
        System.out.print("LISTA -> ");
        if (listaInicio != null) {
            Nodo aux = listaInicio;
            String salida = "";
            do {
                salida += " " + aux.valor;
                aux = aux.sig;
            } while (aux != listaInicio);
            System.out.println(salida.trim());
        } else {
            System.out.println("VACIA");
        }
    }

    public Nodo buscarPosicion(int posicion) {
        if (posicion == 0) {
            return listaInicio;
        } else {
            Nodo aux;
            aux = listaInicio;
            for (int i = 0; i < posicion; i++) {
                aux = aux.sig;
            }
            return aux;
        }
    }

    public Nodo buscarValor(int valorBusqueda) {
        boolean encontrado = false;
        Nodo aux;
        if (listaInicio.valor == valorBusqueda) {
            encontrado = true;
            aux = listaInicio;
        } else {
            aux = listaInicio.sig;
            while (aux != listaInicio && encontrado == false) {
                if (aux.valor == valorBusqueda) {
                    encontrado = true;
                } else {
                    aux = aux.sig;
                }
            }
        }
        if (encontrado == false) {
            return null;
        } else {
            return aux;
        }
    }

    public void borrarPosicion(int posicion) {
        Nodo aux = buscarPosicion(posicion - 1);
        aux.sig = aux.sig.sig;
    }

    public void borrarValor(int valorBorrar) {
        Nodo aux = listaInicio;
        do {
            if (aux.sig.valor == valorBorrar) {
                aux.sig = aux.sig.sig;
            }
            aux = aux.sig;
        } while (aux.sig != listaFin);

        if (listaFin.valor == valorBorrar) {
            listaFin = aux;
            listaFin.sig = listaInicio;
        }

        if (listaInicio.valor == valorBorrar) {
            listaFin.sig = listaInicio.sig;
            listaInicio = listaInicio.sig;
        }
    }

    public static int aleatorio(int min, int max) {
        int r = (int) (Math.random() * (max + 1 - min) + min);
        System.out.println(r);
        return r;
    }

    public static void main(String[] args) {
        ListaCircular lc = new ListaCircular();
        lc.visualizar();
        System.out.println("----------------");
        System.out.print("Inserto inicio: ");
        lc.insertaInicio(aleatorio(-99, 99));
        lc.visualizar();
        System.out.println("----------------");
        System.out.print("Inserto inicio; ");
        lc.insertaInicio(aleatorio(-99, 99));
        lc.visualizar();
        System.out.println("----------------");
        System.out.print("Inserto fin: ");
        lc.visualizar();
        System.out.println("----------------");
        System.out.print("Inserto fin: ");
        lc.insertaFin(aleatorio(-99, 99));
        lc.visualizar();
        System.out.println("----------------");
        System.out.print("Inserto posicion 2: ");
        lc.insertaPosicion(aleatorio(-99, 99), 2);
        lc.visualizar();
        System.out.println("----------------");
        System.out.print("Inserto posicion 3: ");
        lc.insertaPosicion(aleatorio(-99, 99), 3);
        lc.visualizar();
        System.out.println("----------------");
        System.out.println("Recojo lo que haya en la posicion 0 y lo muestro: " + lc.buscarPosicion(0).valor);
        System.out.println("Recojo lo que haya en la posicion 1 y lo muestro: " + lc.buscarPosicion(1).valor);
        System.out.println("Recojo lo que haya en la posicion 2 y lo muestro: " + lc.buscarPosicion(2).valor);
        System.out.println("Recojo lo que haya en la posicion 3 y lo muestro: " + lc.buscarPosicion(3).valor);
        System.out.println("Recojo lo que haya en la posicion 4 y lo muestro: " + lc.buscarPosicion(4).valor);
        System.out.println("----------------");
        System.out.println("Inserto posicion 2: 0");
        lc.insertaPosicion(0, 2);
        lc.visualizar();
        System.out.println("Busco si hay algún elemento con valor = 0 y lo muestro por pantalla");
        System.out.print("Buscando... ");
        if (lc.buscarValor(0) == null) {
            System.out.println("NO ENCONTRADO");
        } else {
            System.out.println(lc.buscarValor(0).valor);
        }
        System.out.println("----------------");
        System.out.println("Inserto posicion 0: 1");
        lc.insertaPosicion(aleatorio(-99, 99), 0);
        lc.visualizar();
        System.out.println("Busco si hay algún elemento con valor = 1 y lo muestro por pantalla");
        System.out.print("Buscando... ");
        if (lc.buscarValor(1) == null) {
            System.out.println("NO ENCONTRADO");
        } else {
            System.out.println(lc.buscarValor(1).valor);
        }
        System.out.println("----------------");
        System.out.println("Borro posicion 3: " + lc.buscarPosicion(3).valor);
        lc.borrarPosicion(3);
        lc.visualizar();
        System.out.println("----------------");
        System.out.println("Inserto al inicio un par de 0");
        System.out.println("Inserto posiciones 5 y 6 el valor: 0");
        System.out.println("Inserto al final un par de 0");
        lc.insertaInicio(aleatorio(-99, 99));
        lc.insertaInicio(aleatorio(-99, 99));
        lc.insertaPosicion(aleatorio(-99, 99), 5);
        lc.insertaPosicion(aleatorio(-99, 99), 6);
        lc.insertaFin(aleatorio(-99, 99));
        lc.insertaFin(aleatorio(-99, 99));
        lc.visualizar();
        System.out.println("Borro todos los valores 0 de la lista");
        lc.borrarValor(0);
        lc.visualizar();

    }

}
