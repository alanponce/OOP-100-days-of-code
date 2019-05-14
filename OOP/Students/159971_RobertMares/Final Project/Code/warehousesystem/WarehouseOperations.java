
package warehousesystem;

public interface WarehouseOperations {
    public boolean addItems(int id, int qty, Stock stock); 
    public boolean removeItems(int id, int qty, Stock stock);
}
