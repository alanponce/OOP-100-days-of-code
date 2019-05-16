package chilera;

/**
 *
 * @author tanya
 */

//clase que hereda de la clase padre products
public class Chilies extends Products{
    /*variables declaradas como modificador de acceso protected 
    para que pueda ser heredado por otras subclases*/
    protected int IdChilies;
    
    /*constructor de la clase que encapsula las variables protected de la clase 
    y a su vez invoca al constructor de la clase padre*/
    public Chilies(int IdProduct, int IdChilies, String name, String price){
        super(IdProduct, name, price);
        this.IdChilies = IdChilies;
    }
    
    //metodos get devuelven el valor que esta almacenado en las variables
    public int getIdChilies(){
        return IdChilies;
    }
}
