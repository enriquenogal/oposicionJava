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
public class ListaEnlazada {

    class Nodo {

        int valor;
        Nodo sig;

        public Nodo(int valor) {
            this.valor = valor;
            this.sig = null;
        }
    }

    Nodo listaInicio = null;

    public Nodo fin() {
        Nodo aux;
        aux = listaInicio;
        while (aux.sig != null) {
            aux = aux.sig;
        }
        return aux;
    }

    public void insertaInicio(Nodo insertar) {
        if (listaInicio == null) {
            listaInicio = insertar;
        } else {
            insertar.sig = listaInicio;
            listaInicio = insertar;
        }
    }

    public void insertaInicio(int valor) {
        Nodo insertar = new Nodo(valor);
        if (listaInicio == null) {
            listaInicio = insertar;
        } else {
            insertar.sig = listaInicio;
            listaInicio = insertar;
        }
    }

    public void insertaFin(Nodo insertar) {
        if (listaInicio == null) {
            listaInicio = insertar;
        } else {
            //llamo a la función que me devuelve el último elemento y le añado el que quiero insertar al final
            fin().sig = insertar;
        }
    }

    public void insertaFin(int valor) {
        Nodo insertar = new Nodo(valor);
        if (listaInicio == null) {
            listaInicio = insertar;
        } else {
            //llamo a la función que me devuelve el último elemento y le añado el que quiero insertar al final
            fin().sig = insertar;
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
            while (aux != null) {
                salida += " " + aux.valor;
                aux = aux.sig;
            }
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
        Nodo aux = listaInicio;
        while (aux != null && encontrado == false) {
            if (aux.valor == valorBusqueda) {
                encontrado = true;
            } else {
                aux = aux.sig;
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
        boolean borrar = false;
        while (aux != null) {
            borrar = false;
            if (aux.sig != null) {
                if (aux.sig.valor == valorBorrar) {
                    borrar = true;
                    aux.sig = aux.sig.sig;
                }
            }
            if (borrar == false) {
                aux = aux.sig;
            }
        }
        if (listaInicio.valor == valorBorrar) {
            listaInicio = listaInicio.sig;
        }
    }

    public static int aleatorio(int min, int max) {
        int r = (int) (Math.random() * (max + 1 - min) + min);
        System.out.println(r);
        return r;
    }

    public static void main(String[] args) {
        ListaEnlazada le = new ListaEnlazada();
        le.visualizar();
        System.out.println("----------------");
        System.out.print("Inserto inicio: ");
        le.insertaInicio(aleatorio(-99, 99));
        le.visualizar();
        System.out.println("----------------");
        System.out.print("Inserto inicio; ");
        le.insertaInicio(aleatorio(-99, 99));
        le.visualizar();
        System.out.println("----------------");
        System.out.print("Inserto fin: ");
        le.visualizar();
        System.out.println("----------------");
        System.out.print("Inserto fin: ");
        le.insertaFin(aleatorio(-99, 99));
        le.visualizar();
        System.out.println("----------------");
        System.out.print("Inserto posicion 2: ");
        le.insertaPosicion(aleatorio(-99, 99), 2);
        le.visualizar();
        System.out.println("----------------");
        System.out.print("Inserto posicion 3: ");
        le.insertaPosicion(aleatorio(-99, 99), 3);
        le.visualizar();
        System.out.println("----------------");
        System.out.println("Recojo lo que haya en la posicion 0 y lo muestro: " + le.buscarPosicion(0).valor);
        System.out.println("Recojo lo que haya en la posicion 1 y lo muestro: " + le.buscarPosicion(1).valor);
        System.out.println("Recojo lo que haya en la posicion 2 y lo muestro: " + le.buscarPosicion(2).valor);
        System.out.println("Recojo lo que haya en la posicion 3 y lo muestro: " + le.buscarPosicion(3).valor);
        System.out.println("Recojo lo que haya en la posicion 4 y lo muestro: " + le.buscarPosicion(4).valor);
        System.out.println("----------------");
        System.out.println("Inserto posicion 2: 0");
        le.insertaPosicion(0, 2);
        le.visualizar();
        System.out.println("Busco si hay algún elemento con valor = 0 y lo muestro por pantalla");
        System.out.print("Buscando... ");
        if (le.buscarValor(0) == null) {
            System.out.println("NO ENCONTRADO");
        } else {
            System.out.println(le.buscarValor(0).valor);
        }
        System.out.println("----------------");
        System.out.println("Inserto posicion 0: 1");
        le.insertaPosicion(aleatorio(-99, 99), 0);
        le.visualizar();
        System.out.println("Busco si hay algún elemento con valor = 1 y lo muestro por pantalla");
        System.out.print("Buscando... ");
        if (le.buscarValor(1) == null) {
            System.out.println("NO ENCONTRADO");
        } else {
            System.out.println(le.buscarValor(1).valor);
        }
        System.out.println("----------------");
        System.out.println("Borro posicion 3: " + le.buscarPosicion(3).valor);
        le.borrarPosicion(3);
        le.visualizar();
        System.out.println("----------------");
        System.out.println("Inserto al inicio un par de 0");
        System.out.println("Inserto posiciones 5 y 6 el valor: 0");
        System.out.println("Inserto al final un par de 0");
        le.insertaInicio(aleatorio(-99, 99));
        le.insertaInicio(aleatorio(-99, 99));
        le.insertaPosicion(aleatorio(-99, 99), 5);
        le.insertaPosicion(aleatorio(-99, 99), 6);
        le.insertaFin(aleatorio(-99, 99));
        le.insertaFin(aleatorio(-99, 99));
        le.visualizar();
        System.out.println("Borro todos los valores 0 de la lista");
        le.borrarValor(0);
        le.visualizar();
    }

}
