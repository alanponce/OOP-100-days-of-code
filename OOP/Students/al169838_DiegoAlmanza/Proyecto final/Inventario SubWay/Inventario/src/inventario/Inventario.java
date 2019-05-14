
package inventario;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Inventario {
    
    public static void main(String[] args) {

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
                    a.Mostrar();
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
