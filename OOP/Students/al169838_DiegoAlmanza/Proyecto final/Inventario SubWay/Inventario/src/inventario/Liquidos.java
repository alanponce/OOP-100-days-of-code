//Paquete en el que se encontraran las calses usadas ene ste proyecto 
package inventario;

//clase liquidos que hereda de la calas eProductos
public class Liquidos extends Productos{
//variables privadas de tipo entero
    private int mayonesa;
    private int mostaza;
    private int dulce;
    private int chipotle;
    private int ranch;

    //constructor de la calse
    public Liquidos(int id, int c){
       //se invoca el constructor de la clase padre
        super (id, c);
        //dependiendo del id se agregara la cantidad a cada variable
       if(id == 12){
            chipotle += c;
        }
        if(id == 13){
            dulce += c;
        }
        if(id == 14){
            mayonesa += c;
        }
        if(id == 15){
            mostaza += c;
        }
        if(id == 16){
            ranch += c;
        }
    }
    
    //metodo para saber el valor de cada variable
    public void printL(){
        System.out.print("\nChipotle: "+chipotle+" Lt.");
        System.out.print("\nMostaza Dulce: "+dulce+" Lt.");
        System.out.print("\nMayonesa: "+mayonesa+" Lt.");
        System.out.print("\nMostaza: "+mostaza+" Lt.");
        System.out.print("\nRanch: "+ranch+" Lt.");
        
        
    }
    
    
  
}
