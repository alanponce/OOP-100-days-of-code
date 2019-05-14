//Package that contains the classes in this project
package warehousesystem;
//Class for the Supplier of an Item
public class Supplier {
    //Attribute that's not subject to change, so it's final
    private final String RFC; 
    //Attributes of the contact info of the supplier
    private String name; 
    private String phone; 
    
    //Constructor that contains all the required fields.
    Supplier(String rfc, String name, String phone){
        RFC=rfc; 
        this.name=name; 
        this.phone=phone; 
    }
    
    //A get method that proporcionates the info of the Supplier of an Item
    public String getInfo(){
        String info="RFC: "+RFC+"\n Name: "+name+"\n Phone: "+phone; 
        return info; 
    }
}