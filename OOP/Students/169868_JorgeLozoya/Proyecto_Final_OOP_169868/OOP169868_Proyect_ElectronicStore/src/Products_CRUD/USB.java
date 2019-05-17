/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Products_CRUD;

/**
 *
 * @author 169868
 */
public class USB extends Producto{
    //Caracteristica especial de una USB: su capacidad de memoria
    private int capacidadGB; //Medido en GB
    public USB(int ID, String nombre, double price, int stock,int GB) {
        super(ID, nombre, price, stock);
        this.capacidadGB = GB;
    }
    public void imprimirDatos(){
                           System.out.println("**Datos del producto: ** \n"
                           +"ID: "+getID()+"\n"
                           +"Nombre: "+getNombre()+"\n"
                           +"Precio: $"+getPrecio()+"\n"
                           +"GB: "+getGB()+"\n");
    }
    //Obtenemos la capacidad de GB de memoria
    public int getGB(){
    return capacidadGB;
    }
}