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
public class Producto implements Inventario{
    private
            int ID;
            String nombre;
            double price;
            int stock;
   
    public Producto(int ID, String nombre, double price, int stock) {
        this.ID = ID;
        this.nombre = nombre;
        this.price = price;
        this.stock = stock;
    }
//Se sobrescriben los metodos declarados en la interfaz y se le un cuerpo
    //setXXXXX = cambiar el valor
    //getXXXXX = Obtener el valor
    @Override
    public void setPrecio(double a) {
        this.price = a;
    }

    @Override
    public double getPrecio() {
        return price;
    }

    @Override
    public void setID(int a) {
        this.ID = ID;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public int getStock(){
        return stock;
    }
    //Metodo para imprimir los datos de un objeto por default
    public void imprimirDatos(){
        System.out.println("**Datos del producto: **\n "
                           +getID()+"\n"
                           +getNombre()+"\n"
                           +getPrecio()+"\n");
                           
    }
}
