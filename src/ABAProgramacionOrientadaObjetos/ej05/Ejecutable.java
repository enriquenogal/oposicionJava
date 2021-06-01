/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABAProgramacionOrientadaObjetos.ej05;

/**
 *
 * @author enogal
 */
public class Ejecutable {

    public static void main(String[] args) {
        Serie[] s = new Serie[5];
        Videojuego[] v = new Videojuego[5];

        s[0] = new Serie("SEVEN", 7, "DRAMA", "SCOTT");
        s[1] = new Serie("SIX", 6, "DRAMA", "SCOTT");
        s[2] = new Serie("TOP", 25, "DRAMA", "SCOTT");
        s[3] = new Serie("FOUR", 4, "DRAMA", "SCOTT");
        s[4] = new Serie("THREE", 3, "DRAMA", "SCOTT");

        v[0] = new Videojuego("0", 0, "ARCADE", "ACTIVISION");
        v[1] = new Videojuego("1", 1, "ARCADE", "ACTIVISION");
        v[2] = new Videojuego("2", 2, "ARCADE", "ACTIVISION");
        v[3] = new Videojuego("3", 3, "ARCADE", "ACTIVISION");
        v[4] = new Videojuego("4", 4, "ARCADE", "ACTIVISION");

        s[1].entregar();
        s[3].entregar();
        v[0].entregar();
        v[4].entregar();

        int contSeriesEntregadas = 0;
        int contVideojuegosEntregados = 0;
        for (int i = 0; i < 5; i++) {
            if (s[i].isEntregado()) {
                contSeriesEntregadas++;
                s[i].devolver();
            }
            if (v[i].isEntregado()) {
                contVideojuegosEntregados++;
                v[i].devolver();
            }
        }
        System.out.println("Series entregadas: " + contSeriesEntregadas);
        System.out.println("Videojuegos entregados: " + contVideojuegosEntregados);

        Serie topS = s[0];
        Videojuego topV = v[0];

        for (int i = 1; i < 5; i++) {
            if (topS.compareTo(s[i]) < 0) {
                topS = s[i];
            }
            if (topV.compareTo(v[i]) < 0) {
                topV = v[i];
            }
        }

        System.out.println(topS.toString());
        System.out.println(topV.toString());
    }

}
