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
public class Utils {
    public static int aleatorio(int min, int max) {
        return (int)((Math.random()*(max+1-min))+min);
    }   
}
