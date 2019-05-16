package proyectofinal; // el nomnbre del paquete tiente como nombre proyecyofinal

public class Producto { // va a se runa clase publica llamada producto
    private String Nombre ="Pelicula"; // declaracion de la variable string llamado nombre que tendra como argumento pelicula
    private int Precio =1000; // declaracion de la variable entero precio que tiene como valor 1000 que sera de tipo private 
    private int ID=14200; // declaracion de la variable ID de tipo entero que estarea en privado que tendra un valor de 14200

    public String getNombre() { // se crea un metodo de tipo string llamado getnombre poara obtener el nombre dado del producto
        return Nombre; // retornara la variable nombre 
    }
 
    public int getPrecio() { // se crea un metodo de tipo entero llamado getprecio para obtener el precio dado del producto
        return Precio; // se retorna o devuelve el valor de la variable precio
    }

    public int getID() { // se crea un metodo de tipo entero llamado getid para consultar el id del producto en el cual es el metodo que se reconocera como objeto unico
        return ID; // se retorna la variable ID
    }
    
}
