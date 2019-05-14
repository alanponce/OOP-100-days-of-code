
package inventario;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Almacen implements Menu{
    Scanner sc = new Scanner(System.in); 
    Vegetales v = new Vegetales(); 
    Pan p = new Pan();
    Liquidos l = new Liquidos();
    @Override
        public void Meter(){
            System.out.print("\n Ingrese el ID del producto: ");
            int ID = sc.nextInt();
            System.out.print("\n Ingrese la cantidad que se ingresara al almacen: ");
            int Cant = sc.nextInt();

                    if(ID<=6){
                        v.Metervegetal(ID, Cant);    
                    } 
   
                    if(ID>=7 && ID<=11){
                        p.Meterpan(ID, Cant);
                    }

                    if(ID>=12 && ID<=16){
                        l.Meterliquido(ID, Cant);
                        
                    if(ID>16){
                        System.out.print("ID invalido");
                    }    
                }  
            
        }
    
    @Override
        public void Sacar(){
               JOptionPane.showInputDialog(null,"\n Ingrese el ID del producto: ");
               int ID = sc.nextInt();
               JOptionPane.showInputDialog(null,"\n Ingrese la cantidad que se ingresara al almacen: ");
               int Cant = sc.nextInt();

                    if(ID<=6){
                        v.Sacarvegetal(ID, Cant);
                        } 
                    
                    if(ID>=7 && ID<=11){
                        p.Sacarpan(ID, Cant);
                    }

                    if(ID>=12 && ID<=16){
                        l.Sacarliquido(ID, Cant);
                  }
            
            }
        
    @Override
        public void Mostrar(){

            System.out.print("\nVegetales\n");
            v.printV();
            
            System.out.print("\nPan:\n");
            p.printP();
            
            System.out.print("\nLiquidos:\n");
            l.printL();
            
            
        }
}
