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
public class TV extends Producto{
    //Caracteristica especial del TV, la pantalla
    private int pantalla; //Medido en pulgadas
    public TV(int ID, String nombre, double price, int stock,int pantalla) {
        super(ID, nombre, price, stock);
        this.pantalla = pantalla;
    }
    public void imprimirDatos(){
                           System.out.println("**Datos del producto: **\n "
                           +"ID: "+getID()+"\n"
                           +"Nombre: "+getNombre()+"\n"
                           +"Precio: $"+getPrecio()+"\n"
                           +"Pantalla: "+getPantalla()+"\n");
    }
    //Obtenemos cuanto mide la pantalla de la televisiómn
    public int getPantalla(){
    return pantalla;
    }
}