
package inventario;

/**
 *
 * @author Diego
 */
//clase provedor de pan que hereda de la clase Provedor 
public class Provedorpan extends Provedor{
    //Constructor de la calse 
    Provedorpan(int i, String n, int t ){
        //Se invoca al constructor de la calse padre
        super(i, n, t);
    
    }
    //metodo para obtener la iunformacion del provedor
    public void getinfo(){
        System.out.print("\nID: "+ID+"\nNombre: "+Nombre+"\nTelefono: "+telefono);
    }
}
