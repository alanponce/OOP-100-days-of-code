/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop169868_proyect_electronicstore;

/**
 *
 * @author 169868
 */
public class Caja_Registradora {
    double x = Math.random();
    public double numeroDeCaja = x; //No es necesario ocultar el numero de caja
       private double totalDeLaVenta;
    Caja_Registradora(double sumProductos){
        totalDeLaVenta += sumProductos;       
    }
    public double getTotalDeLaVenta(){return totalDeLaVenta;}
}
