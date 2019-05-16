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
public abstract class Persona {

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }
//Creamos una clase abstracta llamada persona con el modificador de acceso publico
    /*Declaramos la variables que contendra cada persona de manera privada*/
    private int matricula; //Declaramos la matricula como privada
    private String nombre,vehiculo;//Declaramos el nombre y el vehiculo privados
    private boolean discapacidad;//Declaramos la discapacidad como privada

    public Persona(int matricula, String nombre, String vehiculo, boolean discapacidad) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.vehiculo = vehiculo;
        this.discapacidad = discapacidad;
    }
   
    
}
