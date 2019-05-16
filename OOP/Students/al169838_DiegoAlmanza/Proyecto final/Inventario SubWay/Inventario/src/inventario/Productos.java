//Paquete en el que se encontraran las calses usadas ene ste proyecto 
package inventario;

/**
 *
 * @author Diego
 */

public class Productos {
    //Variables de tipo int, delclaradas protected para poder heredarlas a las subclases
    protected int ID;
    protected int Cantidad;
    //constructor de la clase que recibe dos parametros de tipo entero
    Productos(int i, int c){
        ID = i;
        Cantidad = c;
    }
    
}
