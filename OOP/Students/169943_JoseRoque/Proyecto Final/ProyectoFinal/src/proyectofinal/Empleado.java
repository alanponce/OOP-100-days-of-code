package proyectofinal; // el nombre del paquete tiene como nombre proyecto final

public abstract class Empleado extends Persona { // la clase empleado sera de tipo abstract que heredara de la clase abstracta persona 
    private int ID; // aqui se aplica encapsulacion ya que ponemos la variable entero ID en privado
    private String Departamento; // aqui se aplica encapsulacion ya que ponemos la variable String en privado

    public Empleado(String Nombre, String Apellido) { // se crea el constructor  (mismo nombre de la clase ) en el cual tendra como parametros
        // el nomnobre y el apellidoo
        super(Nombre, Apellido); // se utiliza suoer ya que es una clase abstracta aclarando los atributos nomobre y apellido y apoarte porque se hereda de la clae persona
        
    }
    public abstract void Obtener_Salario(); // al tener la clase abstracta, podemos nosotros crear metodos abstractos pero estos notendran cuerpos
    public abstract void Atender_cliente(); //solo tendra que usarse la palabra reservada "abstract"
    
      
    
}
