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
public class Cervezas extends Bebidas{//declaro la clase Cervezas que hereda de la clase abstracta Bebidas
    private String marca;//declaro la variable tipo String llamada marca, con modificador de acceso privado
    private final double gradosalcohol;//declaro la variable tipo double llamada gradosalcohol, con modificador de acceso privado
    
    public Cervezas(int idproducto,String nombre, double precio, String tipo, String descripcion, String marca,double gradosalcohol){//declaro el constructor de la clase empleados con sus respectivos argumentos
        super(idproducto,nombre, precio, tipo, descripcion);//usando la palabra reservada super llamamos al constructor de la clase padre Bebidas
        this.marca=marca;//le asigno el valor a la variable marca de la clase con el parametro recibido. 
        this.gradosalcohol=gradosalcohol;//le asigno el valor a la variable gradosalcohol de la clase con el parametro recibido. 
    }
    
    public String getMarca(){//metodo para obtener la marca, con modificador de acceso publico y que retorna un string
        return this.marca;
    }
    
    public double getGradosAlcohol(){//metodo para obtener el gradosalcohol, con modificador de acceso publico y que retorna un string
        return this.gradosalcohol;
    }
    
    public void SetMarcaCerveza(String marca){//metodo que nos permite poner la marca, con modificador de acceso publico, recibe un String y retorna void
        this.marca=marca;
    }
}
