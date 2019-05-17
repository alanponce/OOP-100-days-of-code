/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petstore;

/**
 *
 * @author hecto
 */
public class Client extends Person{
    private String Address;
    
    
    public String getAddress(){
     return Address;   
    }
    public void setAddress(String Address){
        this.Address=Address;
    }
    public void Buy(){
        System.out.println("Comprare esto: ");
        //Aqui se mencionara cuando se comprara algo
        
    }
}
