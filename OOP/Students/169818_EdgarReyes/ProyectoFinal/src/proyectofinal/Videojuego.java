
package proyectofinal;  //Paquete del proyecto

import java.util.InputMismatchException;    //Clase que muestra un mensaje de error si el simbolo obtenido no coincide con el tipo de dato

import java.util.Scanner; //Clase usada para obtener la entrada de tipos primitivos de datos.

public class Videojuego extends Entretenimiento implements manejarRegistros{   
//Declaracion de la clase Videojuego que hereda metodos y atributos de la clase Entretenimiento, también implementa los metodos de la interfaz manejarRegistros
    
    /*Atributos de la clase. Son declarados como privados para que nada fuera de la clase los pueda modificar.*/
    
    private String desarrollador;   //Declaracion de la variable desarrollador que es de tipo String.
    
    private String plataforma;      //Declaracion de la variable plataforma que es de tipo String.
    
    Scanner input = new Scanner(System.in); 
    
    //Declaracion de un objeto de la clase Scanner que luego es instanciada y hace una llamada
    //a su constructor que pasa como argumento el flujo de entrada estandar (System.in).
    //Lo que hace el Scanner es que produce un valor escaneado desde el flujo de entrada estandar.

    Videojuego(){
    //Constructor de la clase Videojuego
    //Inicializa las variables de la clase como nulas.
        
        this.desarrollador = null;
        this.plataforma = null;
    }
    
    //Sobrecarga del constructor. Este toma como parametro dos variables de tipo String cuyo valor será asignado a los atributos de la clase.
    Videojuego(String desarrollador, String plataforma){
        this.desarrollador = desarrollador;
        this.plataforma = plataforma;
    }

    //Metodo de la clase que regresa el valor de la variable desarrollador.
    public String getDesarrollador() {
        return desarrollador;
    }

