package proyectofinal;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ProyectoFinal {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("1.Alta Pelicula                     6.Modificar videojuego");
        System.out.println("2.Modificar Pelicula                7.Ver registro videojuego");
        System.out.println("3.Alta Serie                        8.Ver registro Pelicula");
        System.out.println("4.Modificar Serie                   9.Ver registro Serie");
        System.out.println("5.Alta Videojuego");

        
        boolean esNumero = false;   //Declaracion de la variable esNumero como tipo boolean. Es inicializado con un valor de false.
        boolean continuar = true;
        int opcion2 = 1;
        
        do
        while(!esNumero)    //Ciclo while que correrá mientras la variable esNumero sea false.
        try{
            System.out.println("Ingrese la opción deseada: ");
            int opcion = input.nextInt();//Declaracion de la variable opcion y se inicializa con el valor del escaneo del proximo simbolo.
            input.nextLine(); //El escaner avanza o salta una linea.
            esNumero = true;  //Cambia el valor de la variable esNumero a true.
            
            Pelicula pelicula = new Pelicula();
            Serie serie = new Serie();
            Videojuego videojuego = new Videojuego();
            
            switch(opcion){
                case 1:
                    pelicula.crearRegistro();
                    
                    System.out.println("Desea continuar con el programa? 1.Si 2.No");
                   
                    opcion2 = input.nextInt();
                    input.nextLine();
                        
                   if(opcion2 == 1)
                       esNumero = false;
                    else
                    esNumero = true;

                    break;
                    
                case 2:
                    pelicula.actualizarRegistro();
                    System.out.println("Desea continuar con el programa? 1.Si 2.No");
                   
                    opcion2 = input.nextInt();
                    input.nextLine();
                    
                    if(opcion2 == 1)
                       esNumero = false;
                    else
                    esNumero = true;
                    
                    break;
                    
                case 3:
                    serie.crearRegistro();
                    
                    if(opcion2 == 1)
                       esNumero = false;
                    else
                    esNumero = true;
                    
                    break;
                
                case 4:
                    serie.actualizarRegistro();
                    
                    if(opcion2 == 1)
                       esNumero = false;
                    else
                    esNumero = true;
                    
                    break;
                    
                case 5:
                    videojuego.crearRegistro();
                    
                    if(opcion2 == 1)
                       esNumero = false;
                    else
                    esNumero = true;
                    
                    break;
                 
                case 6:
                    videojuego.actualizarRegistro();
                    
                    if(opcion2 == 1)
                       esNumero = false;
                    else
                    esNumero = true;
                    
                    break;
                case 7:
                    videojuego.mostrarDatos();
                    
                    if(opcion2 == 1)
                       esNumero = false;
                    else
                    esNumero = true;
                    
                    break;
                case 8:
                    pelicula.mostrarDatos();
                    
                    if(opcion2 == 1)
                       esNumero = false;
                    else
                    esNumero = true;
                    
                    break;
                case 9:
                    serie.mostrarDatos();
                    
                    if(opcion2 == 1)
                       esNumero = false;
                    else
                    esNumero = true;
                    
                    break;
            }
        }catch(InputMismatchException e){
                //Este bloque de codigo corre si es que un error se genera. 
                //El error que puede ser lanzado es el de InputMismatchException que se lanza cuando en un escaneo la entrada no coicide con el tipo de dato entero.
                System.out.println("Entrada invalida! Ingrese valores enteros."); //Imprime mensaje de error.
                input.nextLine(); // //El escaner avanza o salta una linea.
        }
        while(!continuar);
    }
}
