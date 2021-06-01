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
//public final class CuentaJoven extends Cuenta {
//declarando la clase como final, no podré generar clases que extiendan de esta
//esto es un problema porque no podré generar la CuentaMuyJoven
public class CuentaJoven extends Cuenta {

    public CuentaJoven() {
        super();
        //así cada vez que se genere un objeto de esta clase se incrementará en uno el contador
        //de la clase Cuenta
    }

    public CuentaJoven(String numCuenta, double saldo, int contador) {
        super(numCuenta, saldo, contador);
    }

    @Override
    public void pagarIntereses() {
        super.saldo = super.saldo * 1.05d;
    }
    //se puede incrementar el saldo pues es un atributo de la clase padre y se puede acceder
    //a él mediante super
}