    //Metodo de la clase que toma como parametro un variable tipo String y se la asigna a la variable desarrollador.
    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }
    
    //Metodo de la clase que toma como parametro un variable tipo String y se la asigna a la variable plataforma.
    public void setPlataforma(String plataforma){
        this.plataforma = plataforma;
    }
    
    //Metodo de la clase que regresa el valor de la variable plataforma.
    public String getPlataforma(){
        return plataforma;
    }
    
    //Sobrescritura de métodos de la interfaz manejarRegistros
    @Override
    public void mostrarDatos(){
        System.out.println("No. " + getNumRegistro()); //Imprime el numero de registro concatenando el valor devuelto por el metodo heredada de la clase Persona.
        System.out.println("Nombre:" + getNombre());    //Imprime el nombre concatenando el valor devuelto por el metodo heredada de la clase Entretenimiento.
        System.out.println("Año de Lanzamiento: " + getAnioLanzamiento()); //Imprime el año de lanzamiento concatenando el valor devuelto por el metodo heredada de la clase Entretenimiento.
        System.out.println("Clasificacion: " + getClasificacion()); //Imprime la clasificacion concatenando el valor devuelto por el metodo heredada de la clase Entretenimiento.
        System.out.println("Genero: " + getGenero()); //Imprime el genero concatenando el valor devuelto por el metodo heredada de la clase Entretenimiento.
        System.out.println("Reseña: " + getResena()); //Imprime la reseña concatenando el valor devuelto por el metodo heredada de la clase Entretenimiento.
        System.out.println("Calificacion: " + getCalificacion()); //Imprime la calificacion concatenando el valor devuelto por el metodo heredada de la clase Entretenimiento.
        
        System.out.println("Desarrollador: " + getDesarrollador()); //Imprime el desarrollador concatenando el valor devuelto por el metodo de la misma clase Videojuego.
        System.out.println("Plataforma: " + getPlataforma()); //Imprime la plataforma concatenando el valor devuelto por el metodo de la misma clase Videojuego.
        
        
    }
    
    @Override
    //Se sobrescribe el metodo de la interfaz
    public void crearRegistro(){
       
        System.out.print("Ingrese el nombre del videojuego: ");//Imprime un mensaje solicitando al usuario que ingrese el nombre.
        String nombre = input.nextLine();                   //Asigna a la variable nombre lo que el usuario teclee.
        setNombre(nombre);                                 //Usando el método heredado de la clase Entretenimiento se le establece un nombre al objeto.
        
        System.out.print("Ingrese el año de lanzamiento: ");//Imprime un mensaje solicitando al usuario que ingrese el año de lanzamiento.
        int ano = input.nextInt();                          //Asigna a la variable ano lo que el usuario teclee.
        input.nextLine();                                   //El escaner avanza o salta una linea.
        setAnioLanzamiento(ano);                            //Usando el método heredado de la clase Entretenimiento se le establece una año de lanzamiento al objeto.
        
        System.out.print("Ingrese la clasificacion del videojuego: "); //Imprime un mensaje solicitando al usuario que ingrese la clasificacion.
        String clasificacion = input.nextLine();                       //Asigna a la variable clasificacion lo que el usuario teclee.
        setClasificacion(clasificacion);                               //Usando el método heredado de la clase Entretenimiento se le establece una clasificacion al objeto.
        
        System.out.print("Ingrese el genero del videojuego: ");//Imprime un mensaje solicitando al usuario que ingrese el genero.
        String genero = input.nextLine();//Asigna a la variable genero lo que el usuario teclee.r
        setGenero(genero);//Usando el método heredado de la clase Entretenimiento se le establece un genero al objeto.
        
        System.out.print("Ingrese una resena del videojuego: "); //Imprime un mensaje solicitando al usuario que ingrese una reseña.
        String resena = input.nextLine(); //Asigna a la variable resena lo que el usuario teclee.
        setResena(resena); //Usando el método heredado de la clase Entretenimiento se le establece una reseña de lanzamiento al objeto.
        
        System.out.print("Ingrese la calificacion del videojuego: "); //Imprime un mensaje solicitando al usuario que ingrese la calificacion.
        float calificacion = input.nextFloat(); //Asigna a la variable calificacion lo que el usuario teclee.
        input.nextLine(); //El escaner avanza o salta una linea.
        setCalificacion(calificacion); //Usando el método heredado de la clase Entretenimiento se le establece una calificacio al objeto.
        
        System.out.print("Ingrese el desarrollador del videojuego: "); //Imprime un mensaje solicitando al usuario que ingrese el desarrollador.
        String desarrollador = input.nextLine(); //Asigna a la variable desarrollador lo que el usuario teclee.
        setDesarrollador(desarrollador); //Usando el método propio de la clase se establece un desarrollador al objeto.
        
       System.out.println("Ingrese una plataforma del videojuego: "); //Imprime un mensaje solicitando al usuario que ingrese la plataforma.
       String plataforma = input.nextLine(); //Asigna a la variable plataforma lo que el usuario teclee.
       setPlataforma(plataforma); //Usando el método propio de la clase se establece una plataforma al objeto.
       
    }
    
    
    @Override
    //Se sobrescribe el metodo de la interfaz
    public void actualizarRegistro(){
        System.out.println("1.Nombre                      5.Resena");
        System.out.println("2.Ano de Lanzamiento          6.Calificacion");
        System.out.println("3.Clasificacion               7.Desarrollador");
        System.out.println("4.Genero                      8.Plataformas");
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
                        System.out.print("Ingrese el desarrollador del videojuego: "); //Imprime un mensaje solicitando al usuario que ingrese el desarrollador.
                        String desarrollador = input.nextLine(); //Asigna a la variable desarrollador lo que el usuario teclee.
                        setDesarrollador(desarrollador); //Usando el método propio de la clase se establece un desarrollador al objeto.
                        break;
                    case 8:
                        System.out.println("Ingrese una plataforma del videojuego: "); //Imprime un mensaje solicitando al usuario que ingrese la plataforma.
                        String plataforma = input.nextLine(); //Asigna a la variable plataforma lo que el usuario teclee.
                        setPlataforma(plataforma); //Usando el método propio de la clase se establece una plataforma al objeto.
                        break;
                     
                }
            }catch(InputMismatchException e){ //Este bloque de codigo corre si es que un error se genera. 
                //El error que puede ser lanzado es el de InputMismatchException que se lanza cuando en un escaneo la entrada no coicide con el tipo de dato entero.
                System.out.println("Entrada invalida! Ingrese valores enteros."); //Imprime mensaje de error.
                input.nextLine(); // //El escaner avanza o salta una linea.
            }
        
    }
}
