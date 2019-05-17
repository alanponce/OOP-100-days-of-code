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
public class Persona {
    //Clase madre donde las personas solo tienen un nombre
    private
            String nombre;
    public Persona(String nombre ){
    this.nombre = nombre; //Se guardará el nombre a la persona instanciada
    }
    //Metodo para recuperar el nombre
    public String getNombre(){return nombre;}
}
