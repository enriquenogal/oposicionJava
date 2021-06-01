/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AAEProgramacionFicheros;

import java.io.*;
import java.util.Scanner;


/**
 *
 * @author enrique
 */
public class FicheroNumeros {

    public static void crearFicheroTexto(String name, Scanner sc) {
        System.out.println("Creando fichero de números - texto");
        String f = name;
        File fNumeros = new File(f);
        FileWriter fw = null;
        try {
            sc = new Scanner(System.in);
            fw = new FileWriter(f);
            int n = 0;
            while (n != -1) {
                System.out.print("Dame un número (-1 para terminar): ");
                n = Integer.parseInt(sc.nextLine());
                if (n != -1) {
                    fw.write(n + "\n");
                }
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error");
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException ex) {
                    System.out.println("Se ha producido un error");
                }
            }
        }
    }

    public static void crearFicheroDatos(String name, Scanner sc) {
        System.out.println("Creando fichero de números - datos");
        String f = name;
        File fNumeros = new File(f);
        DataOutputStream dos = null;
        try {
            sc = new Scanner(System.in);
            dos = new DataOutputStream(new FileOutputStream(fNumeros));
            int n = 0;
            while (n != -1) {
                System.out.print("Dame un número (-1 para terminar): ");
                n = Integer.parseInt(sc.nextLine());
                if (n != -1) {
                    dos.writeInt(n);
                }
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error");
        } finally {
            if (dos != null) {
                try {
                    dos.close();
                } catch (IOException ex) {
                    System.out.println("Se ha producido un error");
                }
            }
        }
    }

    public static int leerFicheroTexto(String name) {
        int suma = 0;
        Scanner fTXT = null;
        System.out.println("Leyendo fichero...");
        int n;
        try {
            fTXT = new Scanner(new File(name));
            while (fTXT.hasNextLine()) {
                n = Integer.parseInt(fTXT.nextLine());
                suma += n;
                System.out.println(n);
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error");
        } finally {
            if (fTXT != null) {
                fTXT.close();
            }
        }
        return suma;
    }

    public static int leerFicheroDatos(String name) {
        int suma = 0;
        DataInputStream dis = null;
        System.out.println("Leyendo fichero...");
        int n;
        try {
            dis = new DataInputStream(new FileInputStream(new File(name)));
            while (dis.available() > 0) {
                n = dis.readInt();
                suma += n;
                System.out.println(n);
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error");
        } finally {
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException ex) {
                    System.out.println("Se ha producido un error");
                }
            }
        }
        return suma;
    }
    
    public static void borrarFichero(String name){
        File fBorrar = new File(name);
        if (fBorrar.exists()) {
            fBorrar.delete();
            System.out.println("Borrando " + name);
        } else {
            System.out.println("No existe el fichero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma;
        String ruta = ".";
        File fRuta = new File(ruta);
        System.out.println("Contenidos de " + ruta);
        if (fRuta.isDirectory()) {
            for (String s : fRuta.list()) {
                System.out.println(s);
            }
        }

        System.out.print("Escribe el nombre del fichero de texto a crear: ");   
        String nameTXT = sc.nextLine();
        crearFicheroTexto(nameTXT,sc);
        suma = leerFicheroTexto(nameTXT);
        System.out.println("Suma del contenido del fichero: " + suma);

        System.out.print("Escribe el nombre del fichero de datos a crear: ");   
        String nameDAT = sc.nextLine();
        crearFicheroDatos(nameDAT,sc);
        suma = leerFicheroDatos(nameDAT);
        System.out.println("Suma del contenido del fichero: " + suma);
        
        borrarFichero("numeros.txt");
        borrarFichero("numeros.dat");
    }

}
