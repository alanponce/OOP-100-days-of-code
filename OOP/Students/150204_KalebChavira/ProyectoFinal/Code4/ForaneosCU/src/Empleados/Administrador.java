/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;

import LogIn.login;

/**
 *
 * @author compu
 */


public class Administrador implements EmpleadoRecepcion {

    @Override
    public void login() {
        login ir = new login();
        ir.setVisible(true);
    }

    @Override
    public void recibirpago() {
        System.out.println("Aqui el Administrador debe de implementar el metodo de recibir su pago");
    }

    @Override
    public void checarEntrada() {
      System.out.println("Aqui el Admnistrador debe de checar la entrada a su hora de trabajo");
    }

    @Override
    public void checarSalida() {
        System.out.println("Aqui el Admnistrador debe de checar la salida de su hora de trabajo");
    }

    
}
