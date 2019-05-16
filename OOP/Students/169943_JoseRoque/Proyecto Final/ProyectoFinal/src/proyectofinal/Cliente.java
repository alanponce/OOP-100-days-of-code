package proyectofinal; // el nombre del paquete es proyecto final 


public class Cliente extends Persona{ // la clase cliente heredara de la clase abstracta persona 
    // recibiendo los atributos que tiene este 
    private String CustomerName; //se declara en privado la variable CustomerName de tipo String
    private String ID_Cliente; //se declara en privado la variable ID_Cliente de tipo String 
    private String Product_Categoria; //se declara en privado la variable Product_Categoria de tipo String
    private int Cantidad_de_productos; //se declara en privado la variable Cantidad_de_productos de tipo entero
    private int precio; //se declara en privado la variable Precio de tipo entero
    
    public final int Cantidad_Max =5 ; // se declara el la variable final entero Cantidad_Max en el cual esta variable durante su ejecucion o llamado
    // no podra ser cambiado por otra variable , ya que se queda fijo al declararlo final, va a ser su resultado final 

    public Cliente(String Nombre, String Apellido, int Cantidad_de_productos) { // se crea el constructor de la clase (se identifica facilmente ya que tiene el mismo nombre de la clase) 
        //  en el cual va a tener como parametros el nombre, el apellido y la cantidad de productos en el cual se van a usar al crear la instancia
        super(Nombre, Apellido); // se utiliza supper para definir las los parametros que tiene el constructor pero como las variable noombre y apellido son heredadas de la clase abstracta entonces se
        // utiliza super para declararlas  
        this.Cantidad_de_productos=Cantidad_de_productos; // por esta parte se declara la variable conthis ya que pertenece a la misma clase en el cual se esta creando
        
    }
    
    public double Hacercompra(){ // se crea un metodo de tipoo double en el cual se utilizara para realizar la compra que haya seleccionado 
    return 20*precio; // va a retornar la cantidad de productos que eligio (precio ) y los multiplicara * 20 ya que ese es el precio de cada pelicula al rentarla
    }
    
    public double Elegir_cantidad(){ // se crera un metodo de tipo double en el cual se utilizara para elegir la cantidad que desee llevar 
        if(Cantidad_de_productos==1){ // si el constructor elige que la cantidad de productoss sea igual a 1 enbtonces mandara el valor a precio
         precio= Cantidad_de_productos; // se manda el valor elegido a la variable precio
        }
        else{ // sino 
         if(Cantidad_de_productos==2){ // si eligio la cantidad de 2 entonces se mandara el valor a la variable precio
        precio=Cantidad_de_productos; // el valor que tiene cantidad_de_productos se manda a precio
        }
        else{ //sino 
        if(Cantidad_de_productos==3){ // si eligio 3 entoncee
        precio=Cantidad_de_productos; // se mandara la cantidad a la variable precio
        }
        else{ // sino 
        if(Cantidad_de_productos==4){ // si eligio 4 entonces
        precio=Cantidad_de_productos; // la cantiodad de producto se mandara a a variable precio
        }
        }
        }
        }
        return this.precio; // aqui retornara el precio de la variable precio utilizando this ya que pertenece a la misma clase
                
    }
    public double quitar_productos(){ // se crea un metodo del tipo double en el cual quitara los productos seleccionados
    return Cantidad_de_productos=0; // retornara la variable a 0 para que oueda quitar el propducto
    }
    
    
    @Override // es la sobreestcritura
    public String getNombre() { // se sobreescribe el metodo getnombre ya que cada cliente tiene diferentes nombres 
        return Nombre; // va a devolver la variable nombre con el valor que le dimos en el constructor
    }
    @Override // es la sobreesctura 
    public String getApellido() { // se sobreescribe el metodo getapellido de la clase abstracta persona ya que puede ser que cada cliente tiene diferente ap
        return Apellido; // va a retornar la variable apellido en el cual le dimos en el constructor
    }
    
}

