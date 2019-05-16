//Paquete en el que se encontraran las calses usadas ene ste proyecto 
package inventario;

/**
 *
 * @author Diego
 */

public class Empleado {
    //Variables de tipo int, delclaradas protected para poder heredarlas a las subclases
    protected int ID;
    protected String Nombre;
    //constructor de la clase que recibe dos parametros de tipo entero
    Empleado(int i, String n){
        ID = i;
        Nombre = n;
    }
    //Metodo publico de tipo void para obtener la categoria de un empelado, recibe un parametrod e tipo int
    public void getCategoria(int ID){
        //si el ID es mayor o igual a 10 el empleado es administrativo
        if(ID <= 10){
            System.out.print("\nAdministrativo");
        }
        //si el ID esta entre 11 y 15 el empleado es Cocinero
        if(ID >= 11 && ID <= 15 ){
            System.out.print("\nCocinero");
        }
        //si el ID esta entre 16 y 20 el empleado es Cajero
        if(ID >= 16 && ID<= 20){
            System.out.print("\nCajero");
        }
        //Si el Id es mayor a 20 el Id es incorrecto
        if(ID > 20){
            System.out.print("\nID incorrecto");
        }
        
    }
}
