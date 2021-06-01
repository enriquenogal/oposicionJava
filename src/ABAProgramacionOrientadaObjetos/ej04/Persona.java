/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABAProgramacionOrientadaObjetos.ej04;

/**
 *
 * @author enogal
 */
public class Persona {

    private String nombre = "Perico de los Palotes";
    private int edad = 18;
    private String DNI;
    private char sexo = 'H';
    private double peso = 70.0, altura = 1.75;
    private final static double IMC_IDEAL_MIN = 23;
    private final static double IMC_IDEAL_MAX = 25;
    

    public Persona() {
        generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        generaDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        generaDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc = this.peso / Math.pow(altura, 2);
        if (imc < Persona.IMC_IDEAL_MIN) {
            return -1;
        } else if (imc > Persona.IMC_IDEAL_MAX) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean esMayorDeEdad() {
        return (this.edad >= 18);
    }

    public boolean comprobarSexo(char sexo) {
        if (this.sexo == sexo) {
            return true;
        } else {
            this.sexo = 'H';
            return false;
        }        
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    public void generaDNI() {
        int n = (int) (Math.random()*100000000);
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int posicion = n % letras.length();
        char letra = letras.charAt(posicion);
        this.DNI = String.format("%08d%c", n,letra);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    

}
