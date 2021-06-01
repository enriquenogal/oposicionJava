/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AADProgramacionBasicaArraysBidimensionales;

/**
 *
 * @author enrique
 */
public class Libro {

    public static final int PAGINAS = 2;
    public static final int LINEAS = 40;
    public static final int COLUMNAS = 60;

    public static void mostrarLibro(char[][][] libro) {
        for (int i = 0; i < PAGINAS; i++) {
            for (int j = 0; j < LINEAS; j++) {
                //System.out.print(j+": ");
                for (int k = 0; k < COLUMNAS; k++) {
                    System.out.print(libro[i][j][k]);
                }
                System.out.println();

            }
            //System.out.println("-------------" + i + "--------------");
        }
    }

    public static void main(String[] args) {
        char[][][] libro = new char[PAGINAS][LINEAS][COLUMNAS];
        mostrarLibro(libro);
    }

}
