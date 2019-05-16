package proyectofinal; // el nombre de paquete es proyectofinal

public abstract  class Persona { //se hace una clase abstracta en el cual  tendra nombre persona
    //la clase abstracta no puede ser instanciada pero pueden crearse subclases sobre la base de la clase abstracta
    // y se crean instancias de estas subclases
    //atributos
    String Nombre; // se crea una variable de tipo string con el nombre "nombre" por default
    String Apellido; // se crea una variable de tipo string con el nombre "Apellido" por default

    //Metodo constructor sirve para la inicializacion de los atributos de esta clase
    public Persona(String Nombre, String Apellido) { // aqui se crea el constructor en el cual recibira parametros de nombre y string
        this.Nombre = Nombre; // ayudamos al constructor a inicializar los atributos de la clase persona
        this.Apellido = Apellido; //ayudamos al constructor a inicializar los atributos de la clase persona
    }

    public String getNombre() { // se crea el sstter para crear un metodo y obtener el nombre de la persona  
        return Nombre; // va a retornar o devolver la variable nombre al llamar la funcion
    }

    public String getApellido() {// se crea el sstrer para crear un metodo y obtener el apellido de la persona
        return Apellido; // lo que va a hacer es retornar o devolver la variable apellido al llamar el metodo
    }
    
}
