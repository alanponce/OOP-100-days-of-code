
package inventario;

/**
 *
 * @author Diego
 */
//clase provedor de carne que hereda de la clase Provedor
public class Provedorcarne extends Provedor{
    //Constructor de la calse 
    Provedorcarne(int i, String n, int t ){
        //se invoca el constructor de la calse padre
        super(i, n, t);
    
    }
    //metodo para obtener la informacion del provedor
    public void getinfo(){
        System.out.print("\nID: "+ID+"\nNombre: "+Nombre+"\nTelefono: "+telefono);
    }
}
