//constructor de la clase que recibe dos parametros de tipo entero
package inventario;

/**
 *
 * @author Diego
 */
//clase Cajero que hereda de la classe Empleado
public class Cajero extends Empleado{
    //la variable de tipo entero con un valor de 1800, se declara privada para que no pueda se modificada en otras clases
    private int salario = 1800;
    //constructor de la calse que recibe dos parametros de tipo entero
    public Cajero(int i, String n) {
        //se invoca el constructor de la clase padre
        super(i, n);
        int ID = i;
        String Nombre = n;
    }
    //metodo para obtener la informacion del cajero 
    public void getinfo(){
       System.out.print("\nID: "+ID+"\nNombre: "+Nombre+"\nSalario: "+salario);
   }
}
