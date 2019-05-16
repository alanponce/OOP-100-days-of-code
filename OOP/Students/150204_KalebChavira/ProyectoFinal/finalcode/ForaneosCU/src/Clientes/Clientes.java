/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;//paquete de clientes

import java.util.Scanner;//importamos la clase escaner para poder obtener un dato del teclado

public abstract class Clientes {//clase abstracta clientes, donde no se determina el tipo de cliente que es
    public int ID;//el cliente posee un identifcador para ver que numero de cliente es
    public String nombre;//toda persona tiene un nombre y este cliente cuenta con el atributo
    public String telefono;//el cliente tiene un telefono para poder contactarlo
    public String diaentrada;//el cliente tiene el dia el cual se va a hospedar
    public String diasalida;//dia el que el cliente termina su hospedaje
    Scanner sc = new Scanner(System.in);//scanner para caputarar datos del teclado
    
    public abstract void ChecarSalida();//metodo para ver si el cliente checo salida
    
      public abstract void ChecarEntrada();//metodo para ver si el cliente checo entrada
      public abstract void Pagar();//metodo para ver si el cliente ha hecho el pago
          
          public abstract void Hospedarse();//metodo para ver si el cliente sigue hospedado
}


