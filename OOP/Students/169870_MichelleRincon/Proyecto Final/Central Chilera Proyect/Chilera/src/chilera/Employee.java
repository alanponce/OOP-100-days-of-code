
package chilera;

/**
 *
 * @author tanya
 */

public class Employee {
    /*variables declaradas como modificador de acceso protected 
    para que pueda ser heredado por otras subclases*/
    protected int IdEmployee;
    protected String name;
    protected String birthDate;
    protected int Age;
    
    //constructor de la clase que encapsula las variables protected de la clase
    public Employee(int IdEmployee, String name, String birthDate, int Age){
        this.IdEmployee = IdEmployee;
        this.Age = Age;
        this.name = name;
        this.birthDate = birthDate;
    }
    
    //metodos get devuelven el valor que esta almacenado en las variables
    public int getId(){
        return IdEmployee;
    }
    
    public String getName(){
        return name;
    }
    
    public String getBD(){
        return birthDate;
    }
    
    public int getAge(){
        return Age;
    }
}
