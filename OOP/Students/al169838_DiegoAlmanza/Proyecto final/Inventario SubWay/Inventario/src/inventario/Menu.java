
package inventario;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu {
    Scanner sc = new Scanner(System.in);
    
    public void menu(){
    JOptionPane.showInputDialog("\"Seleccione una opcion: \n 1. Meter a Almacen \n 2. Sacar de Almacen \n 3. Buscar \n 4. Inventario actual \n 5. Salir \n");
    int o = sc.nextInt();
        
        switch(o){
            case 1:
              JOptionPane.showInputDialog("Seleccione que tipo de producto desea ingresar al almacen: \n 1. Vegetales \n 2. Pan \n 3. Liquido  \n 4. Regresar");
              int ov = sc.nextInt();
              
              do{
              switch(ov){
                  case 1:
                      JOptionPane.showInputDialog("\n Ingrese el ID del vegetal: ");
                      int IDv = sc.nextInt();
                      JOptionPane.showInputDialog("\n Ingrese la cantidad que se ingresara al almacen: ");
                      int Cantv = sc.nextInt();
                      
                      Vegetales veg = new Vegetales();
                      
                      veg.Metervegetal(IDv, Cantv);
                      
                      break;
                      
                  case 2:
                      JOptionPane.showInputDialog("\n Ingrese el ID del pan: ");
                      int IDp = sc.nextInt();
                      JOptionPane.showInputDialog("\n Ingrese la cantidad que se ingresara al almacen: ");
                      int Cantp = sc.nextInt(); 
                      
                      Pan p = new Pan();
                      
                      p.Meterpan(IDp, Cantp);
                      break;
                      
                  case 3:
                      JOptionPane.showInputDialog("\n Ingrese el ID del liquido: ");
                      int IDl = sc.nextInt();
                      JOptionPane.showInputDialog("\n Ingrese la cantidad que se ingresara al almacen: ");
                      int Cantl = sc.nextInt(); 
                      
                      Liquidos l = new Liquidos();
                      
                      l.Meterliquido(IDl, Cantl);
                      break;
    
                 }
              }while(ov!=4);
        
        }
    }
}
