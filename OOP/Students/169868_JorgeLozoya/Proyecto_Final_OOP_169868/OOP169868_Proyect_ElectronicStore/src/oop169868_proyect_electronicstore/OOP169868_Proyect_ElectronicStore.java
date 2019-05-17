/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop169868_proyect_electronicstore;

import Products_CRUD.*;
import Empleados.*;
/**
 *
 * @author 169868
 */
public class OOP169868_Proyect_ElectronicStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Laptop l; //Creamos un producto
    TV tv;
    //int ID, String nombre, double price, int stock,int memoriaRAM,String procesador
        l = new Laptop(10000,"Acer RedWine",15203.22,5,16,"intel Core i5 7ma Generacion");
        
        l.imprimirDatos();
        l.setPrecio(56123.51);
        l.imprimirDatos();
        //Parametros para 4K TV: int ID, String nombre, double price, int stock, int pantalla
        tv = new TV(12000,"LG 4K HD HQ OmegaPlusPlus",12325.251, 3, 64);
        tv.imprimirDatos();
      //public Ticket(int ID, String nombre, double price, int stock)
      Ticket ticket1 = new Ticket(tv.getID(),tv.getNombre(),tv.getPrecio(),tv.getStock());
        System.out.println("Numero de ticket: "+ticket1.getNumeroTicket());
        
      //String nombre, int ID, int salario
       // Empleado Kurt = new Jefe("Kurt",123456,500000);  //Provoca error ya que jefe no esta publico
       Empleado kurt = new Manager("Kurt",123456,200000);
       kurt.getID();
       
    }
    
}
