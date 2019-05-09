
package centralchilera;

public class Customers implements Process{
    private int Id_Customer;
    private String Name;
    private String RFC;
    private String ContactPhone;
    private int contCustomers;
    private String getId_Customer;
    private String getName;
    private String getRFC;
    private String getContactPhone;
    
    public Customers(int Id_Customer, String Name, String RFC, String ContactPhone){
        this.Id_Customer = Id_Customer;
        this.Name = Name;
        this.RFC = RFC;
        this.ContactPhone = ContactPhone;
        
        contCustomers++;
        System.out.println(contCustomers);
    }
    
    public void Create(int Id_Customer, String Name, String RFC, String ContactPhone){
        this.Id_Customer = Id_Customer;
        this.Name = Name;
        this.RFC = RFC;
        this.ContactPhone = ContactPhone;
    }
    
    public void Change(int Id_Customer, String Name, String RFC, String ContactPhone){
        this.Id_Customer = Id_Customer;
        this.Name = Name;
        this.RFC = RFC;
        this.ContactPhone = ContactPhone;
    }
    
    @Override
    public void Delete(){
        contCustomers--;
        System.out.println(contCustomers);
    }
    
    public int getId_Customer(){
        return Id_Customer;
    }
    
    public String getName(){
        return Name;
    }
    
    public String getRFC(){
        return RFC;
    }
    
    public String getContactPhone(){
        return ContactPhone;
    }
    
    
    @Override
    public void View(){
        System.out.println("Id_Customer = "+getId_Customer+
                            "Name = "+getName+
                            "RFC = "+getRFC+
                            "Contact Phone = "+getContactPhone);
    }

}