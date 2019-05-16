/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Habitaciones;//clase que pertenece al paquete de habitaciones

/**
 *
 * @author compu
 */
public class Triple extends Habitaciones {//clase que hereda de la clase habitaciones
     String Nombre = "Triple";//nombre de la habitacion
    int precio = 800;//precio de la habitacion en pesos mexicanos
    int capacidad = 3;//capacidad de la habitacion en personas

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
