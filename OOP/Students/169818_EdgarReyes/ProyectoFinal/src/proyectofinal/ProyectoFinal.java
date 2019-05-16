package proyectofinal;

import java.io.File;    //Libreria que contiene la clase  que opera con archivos, directorio y otros tipos de archivo.
import java.io.FileNotFoundException;
import java.io.IOException; //Libreria que incluye la clase para las excepciones producidas por operadciones de I/O fallidas o interrumpidas.
import java.io.PrintWriter;  //Libreria que incluye la clase para imprimir representaciones de objetos en un flujo de salida de texto.
import java.util.Scanner;

public class ProyectoFinal {
    public static void main(String[] args) {
        /*File archivo = new File("registros.txt");
        try{
            PrintWriter salida = new PrintWriter(archivo);
            salida.println("Edgar");
            salida.println(20);
            salida.close();
        }catch(IOException ex){
            System.out.printf("ERROR: %s\n", ex);
        }
        
        
        try{
            Scanner entrada = new Scanner(archivo);
            String nombre = entrada.nextLine();
            int edad = entrada.nextInt();
            
            System.out.println("Nombre: " + nombre + " Edad: " + edad);
        }catch(FileNotFoundException ex){
            System.out.printf("ERROR: %s\n", ex);
        }*/
        
        Videojuego v1 = new Videojuego();
        v1.crearRegistro();
        v1.mostrarDatos();
        
        v1.actualizarRegistro();
        v1.mostrarDatos();
    }
    
}
