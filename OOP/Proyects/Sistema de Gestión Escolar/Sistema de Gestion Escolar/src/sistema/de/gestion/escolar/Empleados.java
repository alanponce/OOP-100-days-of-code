
package sistema.de.gestion.escolar;
public class Empleados {
   private String nombre;
   private String apellido;
   private int numEmpleado;
   private int numCasa;
   private String colonia;
   private int telefono;
   private int diaNacimiento;
   private int mesNacimiento;
   private int anoNacimiento;
   
   private int contador = 0;
   
   public void Empleados(){
       numEmpleado = contador++;
   }
   
   public void establecerNombre(String nombre){
       this.nombre = nombre;
   }
   
   public String obtenerNombre(){
       System.out.println("El nombre es: " + nombre);
       return nombre;
   }
   
}
