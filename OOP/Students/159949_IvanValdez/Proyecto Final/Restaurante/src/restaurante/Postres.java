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
public class Postres extends Productos{//declaro la clase Postres que hereda de la clase abstracta Productos
    private String sabor;//declaro la variable tipo String llamada sabor, con modificador de acceso privado
    
    public Postres(int idproducto,String nombre, double precio, String tipo, String descripcion,String sabor){//declaro el constructor de la clase empleados con sus respectivos argumentos
    super(idproducto,nombre, precio, tipo, descripcion);//usando la palabra reservada super llamamos al constructor de la clase padre Productos
    this.sabor=sabor;//le asigno el valor a la variable sabor de la clase con el parametro recibido. 
    }
    
    public String getSaborPostres(){//metodo para obtener el sabor, con modificador de acceso publico y que retorna un string
        return this.sabor;
    }
    
    public void SetSaborPostres(String sabor){//metodo que nos permite poner el sabor, con modificador de acceso publico, recibe un String y retorna void
        this.sabor=sabor;
    }
    
}
