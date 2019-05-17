/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;
import Products_CRUD.*;
/**
 *
 * @author 169868
 */
public class Manager extends Jefe{
    
    public Manager(String nombre, int ID, int salario) {
        super(nombre, ID, salario);
    }
    
    public Producto deleteProducto(Producto prod)
    {
        prod=null;
        return prod; // Se elimnará un producto
    }
    public Producto addProducto(int ID, String nombre, double price, int stock){
        Producto p=new Producto(ID,nombre, price, stock);
        return p;
    }
}
