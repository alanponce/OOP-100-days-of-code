/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfinal;

/**
 *
 * @author Ulises
 */
public abstract class Trabajadoress{

    //atributos los cuales heredaran las subclases
   private final String Nombre;
   private final String Apellido;
   private int Edad;
   private final double ID;
   protected double Sueldo;
   protected int horasStaff;
   protected int minutosGuardias;
   protected float SegundosTiendaStaff;
  
   Trabajadoress(String nombre,String apellido,int edad,double Id)//constructor de la clase
   {
       this.Apellido=apellido;
       this.Edad=edad;
       this.ID=Id;
       this.Nombre=nombre;
      
   }
 
    /**
     *<p>Obtiene el tiempo trabajado de los guardias de seguridad puesto que a estos se les paga por minutos
     * @param horas
     * @param minutos
     */
    public void obtenerTiempoDeTrabajo(int horas,int minutos)
   {
       int aux=minutos*60;
       this.minutosGuardias=aux+minutos;
   }
    
    /**
     *<p>Calcula el tiempo trabajado de las tiendas del estadio el cual se cuenta por minutos y segundos. Se le suman 180 minutos o 90 segun el gerente.
     * @param totalMinuSec
     * @param minutos
     */
    public void obtenerTiempoDeTrabajo(float totalMinuSec,int minutos)
   {
       float aux;
       aux = totalMinuSec+minutos;
       this.SegundosTiendaStaff=aux;
   }
    
    public double getSueldo() //declaramos un metodo con modificado de acceso public, con retorno double
    {
       return this.Sueldo;//retornamos el atributo sueldo 
    }
    
    
    /**
     * <p>Metodo para obtener el atributo edad de la clase en la que se implemente
     * @return 
     */
    public int getEdad()//declaramos un metodo con modificado de acceso public, con retorno int 
    {
        return this.Edad;//retornamos en atributo edad
    }
    
    /**
     * <P>Metodo para obtener el atributo id de la clase en la que se implemente
     * @return 
     */
    public double getID()//declaramos un metodo abtracto con modificado de acceso public, con retorno void y un parametro entero
    {
        return this.ID;
    }
    
    public String getNombre()//declaramos un metodo abtracto con modificado de acceso public, con retorno void y un parametro entero
    {
        return this.Nombre;
    }
    
    public String getApellido()//declaramos un metodo abtracto con modificado de acceso public, con retorno void y un parametro entero
    {
        return this.Apellido;
    }
}
