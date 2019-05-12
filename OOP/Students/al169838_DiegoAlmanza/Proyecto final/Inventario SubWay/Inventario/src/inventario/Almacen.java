
package inventario;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Almacen implements Menu{
    Scanner sc = new Scanner(System.in); 
        
    @Override
        public void Meter(){
            System.out.print("\n Ingrese el ID del producto: ");
            int ID = sc.nextInt();
            System.out.print("\n Ingrese la cantidad que se ingresara al almacen: ");
            int Cant = sc.nextInt();
                
                Vegetales v = new Vegetales();
                
                    if(ID<=6){
                        v.Metervegetal(ID, Cant);
                        
                    } 
                
                Pan p = new Pan();
                    if(ID>=7 && ID<=11){
                        p.Meterpan(ID, Cant);
                    }
                
                Liquidos l = new Liquidos();
                    if(ID>=12 && ID<=16){
                        l.Meterliquido(ID, Cant);
                }  
            
        }
    
    @Override
        public void Sacar(){
               JOptionPane.showInputDialog(null,"\n Ingrese el ID del producto: ");
               int ID = sc.nextInt();
               JOptionPane.showInputDialog(null,"\n Ingrese la cantidad que se ingresara al almacen: ");
               int Cant = sc.nextInt();
                
                Vegetales v = new Vegetales();
                
                    if(ID<=6){
                        v.Sacarvegetal(ID, Cant);
                        } 
                
                Pan p = new Pan();
                    if(ID>=7 && ID<=11){
                        p.Sacarpan(ID, Cant);
                    }
                
                Liquidos l = new Liquidos();
                    if(ID>=12 && ID<=16){
                        l.Sacarliquido(ID, Cant);
                  }
            
            }
        
    @Override
        public void Mostrar(){
            Vegetales v = new Vegetales();
            System.out.print("\nVegetales\n");
            v.printV();
            Pan p = new Pan();
            System.out.print("\nPan:\n");
            p.printP();
            Liquidos l = new Liquidos();
            System.out.print("\nLiquidos:\n");
            l.printL();
            
            
        }
}
