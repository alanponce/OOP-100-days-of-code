
package centralchilera;

import javax.swing.JOptionPane;

/**
 *
 * @author tanya
 */
public class Product implements Records, Delete{

    private String Name;
    private String Id_Product;
    private String Price;
    
    public Product(){
    }
    
    public String getName(){
        return Name;
    }
    
    public String getId(){
        return Id_Product;
    }
    
    public String getPrice(){
        return Price;
    }
    
    @Override
    public void deleteInformation(){
        this.Name = null;
        this.Id_Product = null;
        this.Price = null;
    }
    
    @Override
    public void Show() {
        if(getId()!=null&&getName()!=null&&getPrice()!=null)
            JOptionPane.showMessageDialog(null, getId()+"   "+getName()+"   "+getPrice(), "Product Information", JOptionPane.INFORMATION_MESSAGE);
        else
               JOptionPane.showMessageDialog(null, "There is not product", "Error", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void New() {
        Id_Product = JOptionPane.showInputDialog(null,"Id", "1");
        Name = JOptionPane.showInputDialog(null, "Name","Strawberry");
        Price = JOptionPane.showInputDialog(null, "Price", "15.90");
    }

    @Override
    public void Delete() {
        JOptionPane.showMessageDialog(null,"The information has been deleted.", "Product Information", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void Refresh() {
        Id_Product = JOptionPane.showInputDialog(null,"New Id", "1");
        Name = JOptionPane.showInputDialog(null, "New Name","Strawberry");
        Price = JOptionPane.showInputDialog(null, "New Price", "15.90");
    }
    
}
