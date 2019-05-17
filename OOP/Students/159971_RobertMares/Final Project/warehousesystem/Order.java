//Package that contains the classes in this project
package warehousesystem;
//Public class of Order, to make changes in the Stock
public class Order {
    //Id of the obj
    private final int ID; 
    //Item of which the instanciation  will return the cost of the order
    private Item itemID; 
    //number of quantitys for the order of an Item 
    private int itemsOrdered;
    //a calculate value of the cost of the Order obj
    private double totalCost;
    
    //Constructor of the class and the parameters
    Order(int id, Item item, int numberProducts){
        this.ID=id;
        itemID=item; 
        this.itemsOrdered=numberProducts; 
    }
    
    //method to obtain the cost of the order
    public double getTotalCost(){
        //the totalcost attribute is calculated by the cost of the Item sent to the Order and the number of Items that we need
        totalCost=itemID.getCost()*itemsOrdered;
        //boolean return value
        return totalCost; 
    }
}
