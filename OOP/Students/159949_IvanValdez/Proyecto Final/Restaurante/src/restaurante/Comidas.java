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
public abstract class Comidas extends Productos{
    private String ingredientes;
    
    public Comidas(int idproducto,String nombre, double precio, String tipo, String descripcion,String ingredientes){
        super(idproducto,nombre, precio, tipo, descripcion);
        this.ingredientes=ingredientes;
    }
}
