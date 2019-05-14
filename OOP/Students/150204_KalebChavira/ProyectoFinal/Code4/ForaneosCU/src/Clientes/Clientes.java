/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import java.util.Scanner;

/**
 *
 * @author compu
 */
public abstract class Clientes {
    public int ID;
    public String nombre;
    public String telefono;
    public String diaentrada;
    public String diasalida;
    Scanner sc = new Scanner(System.in);
    
    public abstract void ChecarSalida();
    
      public abstract void ChecarEntrada();
      public abstract void Pagar();
          
          public abstract void Hospedarse();
}


