//Package that contains the classes in this project
package warehousesystem;
//The class manager is a specialized class of Employee, so this is a SubClass of it. 
public class Manager extends Employee implements WarehouseOperations{
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
    Manager(int id, String name, String birthDate, int eage, double esalary, String dpt){
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
    
    //method that allow us to eliminate completely an Item, by sending the id, and the stock that it is stored in.
    public boolean eliminateProduct(int id, Stock stock){
        //The Stock object sent in the parameter list uses its own  method to eliminate the Item
        return stock.eliminateItem(id);
    }
    //method that receives everything that a new product needs as a parameter so we can create a new instanciation of the class we want
    public boolean addNewProduct(String sizeType, Stock stock, int sn, String name, String brand, Location location, double price, Supplier supplier, int quantity, double size){
        //we need to know what kind of product we're creating so we send a String to identify it
        if((sizeType=="Liquids")||(sizeType=="liquids")){
            //we create the new instanciation of the class we wanted and call the constructor
            Liquids newProd = new Liquids(sn, name, brand, location, price, supplier, quantity, size); 
            //we add the new Item into a Stock to save it
            stock.addNewItem(newProd); 
            //return value 'case we created and add the new product into a Stock.
            return true;
        }
        //we need to know what kind of product we're creating so we send a String to identify it
        else if((sizeType=="Solids")||(sizeType=="solids")){
            //we create the new instanciation of the class we wanted and call the constructor
            Solids newProd = new Solids(sn, name, brand, location, price, supplier, quantity, size);
            //we add the new Item into a Stock to save it
            stock.addNewItem(newProd);
            return true;
        }
        else//in case nothing matches
            return false;
    }
}
