/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;

import Products_CRUD.Laptop;

/**
 *
 * @author 169868
 */
// Clase general empleado de donde derivaran algunas más
public abstract class Empleado extends Persona{
    // Las variables que tendrán los empleados son su:
    /*
    Identificación ID
    Nombre nombre
    Salario salario
    */
    private int ID;
    double salario;
    // Para evitar que estas funciones lleguen a ser usadas fuera del paquete
    // empleados se usará protected
    public Empleado(String nombre,int ID, double salario){
            super(nombre);
            this.ID = ID;
            this.salario = salario;
    }
    // Podemos cambiar el salario
    protected abstract double aumentarSalario();
              // Daremos los datos
    public int getID(){return ID;}

    
}
