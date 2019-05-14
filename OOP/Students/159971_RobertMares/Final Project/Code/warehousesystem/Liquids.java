//Package that contains the classes in this project
package warehousesystem;
//This is a SubClass of Item, in this Subclass the Size of the Item is in Liters cause its a Liquid
public class Liquids extends Item{
    //The Class needs an extra attribute, which is size in this case in Liters. The acces modifiers is Protected so the subclasses can 
    //access to them
    protected double sizeLiters; 
    
    //The Class constructor that calls the Father's Class constructor using super for the common attributes and initialize the size
    Liquids(int sn, String name, String brand, Location location, double price, Supplier supplier, int quantity, double size){
        //calls the father's constructor by the Super Keyword
        super(sn, name, brand, location, price, supplier, quantity);
        //initialize the new attribute
        this.sizeLiters=size; 
    }
    
    //A method  that shares the info of the Product
    public String getInfo(){
        //We save the info in a String, the instances of the Location and Supplier are using methods on its own implementation.
        String info="Serial Number: "+serialNumber+"\n Name: "+name+"\n Brand: "+brand+"\n Location"+location.getLocation()+"\n Price: "+price+"\n Supplier: "+supplier.getInfo()+"\n Quantity Available: "+quantity+"\n Weight: "+sizeLiters; 
        return info; 
    }
    
}
