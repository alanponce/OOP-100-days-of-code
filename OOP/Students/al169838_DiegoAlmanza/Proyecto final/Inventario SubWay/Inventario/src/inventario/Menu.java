
package inventario;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    
    public void menu(){
    System.out.print("\"Seleccione una opcion \\n 1. Meter a Almacen \\n 2. Sacar de Almacen \\n 3. Buscar \\n 4. Inventario actual \\n 5. Salir\"");
    int o = sc.nextInt();
        
        switch(o){
            case 1:
              System.out.print("Seleccione que tipo de producto desea ingresar al almacen: \n 1. Vegetales \n 2. Pan \n 3. Liquido  \n 4. Regresar");
              int ov = sc.nextInt();
              
              switch(ov){
                  case 1:
                      System.out.print("\n Ingrese el ID del vegetal: ");
                      int IDv = sc.nextInt();
                      System.out.print("\n Ingrese la cantidad que se ingresara al almacen: ");
                      int Cantv = sc.nextInt();
                      
                      Vegetales veg = new Vegetales();
                      
                      veg.Metervegetal(IDv, Cantv);
    
              
              }
        
        
        }
    }
}
