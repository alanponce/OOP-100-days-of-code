/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author ENEMY345
 */
public class Moto implements Vehiculo{

    @Override
    public void CajEstacionamiento() {
        System.out.print("\nEstacionamiento: de 2 ruedas");
    }

    @Override
    public void Rueda() {
        System.out.print("\ntiene 2 ruedas: es una Moto");
    }

    
    
}
