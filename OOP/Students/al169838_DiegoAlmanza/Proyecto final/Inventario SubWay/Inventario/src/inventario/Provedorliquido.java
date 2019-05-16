
package inventario;

/**
 *
 * @author Diego
 */
//clase provedor de liquidos que hereda de la clase Provedor
public class Provedorliquido extends Provedor {
    //Constructor de la calse
    Provedorliquido(int i, String n, int t ){
        //se invoca el constructor de la calse padre
        super(i, n, t);
    
    }
    //metodo para obtener la informacion del provedor
    public void getinfo(){
        System.out.print("\nID: "+ID+"\nNombre: "+Nombre+"\nTelefono: "+telefono);
    }
}
