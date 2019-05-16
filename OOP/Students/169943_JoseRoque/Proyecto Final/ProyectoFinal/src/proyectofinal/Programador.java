package proyectofinal; // el paquete se llamara proyecto final
 
public class Programador extends Empleado { // la clase publica programador va a heredar de la clase empleado en el cual obtendra todos los metodos y atributos que esten dispinibles de acceso
    private String Conocimiento_de_programacion; // se crea una variable en privado de tipo string

    public Programador(String Nombre, String Apellido, String Conocimiento_de_programacion ) {  // se crea el cosntructor de la clase programador en el cual s¿tendra como paramtertros el nombre apellido y el conoocimiento del programador
        super(Nombre, Apellido); // se ulitiza super ya que esta aclarando de la clase super empleado e¿los atributos nombre y apellidos
        this.Conocimiento_de_programacion=Conocimiento_de_programacion; // se utiliza this yua que el atributo fue creado en estamisma clase por lo tanto ese utiliza this
    }

    @Override // es la sobreesctirua, la forma de declararla 
    public void Obtener_Salario() { // se sobreescribe el metodo obtener salkario ya que cada empleado tiene diferentes salarios
        System.out.println("El salario es de 1750"); // se imprime en poantalla klo que esta entre parentesis 
    }

    @Override // es la sobreescritura, se utiliza para usar loos mismos metodos pero en diferentes clases
    public void Atender_cliente() {  // se sobreescribe el metodo atender cliente ya que cada empleado tiene diferentes tipos de formas de atender un cliente o de ayudrlo
       System.out.println("El programa se actualizara dentro de poco"); //  se imprime en poantalla klo que esta entre parentesis 
    }
    public void Crear_Programa(){ // se crea un metodo de tipo void en el cual no dara un valor retornable
        System.out.println("Verificar los requisitos para el programa"); // se imprime en poantalla klo que esta entre parentesis 
    }
    public void Mantener_codigo(){ // se crea un metodo de tipo void en el cual no dara un valor retornable
    System.out.println("Verificar si hay fallas en el codigo y dar nuevas mejoras"); // se imprime en poantalla klo que esta entre parentesis 
    }
}
