
package inventario;

/**
 *
 * @author Diego
 */
//clase Administrador qeu hereda de la clase empleado 
public class Administrador extends Empleado {
    
    //la variable de tipo entero con un valor de 4500, se declara privada para que no pueda se modificada en otras clases
    private int salario = 4500;
    public Administrador(int i, String n) {
        super(i, n);
        int ID = i;
        String Nombre = n;
    }
    //metodo de la para obtener la informacion del administrativo
    public void getinfo(){
       System.out.print("\nID: "+ID+"\nNombre: "+Nombre+"\nSalario: "+salario);
   }
}
