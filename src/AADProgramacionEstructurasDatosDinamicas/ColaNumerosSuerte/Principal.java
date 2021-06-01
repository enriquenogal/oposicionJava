package AADProgramacionEstructurasDatosDinamicas.ColaNumerosSuerte;

import java.util.Random;

/**
 * Programa que permite obtener números de la suerte
 *
 * @author Laura Folgado
 * @version 1.0
 */
public class Principal {

    /**
     * Método principal
     *
     * @args Argumentos de la llamada al método principal
     */
    public static void main(String[] a) {
        //Variables
        int n, n1, n2, i;
        Integer nv;
        ColaLista cola = new ColaLista();
        Random r = new Random();
        
        try {
            // Número inicial de elementos de la lista 
            n = 11 + r.nextInt(49);
            // Se generan n números aleatorios y se introducen en la cola
            System.out.print("Números iniciales: ");
            for (i = 1; i <= n; i++) {
                nv = new Integer(1 + r.nextInt(101));
                System.out.print(nv + " ");
                cola.insertar(nv);
            }
            // Se genera aleatoriamente el intervalo n1  
            n1 = 2 + r.nextInt(9);
            System.out.println("\nEl número n1 es "+n1);
            // Se retiran de la cola elementos a distancia n1
            // es decir, que el resto de dividir entre n1 sea 1
            // Por ejemplo, si n1 es 6, se eilima el 1, el 6+1, el (6*2)+1, el (6*3)+1...
            System.out.print("Se eliminan de la lista: ");
            while (n1 <= n) { //Mientras haya al menos más elementos que el número n1
                Object nt;
                n2 = 0;  // Contador de elementos que quedan
                for (i = 1; i <= n; i++) {
                    nt = cola.extraer(); //Extraemos el primer elemento
                    //System.out.println("i="+i+" n1="+n1);
                    if (i % n1 == 1) { //Si la posición es una de las que debemos eliminar
                        //Es decir, en el ejemplo anterior, si es 1, 7, 13...
                        System.out.print(nt + " "); //Mostramos el número que hay en esa posición porque lo sacamos
                    } else {
                        cola.insertar(nt);  // En caso de que no esté en una de las posiciones elegidas, se vuelve a meter (al final)
                        n2++; //Añadimos 1 al contador de elementos
                    }
                }
                n = n2; //Le asignamos el número de elementos a n, para saber en la siguiente vuelta si hay más de n1+1 elementos y podemos seguir
                n1 = 2 + r.nextInt(9); //Reasignamos un número nuevo a n1
                System.out.println("\n\nEl número n1 ahora es "+n1);
                System.out.print("Se eliminan de la lista: ");
            }

            System.out.print("\nLos números de la suerte son: ");
            mostrarCola(cola);
            System.out.println();

        } catch (Exception t) {
            System.out.println("ERROR: " + t);
        }
    }

    /**
     * Método que muestra la cola resultante
     *
     * @cola Objeto cola
     */
    private static void mostrarCola(ColaLista cola) throws Exception {
        while (!cola.colaVacia()) {
            Integer v;
            v = (Integer) cola.extraer();
            System.out.print(" " + v.intValue());
        }
    }
}
