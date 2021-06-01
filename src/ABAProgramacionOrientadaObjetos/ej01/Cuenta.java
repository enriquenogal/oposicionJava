/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABAProgramacionOrientadaObjetos.ej01;

/**
 *
 * @author enogal
 */
public abstract class Cuenta {
    String numCuenta;
    double saldo;
    static int contador = 0;
    //lo declaro estático ya que es un atributo de clase, común a todos los objetos
    //no tiene un valor diferente para cada objeto sino que tiene uno global

    public Cuenta() {
        this.contador++;
    }

    public Cuenta(String numCuenta, double saldo, int contador) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.contador = contador; 
        //esto último no tiene sentido, pues estás dando valores a un contador 
        //que debería no dar accesibilidad a ser modificado desde fuera
    }
    
    //los getters y setters son prescindibles en esta clase, ya que no se van a poder generar objetoss 
    //al ser abstracto
    //sólo se podrá acceder a los atributos desde las clases hijas (directamente)
    //a mí no me gusta este modo de realizarlo, pero es posible
    //yo preferiría declarar privados los atributos y definir métodos publicos de acceso para los
    //atributos que yo decidiera
    
    public abstract void pagarIntereses();
    //al declarar abstracto el método obligo a las clases hijas a implementarlo siempre
    
}
