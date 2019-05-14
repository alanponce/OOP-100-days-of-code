/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;

/**
 *
 * @author compu
 */
public class EmpleadoOtro implements Empleado {

   @Override
    public void recibirpago() {
        System.out.println("Aqui el Empleado debe de implementar el metodo de recibir su pago");
    }

    @Override
    public void checarEntrada() {
      System.out.println("Aqui el Empleado debe de checar la entrada a su hora de trabajo");
    }

    @Override
    public void checarSalida() {
        System.out.println("Aqui el Empleado debe de checar la salida de su hora de trabajo");
    
    }
}
