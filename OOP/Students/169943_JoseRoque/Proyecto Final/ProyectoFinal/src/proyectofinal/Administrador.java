package proyectofinal; //el nombre del paquete seraproyecto final

public class Administrador extends Empleado { // la clase publica administrador herreda de la clase empleado recibiendo losparametros y atributos de la clase
   private final int telefono; // se utuliza la variable de tipo entero llamado telefono ua que es un numero fijo que tendra el trabajador en caso de contactarlo
    // se utiliiza final ya quie no se cambiuara el valor durante su ejecucucioon, mas bien no se puede , saldria error si se quiere cambiar de valor

    public Administrador(String Nombre, String Apellido, int telefono) { // se crea el constructor der la clase adminsitrador que tendra como parametros el nombre el apellido y el numero de telkefono del administradoir
        super(Nombre, Apellido); // se utiliza super ya que los atributos son se la super clase y por lo tanto se utilia super para declararlo para el constructor
        this.telefono=telefono; // el this se utiliza ya que la variable telefono se creado en esta clase por lo tanto se utilizara la palabra reservada this 
    }

    @Override // se utiliza la sobreescritura con la palabra reservada  @override 
    public void Obtener_Salario() { // se sobreescribe el metodo obtenrer salario ya que cada empleado tiene diferente sueldo  
        System.out.println("El salario es de 2000"); // se imprime lo que esta entre comillas
    }
    @Override
    public void Atender_cliente() { // se sobreescribe el metodo atender cliente ya que cada empleado tiene diferente foirmas de atender un cliente  
        System.out.println("Que se le ofrece"); // se imprime lo que esta entre parenesis
    }
    public void Planeacion(){ // se crea el metodo llamado planeacion en el cual se planeara los proximos eventos del lugar
    System.out.println("Ver los planes de los productos por llegar"); // se imprime lo que esta entre parentesis
    }
    public void Organizacion(){ // se crea un metodo en el cual se llamara organizacioon y se tomara en cuenta lo organizacion del negocio
       System.out.println("Organizar y checar que todo este en orden"); // se imprime en pantalla lo que esta entre parentesis
    }
    public void Liderazgo(){
     System.out.println("Tomar las mejores desiciones para la empresa");
    }
}
