package Clase;

/**
 *
 * @author tanya
 */
public class Persona {
    private String name;
    private int age;
    
    public Persona(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
}