
package centralchilera;

import javax.swing.JOptionPane;

/**
 *
 * @author tanya
 */
public class Orders implements Records, Delete{
    
    private String Id_Order;
    private String Id_Customer;
    private String Id_Product;
    private String Total;
    
    public String getIdOrder(){
        return Id_Order;
    }
    
    public String getIdCustomer(){
        return Id_Customer;
    }
    
    public String getIdProduct(){
        return Id_Product;
    }
    
    public String getTotal(){
        return Total;
    }
    
    @Override
    public void deleteInformation(){
        this.Total = null;
        this.Id_Product = null;
        this.Id_Customer = null;
        this.Id_Order = null;
    }
    
    @Override
    public void Show() {
        if(getIdOrder()!=null&&getIdProduct()!=null&&getIdCustomer()!=null&&getTotal()==null)
            JOptionPane.showMessageDialog(null, getIdOrder()+"   "+getIdProduct()+"   "+getIdCustomer()+"   "+getTotal(), "Product Information", JOptionPane.INFORMATION_MESSAGE);
        else
               JOptionPane.showMessageDialog(null, "There is not product", "Error", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void New() {
        Id_Order = JOptionPane.showInputDialog(null, "Id Order","1");
        Id_Product = JOptionPane.showInputDialog(null," Product", "1");
        Id_Customer = JOptionPane.showInputDialog(null, "Customer", "1");
        Total = JOptionPane.showInputDialog(null, "Total", "15.90");
    }

    @Override
    public void Delete() {
        JOptionPane.showMessageDialog(null,"The information has been deleted.", "Product Information", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void Refresh() {
        Id_Order = JOptionPane.showInputDialog(null, "New Id Order","1");
        Id_Product = JOptionPane.showInputDialog(null,"New Product", "1");
        Id_Customer = JOptionPane.showInputDialog(null, "New Customer", "1");
        Total = JOptionPane.showInputDialog(null, "New Total", "15.90");
    }
    
}
