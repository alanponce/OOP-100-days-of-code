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
public class Refrescos extends Bebidas {
    private String sabor;
    private String marca;
    
    public Refrescos(int idproducto,String nombre, double precio, String tipo, String descripcion,String sabor, String marca){
        super(idproducto,nombre, precio, tipo, descripcion);
        this.sabor=sabor;
        this.marca=marca;
    }
    
    public void Agregar(String n, double p, String t, String d,String s,String m){
       
    }
    
    public void Eliminar(){
        
    }
    
    public void Buscar(){
        
    }
}
