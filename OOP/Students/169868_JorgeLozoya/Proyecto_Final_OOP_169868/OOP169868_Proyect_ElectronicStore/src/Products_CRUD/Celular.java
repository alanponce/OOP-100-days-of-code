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
public class Celular extends Producto{
    //Caracteristica especial del celular
    private int camara; //Medido en MegaPixeles
    public Celular(int ID, String nombre, double price, int stock,int camara) {
        super(ID, nombre, price, stock);
        this.camara = camara; 
    }
    public void imprimirDatos(){
                           System.out.println("**Datos del producto: **\n "
                           +"ID: "+getID()+"\n"
                           +"Nombre: "+getNombre()+"\n"
                           +"Precio: $"+getPrecio()+"\n"
                           +"Camara: "+getCamara()+"\n");
    }
    //Obtenemos el dato de los pixeles de la camara
    public int getCamara(){
    return camara;
    }
}
