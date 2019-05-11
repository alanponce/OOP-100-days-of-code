/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package centralchilera;
import javax.swing.JOptionPane;
/**
 *
 * @author tanya
 */
public class Customer implements Identification, Records {

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
    
    public void deleteInformation(){
        this.ContactPhone = null;
        this.Id_Customer = null;
        this.Name = null;
        this.RFC = null;
    }
    
    @Override
    public int Id_Customer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Id_Product() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Id_Order() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Show() {
        JOptionPane.showMessageDialog(null, getIdCustomer()+"   "+getName()+"   "+getRFC()+"    "+getContactPhone(), "Customer Information", JOptionPane.INFORMATION_MESSAGE);
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
        JOptionPane.showMessageDialog(null,"\n La informacion ha sido borrada.", "Customer Information", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void Refresh() {
        Id_Customer = JOptionPane.showInputDialog(null,"New Id", "1");
        ContactPhone = JOptionPane.showInputDialog(null, "New Contact Phone: ", "656-123-45-67");
        RFC = JOptionPane.showInputDialog(null, "New RFC", "ABC 680524 P-76");
        Name = JOptionPane.showInputDialog(null, "New Name", "Jorge Ovando");
    }
}