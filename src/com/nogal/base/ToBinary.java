/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nogal.base;

/**
 *
 * @author enrique
 */
public class ToBinary {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + ": " + toBase(i,2) + ": " + toDecimal(toBase(i,2),2));
        }
    }

    public static String toBase(int n, int base) {
        String s = "";
        while (n >= base) {
            s = n % base + s;
            n = n / base;
        }
        s = n + s;
        return s;
    }
    
    public static int toDecimal(String s,int base) {
        int n = 0;
        char cAux;
        int nAux;
        for (int i = 0; i < s.length(); i++) {
            cAux = s.charAt(s.length()-1-i);
            nAux = Character.getNumericValue(cAux);
            n += (int)Math.pow(base, i) * nAux;
        }
        return n;
    }

}
