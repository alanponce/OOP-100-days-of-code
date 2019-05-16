/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;//clase que pertenece al paquete de empleados

/**
 *
 * @author compu
 */
public abstract class Empleado  {//clase abstracta de empleado, no se especifica que tipo de empleado es
    
    public abstract void recibirpago();//metodo donde el empleado recibe su pago
    public abstract void Entrada();//metodo donde el empleado registro su entrada
    public abstract void Salida();//metodo donde el empleado registro su salida
         
}
