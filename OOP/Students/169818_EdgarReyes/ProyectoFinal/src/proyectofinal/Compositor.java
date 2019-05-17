package proyectofinal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Compositor extends Persona implements manejarRegistros {
    //Declaracion de la clase Compositor que hereda metodos y atributos de la clase Persona, también implementa los metodos de la interfaz manejarRegistros

    /*Atributos de la clase. Son declarados como privados para que nada fuera de la clase los pueda modificar.*/
    private String soundtrackPelicula; //Declaracion de la variable soundtrackPelicula de tipo String.

    Scanner input = new Scanner(System.in); 
    
    //Declaracion de un objeto de la clase Scanner que luego es instanciada y hace una llamada
    //a su constructor que pasa como argumento el flujo de entrada estandar (System.in).
    //Lo que hace el Scanner es que produce un valor escaneado desde el flujo de entrada estandar.
    
    /*Metodos de la clase*/
    Compositor(){
        //Constructor de la clase Compositor
        //Inicializa la variable de la clase como nula.
        this.soundtrackPelicula = null;
    }
    
    Compositor(String soundtrackPelicula){
        //Sobrecarga del constructor. Este toma como parametro una variable de tipo String cuyo valor será asignado al atributo de la clase.
        this.soundtrackPelicula = soundtrackPelicula;
    }
    
    
    //Metodo de la clase que regresa el valor de la variable soundtrackPelicula.
    public String getSoundtrackPelicula() {
        return soundtrackPelicula;
    }

    //Metodo de la clase que toma como parametro un variable tipo String y se la asigna a la variable soundtrackPelicula.
    public void setSoundtrackPelicula(String soundtrackPelicula) {
        this.soundtrackPelicula = soundtrackPelicula;
    }
    
    /*Metodos de la interfaz manejarRegistros*/
    
    @Override
    public void mostrarDatos(){
        /* private String nombre;
    private String apellido;
    private String genero;
    private String fechaNacimiento;
    private String lugarNacimiento;*/
        
        
        System.out.println("Nombre: " + getNombre()); //Imprime el nombre concatenando el valor devuelto por el metodo heredada de la clase Persona.
        System.out.println("Apellido: " + getApellido()); //Imprime el apellido concatenando el valor devuelto por el metodo heredada de la clase Persona.
        System.out.println("Genero: " + getGenero());//Imprime el genero concatenando el valor devuelto por el metodo heredada de la clase Persona.
        System.out.println("Fecha de nacimiento: " + getFechaNacimiento());//Imprime la fecha de nacimiento concatenando el valor devuelto por el metodo heredada de la clase Persona.
        System.out.println("Lugar de nacimiento: " + getLugarNacimiento());//Imprime el lugar de nacimiento concatenando el valor devuelto por el metodo heredada de la clase Persona.
        
        System.out.println("Peliculas dirigidas: " + getSoundtrackPelicula());    //Imprime las peliculas para las que compuso la musica concatenando el valor devuelto por el metodo de la misma clase Compositor.
    }
    
    @Override
    public void crearRegistro(){
        System.out.println("Ingrese el nombre del actor: "); //Imprime un mensaje solicitando al usuario que ingrese el nombre del actor.
        String nombre = input.nextLine();   //Asigna a la variable nombre lo que el usuario teclee.
        setNombre(nombre); //Usando el método heredado de la clase Persona se le establece un nombre al objeto.
        
        System.out.println("Ingrese el apellido del actor: " ); //Imprime un mensaje solicitando al usuario que ingrese el apellido del actor
        String apellido = input.nextLine(); //Asigna a la variable apellido lo que el usuario teclee.
        setApellido(apellido); //Usando el método heredado de la clase Persona se le establece un apellido al objeto.
        
        System.out.println("Ingrese el genero del actor: "); //Imprime un mensaje solicitando al usuario que ingrese el genero del actor.
        String genero = input.nextLine(); //Asigna a la variable genero lo que el usuario teclee.
        setGenero(genero); //Usando el método heredado de la clase Persona se le establece un genero al objeto.
        
        System.out.println("Ingrese la fecha de nacimiento del actor: "); //Imprime un mensaje solicitando al usuario que ingrese la fecha de nacimiento del actor.
        String fechaNacimiento = input.nextLine(); //Asigna a la variable fechaNacimiento lo que el usuario teclee.
        setFechaNacimiento(fechaNacimiento); //Usando el método heredado de la clase Persona se le establece una fecha de nacimiento al objeto.
        
        System.out.println("Ingrese el lugar de nacimiento del actor: "); //Imprime un mensaje solicitando al usuario que ingrese el lugar de nacimiento del actor.
        String lugarNacimiento = input.nextLine(); //Asigna a la variable lugarNacimiento lo que el usuario teclee.
        setLugarNacimiento(lugarNacimiento); //Usando el método heredado de la clase Persona se le establece un lugar de nacimiento al objeto.
        
        System.out.println("Ingrese una pelicula dirigida por el actor: "); //Imprime un mensaje solicitando al usuario que ingrese una pelicula que haya dirigido el actor.
        String soundtrackPelicula = input.nextLine(); //Asigna a la variable peliculaDirigda lo que el usuario teclee.
        setSoundtrackPelicula(soundtrackPelicula); //Usando el método de la misma clase compositor se le establece las peliculase para las que compuso la musica al objeto.
    }

    @Override
    public void actualizarRegistro(){
        
        System.out.println("1.Nombre                      4.Fecha de Nacimiento");
        System.out.println("2.Apellido                    5.Lugar de Nacimiento");
        System.out.println("3.Genero                      6.Pelicula actuada");
        
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
                        System.out.println("Ingrese el nombre del actor: "); //Imprime un mensaje solicitando al usuario que ingrese el nombre del actor.
                        String nombre = input.nextLine();   //Asigna a la variable nombre lo que el usuario teclee.
                        setNombre(nombre); //Usando el método heredado de la clase Persona se le establece un nombre al objeto.
                        break;
                        
                    case 2:
                        System.out.println("Ingrese el apellido del actor: " ); //Imprime un mensaje solicitando al usuario que ingrese el apellido del actor
                        String apellido = input.nextLine(); //Asigna a la variable apellido lo que el usuario teclee.
                        setApellido(apellido); //Usando el método heredado de la clase Persona se le establece un apellido al objeto.    
                        break;
                    
                    case 3:
                        System.out.println("Ingrese el genero del actor: "); //Imprime un mensaje solicitando al usuario que ingrese el genero del actor.
                        String genero = input.nextLine(); //Asigna a la variable genero lo que el usuario teclee.
                        setGenero(genero); //Usando el método heredado de la clase Persona se le establece un genero al objeto.
                        break;
                        
                    case 4:
                        System.out.println("Ingrese la fecha de nacimiento del actor: "); //Imprime un mensaje solicitando al usuario que ingrese la fecha de nacimiento del actor.
                        String fechaNacimiento = input.nextLine(); //Asigna a la variable fechaNacimiento lo que el usuario teclee.
                        setFechaNacimiento(fechaNacimiento); //Usando el método heredado de la clase Persona se le establece una fecha de nacimiento al objeto.
                        break;
                        
                    case 5:
                        System.out.println("Ingrese el lugar de nacimiento del actor: "); //Imprime un mensaje solicitando al usuario que ingrese el lugar de nacimiento del actor.
                        String lugarNacimiento = input.nextLine(); //Asigna a la variable lugarNacimiento lo que el usuario teclee.
                        setLugarNacimiento(lugarNacimiento); //Usando el método heredado de la clase Persona se le establece un lugar de nacimiento al objeto.
                        break;
                        
                    case 6:
                        System.out.println("Ingrese una pelicula dirigida por el actor: "); //Imprime un mensaje solicitando al usuario que ingrese una pelicula que haya dirigido el actor.
                        String soundtrackPelicula = input.nextLine(); //Asigna a la variable peliculaDirigda lo que el usuario teclee.
                        setSoundtrackPelicula(soundtrackPelicula); //Usando el método de la misma clase compositor se le establece las peliculase para las que compuso la musica al objeto.
                        break;   
                }
            }catch(InputMismatchException e){ //Este bloque de codigo corre si es que un error se genera. 
                //El error que puede ser lanzado es el de InputMismatchException que se lanza cuando en un escaneo la entrada no coicide con el tipo de dato entero.
                System.out.println("Entrada invalida! Ingrese valores enteros."); //Imprime mensaje de error.
                input.nextLine(); // //El escaner avanza o salta una linea.
            }
    }
    
}
