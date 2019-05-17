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
//Creamos una clase abstracta el cual contendra el cuerpo tecnico del equipo, esta clase hereda de equipo y a su vez es la clase padre de director,medico y utilero
public abstract class CuerpoTecnico extends Equipo
{
   //constructor de la clase la cual hereda a las clases hijas
    public CuerpoTecnico(String nombre, String apellido, int edad, double Id, int anioscontrato) {
        super(nombre, apellido, edad, Id, anioscontrato); 
    }
    
    /**
     *<p>Se obtiene la informacn referente a la persona del cuerpo tecnico que se desee
     */
    public abstract void obtenerInfo();//clase eclarada bastracta por que las clases hijas nsesitan esta funcion
}
