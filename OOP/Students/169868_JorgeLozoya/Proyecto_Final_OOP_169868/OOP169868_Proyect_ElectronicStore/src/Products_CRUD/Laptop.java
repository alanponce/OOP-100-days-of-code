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
public class Laptop extends Producto{
    //Caracteristica especial del Laptop
    private int memoriaRAM;//Medida en GB
    private String procesador; //Procesador de un computador
    
    public Laptop(int ID, String nombre, double price, int stock,int memoriaRAM,String procesador) {
        super(ID, nombre, price, stock);
        this.memoriaRAM = memoriaRAM;
        this.procesador = procesador;
    }
    public void imprimirDatos(){
                           System.out.println("**Datos del producto: **\n"
                           +"ID: "+getID()+"\n"
                           +"Nombre: "+getNombre()+"\n"
                           +"Precio: $"+getPrecio()+"\n"
                           +"Memoria RAM: "+getMemoriaRAM()+"\n"
                           +"Procesador: "+getProcesador()+"\n");
    }
    //Obtenemos las caracteristicas especiales de laptop
    public String getProcesador(){
    return procesador;
    }
    public int getMemoriaRAM(){
    return memoriaRAM;
    }
}