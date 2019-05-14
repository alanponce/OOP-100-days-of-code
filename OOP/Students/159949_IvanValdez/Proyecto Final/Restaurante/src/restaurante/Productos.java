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
    private final int idproducto;//
    private String nombre;
    private String tipo;
    private String descripcion;
    private double precio;
    
    Productos(int idproducto,String nombre,double precio,String tipo,String descripcion){
        this.idproducto=idproducto;
        this.nombre=nombre;
        this.precio=precio;
        this.tipo=tipo;
        this.descripcion=descripcion;
    }
    /*
    public void SetId(int idproducto){
        this.idproducto=idproducto;
    }
    
    public int getId(){
        return idproducto;
    }
    
    public void SetNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void SetPrecio(double precio){
        this.precio=precio;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void SetTipo(String tipo){
        this.tipo=tipo;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void SetDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    
    public String getdescripcion(){
        return descripcion;
    }
    */      
}

