/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chilera;

/**
 *
 * @author tanya
 */

//clase que hereda de la clase Chilies e implementa de la interfaz Name
public class Serrano extends Chilies implements Name{
//Se declaran las variables privadas para que solo sean invocadas dentro de la clase
    private String Name;
    
    /*constructor de la clase que encapsula las variables privadas de la clase 
    y a su vez invoca al constructor de la clase padre*/
    public Serrano(int IdProduct, int IdChilies, String Name, String price, String name){
        super(IdProduct, IdChilies, price, name);
        this.Name = Name; 
    }
    
    //metodo implementado de la interfaz que se encarga de regresar el valor almacenado en name
    @Override
    public String getName(){
        return Name;
    }
}