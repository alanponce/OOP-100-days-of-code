
package chilera;

/**
 *
 * @author tanya
 */
//clase que implementa de la interfaz view
public class Orders implements View{
    /*variables declaradas como modificador de acceso protected 
    para que pueda ser heredado por otras subclases*/
    protected int IdOrder;
    protected int IdCustomer;
    protected int IdProduct;
    protected double Total;
    
    //constructor de la clase que encapsula las variables protected de la clase
    public Orders (int IdOrder, int IdCustomer, int IdProduct, double Total){
        this.IdCustomer = IdCustomer;
        this.IdOrder = IdOrder;
        this.IdProduct = IdProduct;
        this.Total = Total;
    }
    
    //metodos get devuelven el valor que esta almacenado en las variables
    public int getIdOrder(){
        return IdOrder;
    }
    
    public int getIdCustomer(){
        return IdCustomer;
    }
    
    public int getIdProduct(){
        return IdProduct;
    }
    
    public double getTotal(){
        return Total;
    }
    
    //metodo implementado de la interfaz que se encarga de imprimir los datos
    @Override
    public void Show(){
        System.out.println("Id Order: "+getIdOrder()+"\nId Customer: "+getIdCustomer()+
                "\nId Product: "+getIdProduct()+"\nTotal: "+getTotal());
    }
}
