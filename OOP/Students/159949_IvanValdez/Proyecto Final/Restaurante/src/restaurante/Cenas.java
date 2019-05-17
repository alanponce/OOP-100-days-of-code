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
public class Cenas extends Comidas{//declaro la clase cenas que hereda de la clase abstracta Comidas
    
    public Cenas(int idproducto,String nombre, double precio, String tipo, String descripcion,String ingredientes){//declaro el constructor de la clase empleados con sus respectivos argumentos
    super(idproducto,nombre, precio, tipo, descripcion,ingredientes);//usando la palabra reservada super llamamos al constructor de la clase padre Comidas
    }
}
