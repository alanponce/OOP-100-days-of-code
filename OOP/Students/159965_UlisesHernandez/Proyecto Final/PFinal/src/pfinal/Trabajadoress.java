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

   protected final String Nombre;
   protected final String Apellido;
   private int Edad;
   private final double ID;
   protected double Sueldo;
   protected int horasStaff;
   protected int minutosGuardias;
   protected float segundosTiendaStaff;
   
   Trabajadoress(String nombre,String apellido,int edad,double Id)
   {
       this.Apellido=apellido;
       this.Edad=edad;
       this.ID=Id;
       this.Nombre=nombre;
      
   }
   /**
    * <p>Obtiene las horas de trabajo del staff, estos solo se miden por horas, no importando si trabajaron algunos minutos extras
    * @param horas 
    */
   public void obtenerTiempoDeTrabajo(int horas)
   {
       this.horasStaff=horas;
   }
   
    /**
     *<p>Obtiene el tiempo trabajado de los guardias de seguridad puesto que a estos se les paga por horas y minutos
     * @param horas
     * @param minutos
     */
    public void obtenerTiempoDeTrabajo(int horas,int minutos)
   {
       int aux=minutos*60;
       this.minutosGuardias=aux+minutos;
   }
    
    /**
     *<p>Calcula el tiempo trabajado de las tiendas del estadio, puesto que a estas se les paga desde dias hasta los minutos
     * @param dias
     * @param horas
     * @param minutos
     */
    public void obtenerTiempoDeTrabajo(int dias,int horas,int minutos)
   {
       
   }
}
