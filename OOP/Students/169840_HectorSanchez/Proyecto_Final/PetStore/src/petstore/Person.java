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
public class Person {
        private String Name; //Variable  Nombre del empleado
        private int Age; //Variable  Edad del empleado
        
    public String getName(){
        return Name; //Obtener EmpName
    }
    public void setName(String Name){
        this.Name=Name;
    }
    
    public int getAge(){
        return Age;
    }
    public void setAge(int Age){
        this.Age=Age;
    }
}
