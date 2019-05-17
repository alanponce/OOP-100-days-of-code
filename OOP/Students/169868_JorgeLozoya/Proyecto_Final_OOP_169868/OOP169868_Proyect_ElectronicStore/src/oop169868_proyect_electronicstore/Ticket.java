/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop169868_proyect_electronicstore;
import Products_CRUD.*;
/**
 *
 * @author 169868
 */
public class Ticket extends Producto {
    private int numeroDelTicket = 001;
    private double sumProductos = 0; //Se usara para generar un acumulable del total
    public Ticket(int ID, String nombre, double price, int stock) {
        super(ID, nombre, price, stock);
        numeroDelTicket++; //Para que no se repida nungun ticket
        //Se abrirá la caja registradora con cada ticket
        // en donde se irán pasando las cantidades
        Caja_Registradora suma = new Caja_Registradora(sumProductos);
        Cliente pagar = new Cliente(sumProductos);
    }
    public double getSumProductos(){
    return sumProductos;
    }
    public int getNumeroTicket(){
    return numeroDelTicket;
    }
}
