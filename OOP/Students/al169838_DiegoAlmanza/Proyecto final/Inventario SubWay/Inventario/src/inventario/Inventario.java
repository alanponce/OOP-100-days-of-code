
package inventario;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Inventario {
    
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
            System.out.print("\n Ingrese el ID del producto: ");
            int ID = sc.nextInt();
            System.out.print("\n Ingrese la cantidad que se ingresara al almacen: ");
            int Cant = sc.nextInt();
            Vegetales v = new Vegetales();
            v.Metervegetal(ID, Cant);
            v.printV();
            */
            
            Scanner sc = new Scanner(System.in);
            boolean salir = false;
            Almacen a = new Almacen();
            Vegetales v = new Vegetales();
            while(!salir){
            System.out.print("\n1. Meter al Almacen\n2. Sacar del Almacen\n3. Ver inventario \n4. Buscar \n5. Salir");
                
            System.out.print("\n Eliga una opcion: ");
            int Opc = sc.nextInt();
            
            
            switch(Opc){
                case 1:
                    a.Meter();
                    break;
                case 2:
                    a.Sacar();
                    break;
                case 3:
                    v.printV();
                    break;
                case 4:
                    break;
                
                case 5:
                    salir = true;
                    break;
            }
            
        }        
            
    }  
}
