/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;//Aqui se declara el paquete en el que se guardan todas las clases que estamos usando.

/**
 *
 * @author ivanv
 */
public interface Operaciones {//Declaro la interface Operaciones con modificador de acceso publico
    public Orden orden(int idOrder,Productos productos,int cantidad);//Metodo para crear un objeto de la clase Orden
}
