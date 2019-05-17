package proyectofinal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pelicula extends Entretenimiento implements manejarRegistros{
    //Declaracion de la clase Pelicula que hereda metodos y atributos de la clase Entretenimiento, también implementa los metodos de la interfaz manejarRegistros

    
    /*Atributos de la clase Pelicula*/
    
    //Los atributos son declarados como privados para 
    //que nada fuera de la clase los pueda modificar
    
    private int duracion;  //Declaracion de la variable duracion que es de tipo entero.    
    private String estudioCine; //Declaracion de la variable estudioCine que es de tipo String.
    private int presupuesto; //Declaracion de la variable presupuesto que es de tipo entero.
    private int recaudacion; //Declaracion de la variable recaudacion que es de tipo entero.
    
    
    /*Composición*/
    private Actor actor; //Declaracion de la instanciacion de la clase actor.
    private Director director; //Declaracion de la instanciacion de la clase director.
    private Compositor compositor; //Declaracion de la instanciacion de la clase compositor.
    
    Scanner input = new Scanner(System.in);
    
    //Declaracion de un objeto de la clase Scanner que luego es instanciada y hace una llamada
    //a su constructor que pasa como argumento el flujo de entrada estandar (System.in).
    //Lo que hace el Scanner es que produce un valor escaneado desde el flujo de entrada estandar.

    /*Métodos de la clase Pelicula. Son declarados como publicos para que puedan ser accedidos por otras clases.*/
    Pelicula(){
        //Constructor de la clase Pelicula
        //Inicializa las variables de la clase como nulas o cero.
        this.estudioCine = null;
        this.presupuesto = 0;
        this.recaudacion = 0;
        this.director = null;
        this.actor = new Actor(); //LLamada al constructor del objeto actor que inicializará sus valores en nulo.
        this.director = new Director(); //LLamada al constructor del objeto director que inicializará sus valores en nulo.
        this.compositor = new Compositor(); //LLamada al constructor del objeto compositor que inicializará sus valores en nulo.
    }
    
    Pelicula(String estudioCine, int presupuesto, int recaudacion, String director, 
            String nombreActor, String apellidoActor, String nombreDirector, 
            String apellidoDirector, String nombreCompositor, String apellidoCompositor){
        
        //Sobrecarga del constructor. Toma como parametro 5 variables de tipo string y se asignarán a cada una de las variables de la clase.
        this.estudioCine = estudioCine;
        this.presupuesto = presupuesto;
        this.recaudacion = recaudacion;
        
        this.actor.setNombre(nombreActor); 
        this.actor.setApellido(apellidoActor);
        
        this.director.setNombre(nombreDirector);
        this.director.setApellido(apellidoActor);
        
        this.compositor.setNombre(nombreCompositor);
        this.compositor.setApellido(nombreCompositor);
        
    }
    
    //Metodo de la clase que regresa el valor de la variable duracion.
    public int getDuracion() {
        return duracion;
    }
    
    //Metodo de la clase que toma como parametro un variable tipo entero y se la asigna a la variable duracion.
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    //Metodo de la clase que regresa el valor de la variable estudioCine.
    public String getEstudioCine() {
        return estudioCine;
    }

    //Metodo de la clase que toma como parametro un variable tipo String y se la asigna a la variable estudioCine.
    public void setEstudioCine(String estudioCine) {
        this.estudioCine = estudioCine;
    }

    //Metodo de la clase que regresa el valor de la variable presupuesto.
    public int getPresupuesto() {
        return presupuesto;
    }

    //Metodo de la clase que toma como parametro un variable tipo entero y se la asigna a la variable presupuesto.
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    //Metodo de la clase que regresa el valor de la variable recaudacion.
    public int getRecaudacion() {
        return recaudacion;
    }

    //Metodo de la clase que toma como parametro un variable tipo entero y se la asigna a la variable recaudacion.
    public void setRecaudacion(int recaudacion) {
        this.recaudacion = recaudacion;
    }
    
    //Metodo de la clase que regresa el valor de la variable director.
    public String getNombreDirector() {
        return this.director.getNombre();
    }
    
    //Metodo de la clase que toma como parametro un variable tipo String y se la asigna a la variable director.
    public void setNombreDirector(String director) {
        this.director.setNombre(director);
    }
    
    public String getApellidoDirector(){
        return this.director.getApellido();
    }
    
    public void setApellidoDirector(String apellidoDirector){
        this.director.setApellido(apellidoDirector);
    }
    
    public String getNombreCompositor(){
        return this.compositor.getNombre();
    }
    
    public void setNombreCompositor(String nombreCompositor){
         this.compositor.setNombre(nombreCompositor);
    }
    
    public String getApellidoCompositor(){
        return this.compositor.getApellido();
    }
    
    public void setApellidoCompositor(String apellidCompositor){
        this.compositor.setApellido(apellidCompositor);
    }
    
    
    //Metodo de la clase que regresa el valor del objeto actor.
    public String getNombreActor(){
        return this.actor.getNombre();
    }
    
    //Metodo de la clase que toma como parametro un variable tipo String y se la asigna al objeto actor.
   public void setNombreActor(String nombreActor){
       this.actor.setNombre(nombreActor);
   }
   
   public String getApellidoActor(){
       return this.actor.getApellido();
   }
    
   
   public void setApellidoActor(String apellidoActor){
       this.actor.setApellido(apellidoActor);
   }
    /*Metodos de la interfaz*/
    
    //Sobrescritura de metodo en interfaz.
    @Override
    public void mostrarDatos(){
        System.out.println("No. " + getNumRegistro()); //Imprime el numero de registro concatenando el valor devuelto por el metodo heredada de la clase Entretenimiento.
        System.out.println("Nombre:" + getNombre());    //Imprime el nombre concatenando el valor devuelto por el metodo heredada de la clase Entretenimiento.
        System.out.println("Año de Lanzamiento: " + getAnioLanzamiento()); //Imprime el año de lanzamiento concatenando el valor devuelto por el metodo heredada de la clase Entretenimiento.
        System.out.println("Clasificacion: " + getClasificacion()); //Imprime la clasificacion concatenando el valor devuelto por el metodo heredada de la clase Entretenimiento.
        System.out.println("Genero: " + getGenero()); //Imprime el genero concatenando el valor devuelto por el metodo heredada de la clase Entretenimiento.
        System.out.println("Reseña: " + getResena()); //Imprime la reseña concatenando el valor devuelto por el metodo heredada de la clase Entretenimiento.
        System.out.println("Calificacion: " + getCalificacion()); //Imprime la calificacion concatenando el valor devuelto por el metodo heredada de la clase Entretenimiento.
        System.out.println("Actor: " + getNombreActor() + " " + getApellidoActor());

        System.out.println("Estudio Cine: " + getEstudioCine()); //Imprime el estudio de cine de la pelicula concatenando el valor devuelto por el metodo de la misma clase Pelicula.
        System.out.println("Presupuesto: " + getPresupuesto()); //Imprime el presupuesto de la pelicula concatenando el valor devuelto por el metodo de la misma clase Pelicula.
        System.out.println("Recaudacion: " + getRecaudacion()); //Imprime la recaudacion de la pelicula concatenando el valor devuelto por el metodo de la misma clase Pelicula.
       
        System.out.println("Actor principal: " + getNombreActor() + " " + getApellidoActor() );
        System.out.println("Director: " + getNombreDirector() + " " + getApellidoDirector());
        System.out.println("Compositor: " + getNombreCompositor() + " " + getApellidoCompositor());
        
        //System.out.println("Actor Principal: " + );
        
        
    }
    
    //Sobrescritura de metodo en interfaz.
    @Override
    public void crearRegistro(){
         System.out.print("Ingrese el nombre de la pelicula: ");//Imprime un mensaje solicitando al usuario que ingrese el nombre.
        String nombre = input.nextLine();                   //Asigna a la variable nombre lo que el usuario teclee.
        setNombre(nombre);                                 //Usando el método heredado de la clase Entretenimiento se le establece un nombre al objeto.
        
        System.out.print("Ingrese el año de lanzamiento: ");//Imprime un mensaje solicitando al usuario que ingrese el año de lanzamiento.
        int ano = input.nextInt();                          //Asigna a la variable año lo que el usuario teclee.
        input.nextLine();                                   //El escaner avanza o salta una linea.
        setAnioLanzamiento(ano);                            //Usando el método heredado de la clase Entretenimiento se le establece una año de lanzamiento al objeto.
        
        System.out.print("Ingrese la clasificacion de la pelicula: "); //Imprime un mensaje solicitando al usuario que ingrese la clasificacion.
        String clasificacion = input.nextLine();                       //Asigna a la variable clasificacion lo que el usuario teclee.
        setClasificacion(clasificacion);                               //Usando el método heredado de la clase Entretenimiento se le establece una clasificacion al objeto.
        
        System.out.print("Ingrese el genero de la pelicula: ");//Imprime un mensaje solicitando al usuario que ingrese el genero.
        String genero = input.nextLine();//Asigna a la variable genero lo que el usuario teclee.
        setGenero(genero);//Usando el método heredado de la clase Entretenimiento se le establece un genero al objeto.
        
        System.out.print("Ingrese una resena de la pelicula: "); //Imprime un mensaje solicitando al usuario que ingrese una reseña.
        String resena = input.nextLine(); //Asigna a la variable resena lo que el usuario teclee.
        setResena(resena); //Usando el método heredado de la clase Entretenimiento se le establece una reseña de lanzamiento al objeto.
        
        System.out.print("Ingrese la calificacion de la pelicula: "); //Imprime un mensaje solicitando al usuario que ingrese la calificacion.
        float calificacion = input.nextFloat(); //Asigna a la variable calificacion lo que el usuario teclee.
        input.nextLine(); //El escaner avanza o salta una linea.
        setCalificacion(calificacion); //Usando el método heredado de la clase Entretenimiento se le establece una calificacio al objeto.
        
        System.out.println("Ingrese el estudio de cine de la pelicula: ");//Imprime un mensaje solicitando al usuario que ingrese el estudio de Cine.
        String estudioCine = input.nextLine(); //Asigna a la variable estudioCine lo que el usuario teclee.
        setEstudioCine(estudioCine); //Usando el método propio de la clase se establece un estudio de cine al objeto.
        
        System.out.println("Ingrese el presupuesto de la pelicula: "); //Imprime un mensaje solicitando al usuario que ingrese el presupuesto de la pelicula.
        int presupuesto = input.nextInt();//Asigna a la variable presupuesto lo que el usuario teclee.
        input.nextLine();
        setPresupuesto(presupuesto); //Usando el método propio de la clase se establece el presupuesto del objeto.
        
        System.out.println("Ingrese la recaudacion de la pelicula: "); //Imprime un mensaje solicitando al usuario que ingrese la recaudacion de la pelicula.
        int recaudacion = input.nextInt();//Asigna a la variable recaudacion lo que el usuario teclee.
        input.nextLine();
        setRecaudacion(recaudacion); //Usando el método propio de la clase se establece la recaudacion del objeto.
 
        System.out.println("Ingrese el nombre del actor principal: ");
        String nombreActor = input.nextLine();
        setNombreActor(nombreActor);
        
        System.out.println("Ingrese el apellido del actor principal: ");
        String apellidoActor = input.nextLine();
        setApellidoActor(apellidoActor);
        
        System.out.println("Ingrese el nombre del Director: ");
        String nombreDirector = input.nextLine();
        setNombreDirector(nombreDirector);
        
        System.out.println("Ingrese el apellido del Director: ");
        String apellidoDirector = input.nextLine();
        setApellidoDirector(apellidoDirector);
        
        System.out.println("Ingrese el nombre del Compositor: ");
        String nombreCompositor = input.nextLine();
        setNombreCompositor(nombreCompositor);
        
        System.out.println("Ingrese el apellido del Compositor: ");
        String apellidoCompositor = input.nextLine();
        setApellidoCompositor(apellidoCompositor);
        
    }
    
    //Sobrescritura de metodo en interfaz.
    @Override
    public void actualizarRegistro(){
        System.out.println("1.Nombre                      6.Calificacon");
        System.out.println("2.Ano de Lanzamiento          7.Estudio de cine: ");
        System.out.println("3.Clasificacion               8.Presupuesto");
        System.out.println("4.Genero                      9.Recaudacion: ");
        System.out.println("5.Resena                         ");
        //Imprime las opciones de las categorias que se pueden actualizar.
        
        boolean esNumero = false;   //Declaracion de la variable esNumero como tipo boolean. Es inicializado con un valor de false.
        while(!esNumero)    //Ciclo while que correrá mientras la variable esNumero sea false.
            try{ //Se intentará correr el siguiente bloque de código, de no poder correrse se correrá lo que esté en el bloque de catch.
                
                System.out.println("Ingrese la opcion a actualizar: "); //Impime mensaje solicitando al usuario que ingrese una opcion de las anteriores.
                int opcion = input.nextInt();//Declaracion de la variable opcion y se inicializa con el valor del escaneo del proximo simbolo.
                input.nextLine(); //El escaner avanza o salta una linea.
                esNumero = true;  //Cambia el valor de la variable esNumero a true.
                
                switch(opcion){
                    case 1: 
                        System.out.print("Ingrese el nombre del videojuego: ");//Imprime un mensaje solicitando al usuario que ingrese el nombre.
                        String nombre = input.nextLine();                   //Asigna a la variable nombre lo que el usuario teclee.
                        setNombre(nombre);                                 //Usando el método heredado de la clase Entretenimiento se le establece un nombre al objeto.
                        break;
                        
                    case 2:
                        System.out.print("Ingrese el año de lanzamiento: ");//Imprime un mensaje solicitando al usuario que ingrese el año de lanzamiento.
                        int ano = input.nextInt();                          //Asigna a la variable ano lo que el usuario teclee.
                        input.nextLine();                                   //El escaner avanza o salta una linea.
                        setAnioLanzamiento(ano);                            //Usando el método heredado de la clase Entretenimiento se le establece una año de lanzamiento al objeto.
                        break;
                    
                    case 3:
                        System.out.print("Ingrese la clasificacion del videojuego: "); //Imprime un mensaje solicitando al usuario que ingrese la clasificacion.
                        String clasificacion = input.nextLine();                       //Asigna a la variable clasificacion lo que el usuario teclee.
                        setClasificacion(clasificacion);                               //Usando el método heredado de la clase Entretenimiento se le establece una clasificacion al objeto.
                        break;
                        
                    case 4:
                        System.out.print("Ingrese el genero del videojuego: ");//Imprime un mensaje solicitando al usuario que ingrese el genero.
                        String genero = input.nextLine();//Asigna a la variable genero lo que el usuario teclee.
                        setGenero(genero);//Usando el método heredado de la clase Entretenimiento se le establece un genero al objeto.
                        break;
                        
                    case 5:
                        System.out.print("Ingrese una resena del videojuego: "); //Imprime un mensaje solicitando al usuario que ingrese una reseña.
                        String resena = input.nextLine(); //Asigna a la variable resena lo que el usuario teclee.
                        setResena(resena); //Usando el método heredado de la clase Entretenimiento se le establece una reseña de lanzamiento al objeto.
                        break;
                        
                    case 6:
                        System.out.print("Ingrese la calificacion del videojuego: "); //Imprime un mensaje solicitando al usuario que ingrese la calificacion.
                        float calificacion = input.nextFloat(); //Asigna a la variable calificacion lo que el usuario teclee.
                        input.nextLine(); //El escaner avanza o salta una linea.
                        setCalificacion(calificacion); //Usando el método heredado de la clase Entretenimiento se le establece una calificacio al objeto.
                        break;
                    case 7:
                        System.out.println("Ingrese el estudio de cine de la pelicula: ");//Imprime un mensaje solicitando al usuario que ingrese el estudio de Cine.
                        String estudioCine = input.nextLine(); //Asigna a la variable estudioCine lo que el usuario teclee.
                        setEstudioCine(estudioCine); //Usando el método propio de la clase se establece un estudio de cine al objeto.       
                        break;
        
                    case 8:
                        System.out.println("Ingrese el presupuesto de la pelicula: "); //Imprime un mensaje solicitando al usuario que ingrese el presupuesto de la pelicula.
                        int presupuesto = input.nextInt();//Asigna a la variable presupuesto lo que el usuario teclee.
                        setPresupuesto(presupuesto); //Usando el método propio de la clase se establece el presupuesto del objeto.
                        break;
                    
                    case 9:
                        System.out.println("Ingrese la recaudacion de la pelicula: "); //Imprime un mensaje solicitando al usuario que ingrese la recaudacion de la pelicula.
                        int recaudacion = input.nextInt();//Asigna a la variable recaudacion lo que el usuario teclee.
                        setRecaudacion(recaudacion); //Usando el método propio de la clase se establece la recaudacion del objeto.
                        break;
                    
                   
                }
            }catch(InputMismatchException e){ //Este bloque de codigo corre si es que un error se genera. 
                //El error que puede ser lanzado es el de InputMismatchException que se lanza cuando en un escaneo la entrada no coicide con el tipo de dato entero.
                System.out.println("Entrada invalida! Ingrese valores enteros."); //Imprime mensaje de error.
                input.nextLine(); // //El escaner avanza o salta una linea.
            }
        
    }
}
