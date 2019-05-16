
package inventario;

/**
 *
 * @author Diego
 */

public class Provedor {
    //se declaran las variables protected para que se pueda heredar a sus subclase
    protected int ID;
    protected int telefono;
    protected String Nombre;
    //constructor de la calse, recibe dos parametros de entero y uno de tipo String 
    Provedor(int i, String n, int t){
        ID = i;
        telefono = t;
        Nombre = n;
    }
    
            
}
