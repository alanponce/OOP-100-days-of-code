//constructor de la clase que recibe dos parametros de tipo entero
package inventario;

/**
 *
 * @author Diego
 */
//Clase Cocinero que hereda de la clase Empleado
public class Cocinero extends Empleado{
    //la variable de tipo entero con un valor de 1600, se declara privada para que no pueda se modificada en otras clases
    private int salario = 1600;
    //constructor de la calse que recibe dos parametros de tipo entero
    public Cocinero(int i, String n) {
        //invoca el constructor de la calse padre
        super(i, n);
        
    }
    //Metodo para ver la informacion del cocinero
   public void getinfo(){
       System.out.print("\nID: "+ID+"\nNombre: "+Nombre+"\nSalario: "+salario);
   }
}
