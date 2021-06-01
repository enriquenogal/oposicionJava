/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nogal.mascara;

/**
 *
 * @author enrique
 */
public class Exec {

    public static void main(String[] args) {
        for (int i = 0; i <= 32; i++) {
            System.out.println("/" + i + " -> " + CIDR2Decimal(i) + " -> " + decimal2CIDR(CIDR2Decimal(i)));
        }
    }

    public static int decimal2CIDR(String decimal) {
        int r = 0;
        String[] posiciones = decimal.split("\\.");
        String s = "";
        for (int i = 0; i < posiciones.length; i++) {
            s += Integer.toBinaryString(Integer.parseInt(posiciones[i]));
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                r++;
            } else {
                break;
            }
        }
        return r;
    }

    public static String CIDR2Decimal(int CIDR) {
        String p1 = "0", p2 = "0", p3 = "0", p4 = "0";
        if (CIDR >= 0 && CIDR <= 8) {
            if (CIDR == 8) {
                p1 = "255";
            } else {
                p1 = getDecimal(CIDR);
            }
        } else if (CIDR > 8 && CIDR <= 16) {
            p1 = "255";
            if (CIDR == 16) {
                p2 = "255";
            } else {
                p2 = getDecimal(CIDR - 8);
            }
        } else if (CIDR > 16 && CIDR <= 24) {
            p1 = "255";
            p2 = "255";
            if (CIDR == 24) {
                p3 = "255";
            } else {
                p3 = getDecimal(CIDR - 16);
            }
        } else if (CIDR > 24 && CIDR <= 32) {
            p1 = "255";
            p2 = "255";
            p3 = "255";
            if (CIDR == 32) {
                p4 = "255";
            } else {
                p4 = getDecimal(CIDR - 24);
            }
        }
        return p1 + "." + p2 + "." + p3 + "." + p4;
    }

    public static String getDecimal(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += "1";
        }
        for (int i = 0; i < 8 - n; i++) {
            s += "0";
        }
        int r = 0;
        int eleva = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            r += Math.pow(2, eleva) * Character.getNumericValue(s.charAt(i));
            eleva++;
        }
        return Integer.toString(r);
    }

}
