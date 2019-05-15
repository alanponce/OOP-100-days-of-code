package chilera;

/**
 *
 * @author tanya
 */

//clase que implementa de la interfaz view
public class Products implements View{
    /*variables declaradas como modificador de acceso protected 
    para que pueda ser heredado por otras subclases*/
    protected int IdProduct; 
    protected String name;
    protected String price;
    
    //constructor de la clase que encapsula las variables protected de la clase
    public Products(int IdProduct, String name, String price){
        this.IdProduct = IdProduct;
        this.name = name;
        this.price = price;
    }
    
    //metodos get devuelven el valor que esta almacenado en las variables
    public int getIdProduct(){
        return IdProduct;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPrice(){
        return price;
    }
    
    //metodo implementado de la interfaz que se encarga de imprimir los datos
    @Override
    public void Show(){
        System.out.println("Id: "+getIdProduct()+"\nName: "+getName()+"\nPrice: "+getPrice());
    }
}
