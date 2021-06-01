package com.nogal.eurovision;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class Eurovision {

    private static final String[] paises = {"Serbia", "Moldavia", "Hungría", "Ucrania", "Suecia",
        "Australia", "Noruega", "Dinamarca", "Eslovenia", "Holanda", "Albania", "República Checa",
        "Lituania", "Israel", "Estonia", "Bulgaria", "Austria", "Finlandia", "Irlanda", "Chipre",
        "Alemania", "Italia", "Reino Unido", "Francia", "España", "Portugal"};

    private TreeMap<String, Pais> concurso = new TreeMap<String, Pais>();

    private int year;
    private String sede;

    public Eurovision(int year, String sede) {
        this.year = year;
        this.sede = sede;
        Pais p;
        for (int i = 0; i < this.paises.length; i++) {
            p = new Pais(this.paises[i], 0);
            this.concurso.put(this.paises[i], p);
        }
    }

    public void votacion() {
        System.out.println("------ Votando --------");
        ArrayList<String> votados = new ArrayList<String>();
        int votado;
        //primero los paises finalistas
        //y después el resto
        for (int i = 0; i < 43; i++) {
            System.out.println("- Voto del pais " + i);
            //inicializo la lista de votados por cada pais
            votados.clear();
            //si es uno de los primeros países
            //lo añado a la lista de votados para que no se pueda votar a si mismo
            if (i < this.paises.length) {
                System.out.println("- Finalista: " + this.paises[i]);
                votados.add(this.paises[i]);
            }
            //votacion de cada pais
            for (int j = 1; j <= 12; j++) {
                //calculo aleatoriamente el páis vigilando que no se repita
                do {
                    votado = Utils.aleatorio(0, this.paises.length - 1);
                } while (votados.contains(paises[votado]));
                //lo añado a la lista de países votados para que así no repita
                votados.add(paises[votado]);
                //le añado los puntos
                concurso.get(paises[votado]).addPuntos(j);
                System.out.println("  - Vota a: " + paises[votado] + " con " + j + " puntos");
                //en el caso de que los puntos sean 8 o más 
                //le añado uno extra para que a partir de ahí vaya de dos en dos
                if (j >= 8) {
                    j++;
                }
            }
        }
    }

    @Override
    public String toString() {
        String r = "";
        for (Pais p : this.concurso.values()) {
            r += p.toString() + "\n";
        }
        return r;
    }

    public List<Pais> mejores() {
        ArrayList<Pais> mejores = new ArrayList<Pais>();
        int puntos = Integer.MIN_VALUE;
        for (Pais p : concurso.values()) {
            if (p.getPuntos() > puntos) {
                puntos = p.getPuntos();
                mejores.clear();
                mejores.add(p);
            } else if (p.getPuntos() == puntos) {
                mejores.add(p);
            }
        }
        return mejores;
    }

    public List<Pais> peores() {
        ArrayList<Pais> peores = new ArrayList<Pais>();
        int puntos = Integer.MAX_VALUE;
        for (Pais p : concurso.values()) {
            if (p.getPuntos() < puntos) {
                puntos = p.getPuntos();
                peores.clear();
                peores.add(p);
            } else if (p.getPuntos() == puntos) {
                peores.add(p);
            }
        }
        return peores;
    }

}
