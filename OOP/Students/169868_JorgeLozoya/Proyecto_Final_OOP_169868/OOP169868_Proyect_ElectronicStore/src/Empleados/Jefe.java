/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;

/**
 *
 * @author 169868
 */
public class Jefe extends Empleado {
   // Constructor donde recupera los valores heredados de Empleado
    Jefe(String nombre, int ID, int salario){
    super(nombre,ID, salario);    
    }
    //Metodo sobreescrito para aumentar el salario
    @Override
    protected double aumentarSalario() {
        return salario += salario * .2; //el aumento será de un 20%
        }
}
