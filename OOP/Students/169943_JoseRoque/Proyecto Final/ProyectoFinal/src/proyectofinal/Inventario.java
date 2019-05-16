package proyectofinal; // el nombre del paquete se llama proyectofinal
public class Inventario { // se crea una clase public que se llamara inventario
    private int Cantidad_inicial; // se crea una variable de tipo entero en el cual estara privado 
    private int Cantidad_disponible; // se crea una variable de tipo entero en el cual estara privado 
    private String Producto; // se crea una variable de tipo string en el cual se llamara producto
    
    public static void Ingresar_producto(String producto, int Cantidad_inicial){ // se crea un metodo estatico en el cual tendra como parametros una variable de tipo string y otro de tipo entero
        System.out.println("Usted agrego esta cantidad:"+Cantidad_inicial +"de este producto"+producto);
        // se imprime en pantalla lo que esta entre pparentesis y tomando los  valores que tiene las variable de cantidad inicial y de producto
    }
    public static void Eliminar_producto(String producto){ // se crea un metodo estatico de tipo void en el cual recibira un parametor de tipo string llamado producto
      System.out.println("usted a eliminado"+producto); // se imprime lo que este entre parentesis y el valor recibido del metodo   
    }
    
}
