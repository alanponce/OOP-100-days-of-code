
package herencia;

public class Persona {
    private String name;
    private String LastName;
    private int age;
    
    public Persona (String name, String LastName, int age) {
        this.name = name;
        this.LastName = LastName;
        this.age=age;
    }
    
    public String getName(){
        return name;
    }
    
    public String getLastName(){
        return LastName;
    }
    
    public int getAge(){
        return age;
    }
}