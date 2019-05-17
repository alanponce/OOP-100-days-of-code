//Package that contains the classes in this project
package warehousesystem;

//Abstract class of a Warehouse Employee, the attributes that this contains are what a Employee needs to be identified.
public abstract class Employee {
    //The next three attributes can be Final, 'cause whatever happens cannot change. 
    private int ID; 
    private final String NAME; 
    private final String BIRTHDATE; 
    //This ones are subject of change for the time spending and the bussines politics.
    private int age; 
    private double salary; 
    //Im proporcionating this only constructor in terms of Encapsulation by eliminating the no-arg constructor 
    //and just letting the one that contains all the required fields.
    Employee(int id, String name, String birthDate, int eage, double esalary){
        ID=id; 
        NAME=name; 
        BIRTHDATE=birthDate; 
        age=eage; 
        salary=esalary; 
    }
}
