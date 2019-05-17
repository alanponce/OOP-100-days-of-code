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
public abstract class Bebidas extends Productos{//declaro la clase abstracta Bebidas que hereda de la clase abstracta Productos
    
    Bebidas(int idproducto,String nombre, double precio, String tipo, String descripcion) {//declaro el constructor con sus respectivos argumentos
        super(idproducto,nombre, precio, tipo, descripcion);//usando la palabra reservada super llamamos al constructor de la clase padre Productos
    }
    
}
