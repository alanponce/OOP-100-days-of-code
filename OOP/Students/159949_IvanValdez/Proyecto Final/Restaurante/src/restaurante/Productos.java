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
public abstract class Productos{//declaro la clase abstracta Productos con un modificador de acceso publico
    private final int idproducto;//declaro la variable de tipo int llamada idproducto, con modificador de acceso privado y de tipo final, ya que una vez que se le asigna un id a un producto, este no deberia de cambiar
    private String nombre;//declaro la variable tipo String llamada nombre, con modificador de acceso privado
    private String tipo;//declaro la variable tipo String llamada tipo, con modificador de acceso privado
    private String descripcion;//declaro la variable tipo String llamada descripcion, con modificador de acceso privado
    private double precio;//declaro la variable tipo double llamada precio, con modificador de acceso privado
    
    Productos(int idproducto,String nombre,double precio,String tipo,String descripcion){//declaro el constructor de la clase con sus respectivos argumentos 
        this.idproducto=idproducto;//le asigno el valor a la variable idproducto de la clase con el parametro recibido. 
        this.nombre=nombre;//le asigno el valor a la variable nombre de la clase con el parametro recibido. 
        this.precio=precio;//le asigno el valor a la variable pprecio de la clase con el parametro recibido. 
        this.tipo=tipo;//le asigno el valor a la variable tipo de la clase con el parametro recibido. 
        this.descripcion=descripcion;//le asigno el valor a la variable descripcion de la clase con el parametro recibido. 
    }
        
    public int getIdProducto(){//metodo para obtener el idproducto, con modificador de acceso publico y que retorna un int
        return this.idproducto;
    }
    
    public void SetNombre(String nombre){//metodo que nos permite poner el nombre, con modificador de acceso publico, recibe un String y retorna void
        this.nombre=nombre;
    }
    
    public String getNombre(){//metodo para obtener el nombre, con modificador de acceso publico y que retorna un String
        return this.nombre;
    }
    
    public void SetPrecio(double precio){//metodo que nos permite poner el precio, con modificador de acceso publico, recibe un double y retorna void
        this.precio=precio;
    }
    
    public double getPrecio(){//metodo para obtener el precio, con modificador de acceso publico y que retorna un double
        return this.precio;
    }
    
    public void SetTipo(String tipo){//metodo que nos permite poner el tipo, con modificador de acceso publico, recibe un String y retorna void
        this.tipo=tipo;
    }
    
    public String getTipo(){//metodo para obtener el tipo, con modificador de acceso publico y que retorna un String
        return this.tipo;
    }
    
    public void SetDescripcion(String descripcion){//metodo que nos permite poner el descripcion, con modificador de acceso publico, recibe un String y retorna void
        this.descripcion=descripcion;
    }
    
    public String getdescripcion(){//metodo para obtener la descripcion, con modificador de acceso publico y que retorna un String
        return this.descripcion;
    }   
}

