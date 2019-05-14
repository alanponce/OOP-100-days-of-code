//Package that contains the classes in this project
package warehousesystem;

public class Stock {
    private final int ID; 
    private Item stock; 
    private int numberofItems=0; 
    private final int CAPACITY=100;
    private int minimumRequired;
    private int maximumRequired; 
    
    Stock(int id, Item item, int max, int min){
        ID=id; 
        stock.setQuantity(item.getQTY());
        numberofItems+=stock.getQTY(); 
        minimumRequired=min; 
        maximumRequired=max; 
    }
    
    public boolean isFull(){
        if(CAPACITY<numberofItems)
            return false; 
        else
            return true; 
    }
    
    public boolean eliminateItem(int ID){
        if(ID==stock.getSerialNumber())
            this.stock=null;
        else
            System.out.println("Wrong ID");
        
        if(this.stock==null)
            return true; 
        else
            return false; 
    }
    
    public int maximumRequired(Item id){
        if(id.getSerialNumber()==stock.getSerialNumber())
            return maximumRequired; 
        else
            System.out.println("Item not found");
            return 0;
    }
    
    public int minimumRequired(Item id){
        if(id.getSerialNumber()==stock.getSerialNumber())
            return minimumRequired; 
        else
            System.out.println("Item not found");
            return 0;
    }
    
    public boolean removeItems(int id, int qty){
        if(id==stock.getSerialNumber()){
            numberofItems-=qty; 
            stock.setQuantity(numberofItems); 
            return true;
        }
        else
            return false; 
    }
    
    public boolean addItems(int id, int qty){
        if(id==stock.getSerialNumber()){
            numberofItems+=qty; 
            stock.setQuantity(numberofItems); 
            return true;
        }
        else
            return false; 
    }
}
