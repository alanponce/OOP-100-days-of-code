package proyectofinal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Serie extends Entretenimiento implements manejarRegistros{ //Declaracion de clase serie que hereda de la clase Entretenimiento
    /*Atributos de la clase Serie*/
    //Los atributos son declarados como privados para 
    //que nada fuera de la clase los pueda modificar
    
    private String cadenaTelevision;   //Declaracion de la variable cadenaTelevision que es de tipo String.
    private String companiaTelevision;  //Declaracion de la variable companiaTelevision que es de tipo String.
    private String creador; //Declaracion de la variable creador que es de tipo String.
    
    /*Composicion*/
    private Actor actor;
    
    Scanner input = new Scanner(System.in);
    
    //Declaracion de un objeto de la clase Scanner que luego es instanciada y hace una llamada
    //a su constructor que pasa como argumento el flujo de entrada estandar (System.in).
    //Lo que hace el Scanner es que produce un valor escaneado desde el flujo de entrada estandar.
    
    /*Métodos de la clase Serie. Son declarados como publicos para que puedan ser accedidos por otras clases.*/
    Serie(){
        //Constructor de la clase Serie
        //Inicializa las variables de la clase como nulas.
        this.cadenaTelevision = null;
        this.companiaTelevision = null;
        this.creador = null;
        this.actor = null;
        this.actor = new Actor();
    }
    
    //Sobrecarga del constructor. Toma como parametro 4 variables de tipo string y se asignarán a cada una de las variables de la clase.
    Serie(String cadenaTelevision, String companiaTelevision, String creador, String nombreActor, String apellidoActor){
        this.cadenaTelevision = cadenaTelevision;
        this.companiaTelevision = companiaTelevision;
        this.creador = creador;
        this.actor.setNombre(nombreActor);
        this.actor.setApellido(apellidoActor);
        
    }
    
    //Metodo de la clase que regresa el valor de la variable cadenaTelevision.
    public String getCadenaTelevision() {
        return cadenaTelevision;
    }
    
    //Metodo de la clase que toma como parametro un variable tipo String y se la asigna a la variable cadenaTelevision.
    public void setCadenaTelevision(String cadenaTelevision) {
        this.cadenaTelevision = cadenaTelevision;
    }

    //Metodo de la clase que regresa el valor de la variable companiaTelevision.
    public String getCompaniaTelevision() {
        return companiaTelevision;
    }

    //Metodo de la clase que toma como parametro un variable tipo String y se la asigna a la variable companiaTelevision.
    public void setCompaniaTelevision(String companiaTelevision) {
        this.companiaTelevision = companiaTelevision;
    }

    //Metodo de la clase que regresa el valor de la variable creador.
    public String getCreador() {
        return creador;
    }
    
    //Metodo de la clase que toma como parametro un variable tipo String y se la asigna a la variable creador.
    public void setCreador(String creador) {
        this.creador = creador;
    }
    
    public String getNombreActor(){
        return this.actor.getNombre();
    }
    
    public void setNombreActor(String nombreActor){
        this.actor.setNombre(nombreActor);
    }
    
    public String getApellidoActor(){
        return this.actor.getApellido();
    }
    
    public void setApellidoActor(String apellidoActor){
        this.actor.setApellido(apellidoActor);
    }
    
   
    
    @Override
    //Sobrescritura de metodo en interfaz.
    public void mostrarDatos(){
        System.out.println("No. " + getNumRegistro()); //Imprime el numero de registro concatenando el valor devuelto por el metodo heredada de la clase Entretenimiento.
        System.out.println("Nombre:" + getNombre());    //Imprime el nombre concatenando el valor devuelto por el metodo heredada de la clase Entretenimiento.
        System.out.println("Año de Lanzamiento: " + getAnioLanzamiento()); //Imprime el año de lanzamiento concatenando el valor devuelto por el metodo heredada de la clase Entretenimiento.
        System.out.println("Clasificacion: " + getClasificacion()); //Imprime la clasificacion concatenando el valor devuelto por el metodo heredada de la clase Entretenimiento.
        System.out.println("Genero: " + getGenero()); //Imprime el genero concatenando el valor devuelto por el metodo heredada de la clase Entretenimiento.
        System.out.println("Reseña: " + getResena()); //Imprime la reseña concatenando el valor devuelto por el metodo heredada de la clase Entretenimiento.
        System.out.println("Calificacion: " + getCalificacion()); //Imprime la calificacion concatenando el valor devuelto por el metodo heredada de la clase Entretenimiento.
        
        System.out.println("Cadena de television: " + getCadenaTelevision()); //Imprime la cadena de television concatenando el valor devuelto por el metodo de la misma clase Serie.
        System.out.println("Compania de television: " + getCompaniaTelevision()); //Imprime la compania de television concatenando el valor devuelto por el metodo de la misma clase Serie.
        System.out.println("Creador de la serie: " + getCreador()); //Imprime el creador de la serie concatenando el valor devuelto por el metodo de la misma clase Serie.
        
        System.out.println("Actor Principal: " + getNombreActor() + " " + getApellidoActor());
        
    }
    
    //Sobrescritura de metodo en interfaz.
    public void crearRegistro(){
        System.out.print("Ingrese el nombre de la serie: ");//Imprime un mensaje solicitando al usuario que ingrese el nombre.
        String nombre = input.nextLine();                   //Asigna a la variable nombre lo que el usuario teclee.
        setNombre(nombre);                                 //Usando el método heredado de la clase Entretenimiento se le establece un nombre al objeto.
        
        System.out.print("Ingrese el año de lanzamiento: ");//Imprime un mensaje solicitando al usuario que ingrese el año de lanzamiento.
        int ano = input.nextInt();                          //Asigna a la variable año lo que el usuario teclee.
        input.nextLine();                                   //El escaner avanza o salta una linea.
        setAnioLanzamiento(ano);                            //Usando el método heredado de la clase Entretenimiento se le establece una año de lanzamiento al objeto.
        
        System.out.print("Ingrese la clasificacion de la serie: "); //Imprime un mensaje solicitando al usuario que ingrese la clasificacion.
        String clasificacion = input.nextLine();                       //Asigna a la variable clasificacion lo que el usuario teclee.
        setClasificacion(clasificacion);                               //Usando el método heredado de la clase Entretenimiento se le establece una clasificacion al objeto.
        
        System.out.print("Ingrese el genero de la serie: ");//Imprime un mensaje solicitando al usuario que ingrese el genero.
        String genero = input.nextLine();//Asigna a la variable genero lo que el usuario teclee.
        setGenero(genero);//Usando el método heredado de la clase Entretenimiento se le establece un genero al objeto.
        
        System.out.print("Ingrese una resena de la serie: "); //Imprime un mensaje solicitando al usuario que ingrese una reseña.
        String resena = input.nextLine(); //Asigna a la variable resena lo que el usuario teclee.
        setResena(resena); //Usando el método heredado de la clase Entretenimiento se le establece una reseña de lanzamiento al objeto.
        
        System.out.print("Ingrese la calificacion de la serie: "); //Imprime un mensaje solicitando al usuario que ingrese la calificacion.
        float calificacion = input.nextFloat(); //Asigna a la variable calificacion lo que el usuario teclee.
        input.nextLine(); //El escaner avanza o salta una linea.
        setCalificacion(calificacion); //Usando el método heredado de la clase Entretenimiento se le establece una calificacio al objeto.
        
        
        System.out.println("Ingrese la cadena de television de la serie: " );//Imprime un mensaje solicitando al usuario que ingrese la cadena de television.
        String cadenaTelevision = input.nextLine();//Asigna a la variable calificacion lo que el usuario teclee.
        setCadenaTelevision(cadenaTelevision); //Usando el método propio de la clase se establece una cadena de television al objeto.
        
        System.out.println("Ingrese la compania de television de la serie: "); //Imprime un mensaje solicitando al usuario que ingrese la compania de television.
        String companiaTelevision = input.nextLine(); //Asigna a la variable calificacion lo que el usuario teclee.
        setCompaniaTelevision(companiaTelevision); //Usando el método propio de la clase se establece una compania de television al objeto.
        
        System.out.println("Ingrese el creador de la serie: "); //Imprime un mensaje solicitando al usuario que ingrese al creador de la serie.
        String creador = input.nextLine(); //Asigna a la variable creador lo que el usuario teclee.
        setCreador(creador); //Usando el método propio de la clase se establece un creador al objeto.
        
        System.out.println("Ingresa el nombre del actor principal: ");
        String nombreActor = input.nextLine();
        setNombreActor(nombreActor);
        
        System.out.println("Ingresa el apellido del actor principal: ");
        String apellidoActor = input.nextLine();
        setApellidoActor(apellidoActor);
        
    }
    
    
    //Sobrescritura de metodo en interfaz.
    public void actualizarRegistro(){
        System.out.println("1.Nombre                      6.Calificacon");
        System.out.println("2.Ano de Lanzamiento          7.Cadena television: ");
        System.out.println("3.Clasificacion               8.Compania television");
        System.out.println("4.Genero                      9.Creador: ");
        System.out.println("5.Resena                                 ");
        //Imprime las opciones de las categorias que se pueden actualizar.
        
        boolean esNumero = false;   //Declaraciond de la variable esNumero como tipo boolean. Es inicializado con un valor de false.
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
                        System.out.println("Ingrese la cadena de television de la serie: " );//Imprime un mensaje solicitando al usuario que ingrese la cadena de television.
                        String cadenaTelevision = input.nextLine();//Asigna a la variable calificacion lo que el usuario teclee.
                        setCadenaTelevision(cadenaTelevision);//Usando el método heredado de la clase Entretenimiento se le establece una cadena de television al objeto.
                        break;
        
                    case 8:
                        System.out.println("Ingrese la compania de television de la serie: "); //Imprime un mensaje solicitando al usuario que ingrese la compania de television.
                        String companiaTelevision = input.nextLine(); //Asigna a la variable calificacion lo que el usuario teclee.
                        setCompaniaTelevision(companiaTelevision); //Usando el método heredado de la clase Entretenimiento se le establece una compania de television al objeto.
                        break;
                    
                    case 9:
                        System.out.println("Ingrese el creador de la serie: "); //Imprime un mensaje solicitando al usuario que ingrese al creador de la serie.
                        String creador = input.nextLine(); //Asigna a la variable creador lo que el usuario teclee.
                        setCreador(creador); ////Usando el método heredado de la clase Entretenimiento se le establece un creador al objeto.
                        break;
                }
            }catch(InputMismatchException e){ //Este bloque de codigo corre si es que un error se genera. 
                //El error que puede ser lanzado es el de InputMismatchException que se lanza cuando en un escaneo la entrada no coicide con el tipo de dato entero.
                System.out.println("Entrada invalida! Ingrese valores enteros."); //Imprime mensaje de error.
                input.nextLine(); // //El escaner avanza o salta una linea.
            }
        
    }
    
    
}
