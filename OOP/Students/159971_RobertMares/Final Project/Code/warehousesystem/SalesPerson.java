
package warehousesystem;

public class SalesPerson extends Employee{
    //we need the same attributes
    private int ID; 
    private String NAME; 
    private String BIRTHDATE; 
    //This ones are subject of change for the time spending and the bussines politics.
    private int age; 
    private double salary; 
    //To specify the class we need to know the department that this employee is assinged to, and difers him from other Employee types
    private String dpt;
    //This class constructor
    SalesPerson(int id, String name, String birthDate, int eage, double esalary, String dpt){
        //Using the keyword allow us to use the constructor of its Father Class, with the Attributes that the share
        super(id, name, birthDate, eage, esalary);
        //And the attributes that only the Class needs, needs to be initialized in its own constructor
        this.dpt=dpt; 
    }
    
    public void createOrder(){
        
    }
}
