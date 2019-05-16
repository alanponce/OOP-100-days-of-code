package proyectofinal; // el nombre del paquete tendra como nombre proyecto final

public class Director_de_operaciones extends Empleado{ // la clase publica  =hereda de la clase empleado, obteniendo los metodos y atributos de esta

    public Director_de_operaciones(String Nombre, String Apellido) { //se crea al csontructor de la clase utillizando como parametros o argumentos el nombre y el apellido
        super(Nombre, Apellido); // se utiliza super yaqueesta heredando de clase abstracta o super, y para aclararlos se utiliza la palabra reservada super
    }

    public void Toma_de_desiciones(){ // se crea un metodo en el cual se llamada toma de desisionas en el cual solo tendra como 2 opciones
    System.out.println("2 opciones: agregar mas productos al inventario "); // se imprime en pantalla lo que esta entre comillas
    System.out.println("O llamar al empleado de limpieza"); // se imprime en pantalla lo que esta entre comillas
    }
    public void Establecer_estrategia(){ // se crea un metodo de tipo void en el cual no retornara un valor y se tomara a establewcer una estrategia
      System.out.println("Establecer estrategia"); // se imprime en pantalla lo que esta entre parentesis
     }
    public void Administrar_recursos(){ // se crea un metodo en el cual se llamara administrar recussos que en este no retornara un valor 
      System.out.println("Reacomodar recursos o de peliculas o de finanzas"); // se imprimira lo que esta en entre parente3sis
    }        
     @Override // este se utiliza para la sobreescritura que en el cual se utiliza para utilizar mos mismos metodos pero en diferentes clases
    public void Obtener_Salario() { //se crea un metodo publico de tipo void en el cual no retornara un valor qu8e tendra como nombre obtener salario que basicamente solo te dara el salario que obtiene el trabajadr
        System.out.println("El salario es de: 1000 "); // se imprime en pantalla lo que esta entre parentesis al ser llamada la funcion de la clase 
    }

    @Override  // este se utiliza para la sobreescritura que en el cual se utiliza para utilizar mos mismos metodos pero en diferentes clases
    public void Atender_cliente() {  //se crea un metodo publico de tipo void en el cual no retornara un valor qu8e tendra como nombre `atender cliente
    }
     
}
 