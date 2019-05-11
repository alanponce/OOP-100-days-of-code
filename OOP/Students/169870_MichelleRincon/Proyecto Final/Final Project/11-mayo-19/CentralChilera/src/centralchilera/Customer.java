

package centralchilera;
import javax.swing.JOptionPane;
/**
 *
 * @author tanya
 */
public class Customer implements Records, Delete{

    private String RFC;
    private String ContactPhone;
    private String Id_Customer;
    private String Name;
    
    public Customer (){   
    }
    
    public String getRFC(){
        return RFC;
    }
    
    public String getContactPhone(){
        return ContactPhone;
    }
    
    public String getName(){
        return Name;
    }
    
    public String getIdCustomer(){
        return Id_Customer;
    }
    
    @Override
    public void deleteInformation(){
        this.ContactPhone = null;
        this.Id_Customer = null;
        this.Name = null;
        this.RFC = null;
    }

    @Override
    public void Show() {
        if(getContactPhone() != null && getIdCustomer() != null && getName()!=null &&getRFC()!=null)
            JOptionPane.showMessageDialog(null, getIdCustomer()+"   "+getName()+"   "+getRFC()+"    "+getContactPhone(), "Customer Information", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "There is not customer", "Error", JOptionPane.WARNING_MESSAGE);   
    }

    @Override
    public void New() {
        Id_Customer = JOptionPane.showInputDialog(null,"Id", "1");
        ContactPhone = JOptionPane.showInputDialog(null, "Contact Phone: ", "656-123-45-67");
        RFC = JOptionPane.showInputDialog(null, "RFC", "ABC 680524 P-76");
        Name = JOptionPane.showInputDialog(null, "Name", "Jorge Ovando");
    }

    @Override
    public void Delete() {
        JOptionPane.showMessageDialog(null,"The information has been deleted.", "Customer Information", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void Refresh() {
        Id_Customer = JOptionPane.showInputDialog(null,"New Id", "1");
        ContactPhone = JOptionPane.showInputDialog(null, "New Contact Phone: ", "656-123-45-67");
        RFC = JOptionPane.showInputDialog(null, "New RFC", "ABC 680524 P-76");
        Name = JOptionPane.showInputDialog(null, "New Name", "Jorge Ovando");
    }
}