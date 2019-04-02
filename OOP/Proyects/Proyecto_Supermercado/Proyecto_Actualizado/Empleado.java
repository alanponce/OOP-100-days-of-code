package proyecto.supermercado;
public abstract class Empleado{//La clase empleado se implementa para simular atributos y comportamientos de un empleado de supermercado.
  //Se declaran los atributos de la clase Empleado, que pueden ser heredadas por otras clases.
  protected String Nombre;
  protected String Puesto;
  //Se crea el método abstracto Presentación, que puede ser heredado por otras clases.
  public abstract void Presentacion();
      
}