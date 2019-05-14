/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author ivanv
 */
public class Cervezas extends Bebidas{
    private String marca;
    private float gradosalcohol;
    
    public Cervezas(int idproducto,String nombre, double precio, String tipo, String descripcion, String marca,float gradosalcohol){
        super(idproducto,nombre, precio, tipo, descripcion);
        this.marca=marca;
        this.gradosalcohol=gradosalcohol;
    }
    /*
    public void Agregar(String n, double p, String t, String d,String m,float g){
       
    }
    
    public void Eliminar(){
        
    }
    
    public void Buscar(){
        
    }*/
}
