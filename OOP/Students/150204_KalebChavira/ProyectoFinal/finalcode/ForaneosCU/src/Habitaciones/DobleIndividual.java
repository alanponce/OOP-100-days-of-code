/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Habitaciones;//clase que esta ubicada en el paquete de habitaciones

/**
 *
 * @author compu
 */
public class DobleIndividual extends Doble{//clase donde hereda la cantidad de personas sus metodos

     String Nombre = "Doble Individual";//nombre de la habitacion
    int precio = 1000;//precio de la habitacion en pesos mexicanos

    
      @Override//metodo sobreescrito con diferentes parametros
    public void limpieza() {//metodo donde la habitacion es limpiada
               System.out.println("La habitacion sera limpiada");
        System.out.println("...");
        System.out.println("La habitacion se limpió");
    }

    @Override//metodo sobreescrito con diferentes parametros
    public void rentar() {//metodo donde la habitacion es rentada por un cliente
        System.out.println("Esta habiatacion puede ser rentada");//mensaje de donde se efectua la accion de rentar
    }
    
}
