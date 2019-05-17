//Package that contains the classes in this project
package warehousesystem;
//Class Stock that will store the Items or Products that we can have
public class Stock {
    //The Id is final so it cant change
    private final int ID; 
    //We need a Item obj to store in the class
    private Item stock; 
    //The number of items its given by the Manager of the warehouse, who creates the obj of Item
    private int numberofItems=0; 
    //The Capacity is final 'cause this is not supossed to be changed
    private final int CAPACITY=100;
    //the minimum and maximum are given by the manager based on the sales of the Product
    private int minimumRequired;
    private int maximumRequired; 
    
    //Stock's class constructor, in the parameter list are those that need to initialized
    Stock(int id, Item item, int max, int min){
        ID=id; 
        stock.setQuantity(item.getQTY());
        numberofItems+=stock.getQTY(); 
        minimumRequired=min; 
        maximumRequired=max; 
    }
    
    //get method that returns the ID of the Stock
    public int getID(){
        return ID; 
    }
    //method that returns a boolean true value is case the Stock is full, or false if its not
    public boolean isFull(){
        if(CAPACITY<numberofItems)
            return false; 
        else
            return true; 
    }
    
    //Method that allows us to elimanate an Item obj, by setting this class obj to null state
    public boolean eliminateItem(int ID){
        if(ID==stock.getSerialNumber())
            this.stock=null;
        else
            System.out.println("Wrong ID");
        //if the obj is null it returns True, that means that the obj has been eliminated correctly
        if(this.stock==null)
            return true; 
        //Otherwise, it returns false, Something went wrong
        else
            return false; 
    }
    
    //The system needs some alarms in case theres extra Items in storage, so we send the id of the object
    public int maximumRequired(Item id){
        //This line verifies that the id is the one in the Stock
        if(id.getSerialNumber()==stock.getSerialNumber())
            //and returns the max qty required
            return maximumRequired; 
        else
            //if its not the id it returns a 0
            System.out.println("Item not found");
            return 0;
    }
    
    //The system needs some alarms in case theres low Items in storage, so we send the id of the object
    public int minimumRequired(Item id){
        //This line verifies that the id is the one in the Stock
        if(id.getSerialNumber()==stock.getSerialNumber())
            return minimumRequired; 
        else
            //if its not the id it returns a 0
            System.out.println("Item not found");
            return 0;
    }
    
    //When a Order arrives we need to send the shipment and that means we need to remove items of a product, an Id in the parameter list of the method
    public boolean removeItems(int id, int qty){
        //Verification of the ID
        if(id==stock.getSerialNumber()){
            //We take out the required qty of the Stock
            numberofItems-=qty; 
            //We actualize the qty of the Item object
            stock.setQuantity(numberofItems); 
            //a true value returns to make sure that the op was done correctly
            return true;
        }
        else
            //in case of anything happens the false value is returned
            return false; 
    }
    
    //Method to add more product to the Stock 
    public boolean addItems(int id, int qty){
        //Verification of the ID
        if(id==stock.getSerialNumber()){
            //We get in the required qty of the Stock
            numberofItems+=qty; 
            //We actualize the qty of the Item object
            stock.setQuantity(numberofItems); 
            //a true value returns to make sure that the op was done correctly
            return true;
        }
        else
            //in case of anything happens the false value is returned
            return false; 
    }
    
    //Sometimes the Stock will allow another Item Type, so this method can change the Item Stored by sending the new Item
    public boolean addNewItem(Item item){
        //we change by changing the value of the Item attribute of Stock
        this.stock=item; 
        //the return bool value in case everything happened as its supossed to.
        return true; 
    }
}
