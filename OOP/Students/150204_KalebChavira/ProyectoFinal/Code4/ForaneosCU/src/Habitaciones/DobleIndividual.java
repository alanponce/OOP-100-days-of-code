/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Habitaciones;

/**
 *
 * @author compu
 */
public class DobleIndividual implements Habitaciones{

     String Nombre = "Doble Individual";//nombre de la habitacion
    int precio = 1000;//precio de la habitacion en pesos mexicanos
    int capacidad = 1200;//capacidad de la habitacion en personas
    
   @Override
     public void limpieza() {
               System.out.println("La habitacion sera limpiada");
        System.out.println("...");
        System.out.println("La habitacion se limpió");
    }

    @Override
    public void rentar() {
        System.out.println("Esta habiatacion puede ser rentada");
    }
}
