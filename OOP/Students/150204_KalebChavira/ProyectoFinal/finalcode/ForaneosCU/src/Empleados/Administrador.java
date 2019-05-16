/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;//clase que pertence al paquete de empleados

import LogIn.login;//importamos la clase login para poder invocarlo e iniciar sesion en el sistema


public class Administrador extends Empleado {//clase administrador que hereda los atributos y metodos de empleado

   

    @Override//metodo sobre escrito
    public void recibirpago() {//metodo sobrescrito  donde el empleado recibe el pago
        System.out.println("Aqui el Administrador debe de implementar el metodo de recibir su pago");//mensaje donde se ve ejecutada accion de recibir pago
    }

    @Override//metodo sobre escrito
    public void Entrada() {//metodo sobrescrito  donde el empleado registra entrada
      System.out.println("Aqui el Admnistrador debe de checar la entrada a su hora de trabajo");//mensaje del cliente donde registra entrada
    }

    @Override//metodo sobre escrito
    public void Salida() {//metodo sobrescrito  donde el empleado registra salida
        System.out.println("Aqui el Admnistrador debe de checar la salida de su hora de trabajo");//mensaje del cliente donde registra salida
    }

    public void login() {//metodo de login para ingresar al sistema de reservaciones
        login ir = new login();//instanciamos un objeto
        ir.setVisible(true);//hacemos que el objeto haga visible su clase
    }

 private void Crud(){//metodp que pertenece al administrador pero para que tenga acceso al crud debe pasar por el login
     System.out.println("El administrador despues del login tiene acceso al crud");//mensaje del crid despues de login
}
}
