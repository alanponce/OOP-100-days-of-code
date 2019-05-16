
package proyectofinal;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Videojuego extends Entretenimiento implements manejarRegistros{
   
    private String desarrollador;
    private String plataforma;
    Scanner input = new Scanner(System.in);

    //Constructor de la clase Videojuego
    Videojuego(){
        
        desarrollador = null;
        plataforma = null;
    }
    


    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public void setPlataforma(String plataforma){
        this.plataforma = plataforma;
    }
    
    public String getPlataforma(){
        return plataforma;
    }
    
    //Sobrescritura de métodos de la interfaz manejarRegistros
    @Override
    public void mostrarDatos(){
        System.out.println("Nombre:" + getNombre());    //Imprime el nombre concatenando el valor devuelto por la funcion heredada de la clase Entretenimiento.
        System.out.println("Año de Lanzamiento: " + getAnioLanzamiento()); //Imprime el año de lanzamiento concatenando el valor devuelto por la funcion heredada de la clase Entretenimiento.
        System.out.println("Clasificacion: " + getClasificacion()); //Imprime la clasificacion concatenando el valor devuelto por la funcion heredada de la clase Entretenimiento.
        System.out.println("Genero: " + getGenero()); //Imprime el genero concatenando el valor devuelto por la funcion heredada de la clase Entretenimiento.
        System.out.println("Reseña: " + getResena()); //Imprime la reseña concatenando el valor devuelto por la funcion heredada de la clase Entretenimiento.
        System.out.println("Calificacion: " + getCalificacion());
        System.out.println("Desarrollador: " + getDesarrollador());
        System.out.println("Plataforma: " + plataforma); 
        
        
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
        String genero = input.nextLine();//Asigna a la variable genero lo que el usuario teclee.
        setGenero(genero);//Usando el método heredado de la clase Entretenimiento se le establece un genero al objeto.
        
        System.out.print("Ingrese una resena del videojuego: "); //Imprime un mensaje solicitando al usuario que ingrese una reseña.
        String resena = input.nextLine(); //Asigna a la variable resena lo que el usuario teclee.
        setResena(resena); //Usando el método heredado de la clase Entretenimiento se le establece una reseña de lanzamiento al objeto.
        
        System.out.print("Ingrese la calificacion del videojuego: "); //Imprime un mensaje solicitando al usuario que ingrese la calificacion.
        int calificacion = input.nextInt(); //Asigna a la variable calificacion lo que el usuario teclee.
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
    public void eliminarRegistro(){
       
    }
    
    @Override
    //Se sobrescribe el metodo de la interfaz
    public void actualizarRegistro(){
        
        
         System.out.println("Nombre:" + getNombre());
        System.out.println("Año de Lanzamiento: " + getAnioLanzamiento());
        System.out.println("Clasificacion: " + getClasificacion());
        System.out.println("Genero: " + getGenero());
        System.out.println("Reseña: " + getResena());
        System.out.println("Calificacion: " + getCalificacion());
        System.out.println("Desarrollador: " + getDesarrollador());
        System.out.println("Plataformas: " + getPlataforma());
        
        
        System.out.println("1.Nombre                      5.Resena");
        System.out.println("2.Ano de Lanzamiento          6.Calificacion");
        System.out.println("3.Clasificacion               7.Desarrollador");
        System.out.println("4.Genero                      8.Plataformas");
        
        boolean esNumero = false;
        while(!esNumero)
            try{
                System.out.println("Ingrese la opcion a actualizar: ");
                int opcion = input.nextInt();
                input.nextLine();
                esNumero = true;
                
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
                        int calificacion = input.nextInt(); //Asigna a la variable calificacion lo que el usuario teclee.
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
            }catch(InputMismatchException e){
                System.out.println("Entrada invalida! Ingrese valores enteros.");
                input.nextLine();
            }
        
    }
}
