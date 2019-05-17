//Package that contains the classes in this project
package warehousesystem;
//Class that represents the ubication of the Object Item instanciated
public class Location {
    //Attribute of the Shelf in the Warehouse
    private String shelfNumber; 
    //Attribute for the bin in the Shelf
    private String bin; 
    
    //Constructor that contains all the required fields.
    Location(String shelf, String bin){
        shelfNumber=shelf; 
        this.bin=bin; 
    }
    
    //A get method that proporcionates the exact Location of an Item
    public String getLocation(){
        String info="ShelfNumber: "+shelfNumber+"\n Bin: "+bin; 
        return info; 
    }
}
