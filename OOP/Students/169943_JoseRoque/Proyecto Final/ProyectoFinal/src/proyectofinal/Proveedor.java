package proyectofinal; // el nombre del paquete es proyecto final

public class Proveedor { // el nombre de la clase se llama proveedor 
    private static final String nom_proveedor ="gerardo"; // se crea una variable final ya que el nommbre del provedor es unico y no se cambiara de nombre durante el proceso de ejecucion del programa
    private static final int ID =17000; // private para la encapsulacion, static ya que se utilizara dentro de un metodo statico , final se utiliza ya que un ID en unico y no deberia cambiar durante el proceco y es de tipo entero
    private static String product; // private para aplicar enncpsulacion, solo de esa
    private static String product_new; // un atributo de tipo private( que solo se pueda usar de la misma clase) que sra de tipo string, que sera estatico ya que dentro de los metodos estaticos que se estara utilizando 
    // debe ser estatico
    
    public static void Agregar_Producto(String product){ // se crea un metodo estatico en el cual se llamara agregar producto, este recibira un parametro o argumento llamado producto de tipo string
        System.out.println("El producto agregado fue"); // se imprime en pantalla lo que esta entre parentesis
        System.out.println(product); // se imprime en pantalla lo que tiene la variable producto que sera el que recibee el parametro del metodo estatico al usarlo
    }
    public static void Consultar_pedido(){ // sse crea un metodo estatico de tipo void 
        System.out.println(product); // imprimira lo que recibio el metodo estatico agregar producto para poder consultar el pedido
    }
    public static void Registrar_productos_vendidos(String product_new){ // se crea un metodo statico de tipo void en el cual no devolvera un return y recibira como parametro una variable de tipo string siendo este el producto nuevo a agregar 
     System.out.println("El producto nuevo registrado es:"+product_new); // se imprime lo que este entre parentesis y se agrega lo que tiene la variable product_new que es el que recibio de parametro al utilizar el metodo estatico
    }
    public static void Obtener_salario(){ // se crea un metodo estatico de tipo void en el cual se llamara obtener salario en el cual solo dira el salario quetiene el trabajador
    System.out.println("El salario es de 1700"); // se imprime en pantalla lo que esta entre parentesis
    }
    
}
