//Package that contains the classes in this project
package warehousesystem;
//This is a SubClass of Item, in this Subclass the Size of the Item is in Kilograms cause its a Solid
public class Solids extends Item{
    //The Class needs an extra attribute, which is size in this case in Kilograms.
    //Access modifier is Protected so the Subclasses can access to them
    protected double sizeKilograms; 
    
    //The Class constructor that calls the Father's Class constructor using super for the common attributes and initialize the size
    Solids(int sn, String name, String brand, Location location, double price, Supplier supplier, int quantity, double size){
        //calls the father's constructor by the Super Keyword
        super(sn,name,brand,location,price,supplier,quantity);
        //initialize the new attribute
        sizeKilograms=size; 
    }
    
    //A method  that shares the info of the Product
    public String getInfo(){
        //We save the info in a String, the instances of the Location and Supplier are using methods on its own implementation.
        String info="Serial Number: "+serialNumber+"\n Name: "+name+"\n Brand: "+brand+"\n Location"+location.getLocation()+"\n Price: "+price+"\n Supplier: "+supplier.getInfo()+"\n Quantity Available: "+quantity+"\n Weight: "+sizeKilograms;  
        return info; 
    }
    
}
