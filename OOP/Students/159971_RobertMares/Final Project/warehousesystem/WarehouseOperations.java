//Package that contains the classes in this project
package warehousesystem;
//Im declarin this interface for the common operations made in the warehouse
public interface WarehouseOperations {
    //One of the methods is to add new existent items of Product, we send the id of the Product, the quantity, and the Stock its stored in.
    public boolean addItems(int id, int qty, Stock stock); 
    //One of the methods is to remove new existent items of Product, we send the id of the Product, the quantity, and the Stock its stored in.
    public boolean removeItems(int id, int qty, Stock stock);
}
