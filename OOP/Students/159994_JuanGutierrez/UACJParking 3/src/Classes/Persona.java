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
public abstract class Persona {//Creamos una clase abstracta llamada persona con el modificador de acceso publico
    /*Declaramos la variables que contendra cada persona de manera privada*/
    private int matricula; //Declaramos la matricula como privada
    private String nombre,vehiculo;
    private boolean discapacidad,maestro;

    public Persona(int matricula, String nombre, String vehiculo, boolean discapacidad, boolean maestro) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.vehiculo = vehiculo;
        this.discapacidad = discapacidad;
        this.maestro = maestro;
    }
   
    
}
