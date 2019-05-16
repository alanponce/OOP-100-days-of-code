package proyectofinal; // el nombre del paquete es proyecto final

public class Persona_de_limpieza extends Empleado{ // la clase publica persona de limpieza hereda de la clase empleado, asi poder usar los metodos y atributos de la clase empleado
    
    public Persona_de_limpieza(String Nombre, String Apellido) { // se crea el constructor de la clase para inicializar los atributos que tiene
        super(Nombre, Apellido); // se utiliza super ya que esta utilizando los atributos de la clase padre empleado 
    }
    @Override // se aplica sobreescritura 
    public void Obtener_Salario() { // utilizando los metodos de la clase abstracta aplicando sobreescritura
        System.out.println("El salario es de 850"); // se imprime en pantalla lo que esta entre parentesis
    }
    @Override // la palabra reservada para aplicar sobreescritura
    public void Atender_cliente() { // utilizando los metodos de la clase abstracta aplicando sobreescritura
        System.out.println("Ayudar al cliente en caso de que tenga alguna duda"); // se imprime lo que esta entre parentesis
    }
    public void Hacer_Limpieza(){ // se crea un metodo en el culal se llama hacer limpieza y solo se checa si el lugar esta limpio
    System.out.println("El lugar esta limpio"); // se imprime lo que esta en pantalla
    }
    
}
