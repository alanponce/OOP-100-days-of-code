/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;

/**
 *
 * @author 169868
 */
public class Cajero extends Jefe{
    //Sumará todo lo que ha vendido
  private double ventasDelDia = 0;
    public Cajero(String nombre, int ID, int salario) {
        super(nombre, ID, salario);
    }  
  public void sumVentasDelDia(){
      ventasDelDia += ventasDelDia; //Se sumaran sus propias ventas
  }
}
