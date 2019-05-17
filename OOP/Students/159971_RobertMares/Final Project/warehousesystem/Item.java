//Package that contains the classes in this project
package warehousesystem;
//This an Abstact class of a product in the Warehouse, it contains what every product has, except for its 
//weight,  that is specified in its subclasses.
public abstract class Item {
    //The attributes access modifier are Protected so the Subclasses can access to them. 
    protected int serialNumber; 
    protected String name; 
    protected String brand; 
    protected Location location; 
    protected double price; 
    protected Supplier supplier; 
    protected int quantity; 
    
    //Constructor of the Class.
    Item(int sn, String name, String brand, Location location, double price, Supplier supplier, int qty){
        serialNumber=sn; 
        //this.attribute is used to specify that the attribute from this class is the one that being initialized.
        this.name=name; 
        this.brand=brand; 
        this.location=location; 
        this.price=price; 
        this.supplier=supplier; 
        quantity=qty; 
    }
    
    //The next Methods are the methods that every Item of Object should perform.
    //This a get Method, that gives back the SerialNumber of the Product. The method is boolean to verify that has been processed well. 
    public int getSerialNumber(){
        return this.serialNumber; 
    }
    
    //A Method that changes the quantity of the Product by sending a new quantity.
    public boolean setQuantity(int qty){
        this.quantity=qty; 
        return true; 
    }
    //A method that returns the quantity of certain Item
    public int getQTY(){
        return quantity; 
    }
    //A method that returns the cost attribute of an Item
    public double getCost(){
        return this.price; 
    }
}
