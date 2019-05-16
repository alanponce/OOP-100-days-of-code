//Paquete en el que se encontraran las calses usadas ene ste proyecto 
package inventario;
//Importamos la libreria java.util para usar la clase Scanner para poder leer valores de entrada
import java.util.Scanner;

//Clase Almacen que implenta la interfaz Menu
public class Almacen implements Menu{
    //Declaramos un objeto llamado sc para poder ingresar datos desde el teclado 
    Scanner sc = new Scanner(System.in); 
    
    //Metod actualizar implementado de la interfaz Menu para actualizar el inventario, metodo de tipo void
    @Override
        public void Actualizar(){
            //Se muestra en pantalla el mensaje para ingresar un ID
            System.out.print("\n Ingrese el ID del producto: ");
            //Guarda el valor ingresado desde el teclado en la variable ID de tipo int
            int ID = sc.nextInt();
            //Se muestra en pantall el mensaje para ingresar la cantidad a ingresar a almacen
            System.out.print("\n Ingrese la cantidad que se ingresara al almacen: ");
            //Guarda el valor ingresado desde el teclado en la variable Cant de tipo int
            int Cant = sc.nextInt();
               //se crea el objeto p de la calse Productos que recibe los parametros ID y cant de tipo int
            Productos p = new Productos(ID,Cant); 
                    //Si el ID tiene un valor mayor a 16 se muestra el mensaje de que el id es invalido
                    if(ID>22){
                        System.out.print("ID invalido");
                    }    
                }  
        
         
        }
    
   


