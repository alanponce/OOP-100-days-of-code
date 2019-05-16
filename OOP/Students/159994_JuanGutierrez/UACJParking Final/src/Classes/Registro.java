/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Scanner;

/**
 *
 * @author ENEMY345
 */
public class Registro {
    Scanner scan = new Scanner(System.in);//Este objeto es el que lee el teclado
    int matricula; //Declaramos la variable matricula
    String nombre;//Declaramos la variable nombre
    String vehiculo;//Declaramos la variable vehiculo
    boolean discapacidad;//Declaramos la variable discapacidad
    int[] matriculas = {};//Declaramos un array donde se guardaran datos
    String[] nombres = {};//Declaramos un array donde se guardaran datos
    String[] vehiculos = {};//Declaramos un array donde se guardaran datos
    boolean[] discapacitados = {};//Declaramos un array donde se guardaran datos
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
    public void addRegistro(int contador){//Este es el metodo que realiza el registro
        for(int i = 0; i <=  matriculas.length; i++)
        {
            if(i ==  contador)
            {
                matriculas[i] = matricula;
                nombres[i] = nombre;
                vehiculos[i] = vehiculo;
                discapacitados[i] = discapacidad;
                
            }
        }
    }
}
