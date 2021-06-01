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
public class CuentaCorriente extends Cuenta{

    public CuentaCorriente() {
        super(); 
        //así cada vez que se genere un objeto de esta clase se incrementará en uno el contador
        //de la clase Cuenta
    }

    public CuentaCorriente(String numCuenta, double saldo, int contador) {
        super(numCuenta, saldo, contador);
    }
    
    

    @Override
    public void pagarIntereses() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //si no implemento este método, no me compilaría, es obligatorio
    
    
    
}
