/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop169868_proyect_electronicstore;

/**
 *
 * @author 169868
 */
public class Cliente {
    private double dinero;
// El cliente tendrá su propio dinero
    Cliente(double sumProductos) {
        dinero = dinero - sumProductos; 
    }
    //Obtener cuanto dinero tiene
    public double getDineroCliente(){
    return dinero;
    }
    //Aqui lo podremos dar el dinero que queramos
    public void setDinero(double dinero){
    this.dinero = dinero;
    }
    
}
