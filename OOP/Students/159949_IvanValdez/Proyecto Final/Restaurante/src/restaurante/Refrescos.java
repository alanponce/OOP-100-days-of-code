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
public class Refrescos extends Bebidas{//declaro la clase Refrescos que hereda de la clase abstracta Bebidas
    private String sabor;//declaro la variable tipo String llamada sabor, con modificador de acceso privado
    private String marca;//declaro la variable tipo String llamada marca, con modificador de acceso privado
    
    public Refrescos(int idproducto,String nombre, double precio, String tipo, String descripcion,String sabor, String marca){//declaro el constructor de la clase empleados con sus respectivos argumentos
        super(idproducto,nombre, precio, tipo, descripcion);//usando la palabra reservada super llamamos al constructor de la clase padre Bebidas
        this.sabor=sabor;//le asigno el valor a la variable sabor de la clase con el parametro recibido. 
        this.marca=marca;//le asigno el valor a la variable marca de la clase con el parametro recibido. 
    }
    
    public String getMarcaRefresco(){//metodo para obtener la marca, con modificador de acceso publico y que retorna un string
        return this.marca;
    }
    
    public String getSaborRefresco(){//metodo para obtener el sabor, con modificador de acceso publico y que retorna un string
        return this.sabor;
    }
    
    public void SetMarca(String marca){//metodo que nos permite poner la marca, con modificador de acceso publico, recibe un String y retorna void
        this.marca=marca;
    }
    
    public void SetMarcaRefresco(String sabor){//metodo que nos permite poner el sabor, con modificador de acceso publico, recibe un String y retorna void
        this.sabor=sabor;
    }
}
