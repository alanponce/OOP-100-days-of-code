
package inventario;

/**
 *
 * @author Diego
 */
//Clase ProvedorVegetal que hereda de la clase Provedor
public class ProvedorVegetal extends Provedor{
    //Constructor de la calse 
    ProvedorVegetal(int i, String n, int t ){
        super(i, n, t);//se invoca el constructor de la clase padre
    
    }
    //metodo para obtener la informacion del provedor 
    public void getinfo(){
        System.out.print("\nID: "+ID+"\nNombre: "+Nombre+"\nTelefono: "+telefono);
    }
}
