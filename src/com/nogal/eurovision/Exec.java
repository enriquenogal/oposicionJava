package com.nogal.eurovision;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enrique
 */
public class Exec {
    public static void main(String[] args) {
        Eurovision e = new Eurovision(2018,"Portugal");
        e.votacion();
        System.out.println("---------Listado----------");
        System.out.println(e.toString());
        System.out.println("---------Mejores----------");
        for (Pais p : e.mejores()) {
            System.out.println(p.toString());
        }
        System.out.println("---------Peores-----------");
        for (Pais p : e.peores()) {
            System.out.println(p.toString());
        }
    }
}
