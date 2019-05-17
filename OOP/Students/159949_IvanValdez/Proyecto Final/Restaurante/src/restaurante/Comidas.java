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
public abstract class Comidas extends Productos{//declaro la clase abstracta comidas que hereda de la clase abstracta Productos
    private String ingredientes;//declaro la variable dipo String llamada ingredientes, con modificador de acceso privado
    
    Comidas(int idproducto,String nombre, double precio, String tipo, String descripcion,String ingredientes){//declaro el constructor con sus respectivos argumentos
        super(idproducto,nombre, precio, tipo, descripcion);//usando la palabra reservada super llamamos al constructor de la clase padre Productos
        this.ingredientes=ingredientes;//le asigno el valor a la variable ingredientes de la clase con el parametro recibido. 
    }
    
    public String getIngredientes(){//metodo para obtener el nombre, con modificador de acceso publico y que retorna un String
        return this.ingredientes;
    }
    
    public void SetIngredientes(String ingredientes){//metodo que nos permite poner los ingredientes, con modificador de acceso publico, recibe un String y retorna void
        this.ingredientes=ingredientes;
    }
}
