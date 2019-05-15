
package chilera;

/**
 *
 * @author tanya
 */

//clase que implementa de la interfaz view
public class Customers implements View{
    /*variables declaradas como modificador de acceso protected 
    para que pueda ser heredado por otras subclases*/
    protected int IdCustomer;
    protected String name;
    protected String rfc;
    protected String contactPhone;
    
    //constructor de la clase que encapsula las variables protected de la clase
    public Customers(int IdCustomer, String name, String rfc, String contactPhone){
        this.IdCustomer = IdCustomer;
        this.name = name;
        this.rfc = rfc;
        this.contactPhone = contactPhone;
    }
    
    //metodos get devuelven el valor que esta almacenado en las variables
    public int getId(){
        return IdCustomer;
    }
    
    public String getName(){
        return name;
    }
    
    public String getRfc(){
        return rfc;
    }
    
    public String getPhone(){
        return contactPhone;
    }
    
    //metodo implementado de la interfaz que se encarga de imprimir los datos
    @Override
    public void Show(){
        System.out.println("Id: "+getId()+"\nName: "+getName()+"\nRFC: "+getRfc()+"\nContact Phone: "+getPhone());
    }
}
