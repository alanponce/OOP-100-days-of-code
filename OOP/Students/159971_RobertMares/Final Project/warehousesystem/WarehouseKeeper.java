//Package that contains the classes in this project
package warehousesystem;

public class WarehouseKeeper extends Employee implements WarehouseOperations{
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
    WarehouseKeeper(int id, String name, String birthDate, int eage, double esalary, String dpt){
        //Using the keyword allow us to use the constructor of its Father Class, with the Attributes that the share
        super(id, name, birthDate, eage, esalary);
        //And the attributes that only the Class needs, needs to be initialized in its own constructor
        this.dpt=dpt; 
    }
    
    //overriden methods of the WarehouseOPS interface
    @Override
    //method that allow us to add more products of an Item, by sending the id, quantity, and the stock that it is stored in.
    public boolean addItems(int id, int qty, Stock stock){
        //The Stock object sent in the parameter list uses its own add method with the parameters in this method
        return stock.addItems(id, qty); 
    } 
    //overriden methods of the WarehouseOPS interface
    @Override
    //method that allow us to remove products of an Item, by sending the id, quantity, and the stock that it is stored in.
    public boolean removeItems(int id, int qty, Stock stock){
        //The Stock object sent in the parameter list uses its own add method with the parameters in this method
        return stock.removeItems(id, qty);
    }
    
}
