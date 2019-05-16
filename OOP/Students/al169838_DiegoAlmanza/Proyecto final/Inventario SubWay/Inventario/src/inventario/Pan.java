//Paquete en el que se encontraran las calses usadas ene ste proyecto 

package inventario;
//Clase Pan que hereda de la clase Productos
public class Pan extends Productos{
    //Se declaran las variables de tipo entero, las variables son privadas para que solo se modifique su valor dentro de esta clase
    private int ajo ;
    private int parmesano;
    private int integral;
    private int blanco;
    private int avena;
   //constructor de la clase, recibe dos parametros de tipo entero
    public Pan(int id, int c){
       //se invoca el constructor de la clase padre
        super (id, c);
        //dependiendo del id se agrega la cantidad a las variables
           if(id == 7){
            ajo += c;
           }
        if(id == 8){
            avena += c;
           }
        if(id == 9){
            blanco += c;
           }
        if(id == 10){
            integral += c;
           }
        if(id == 11){
            parmesano += c;
           }
       }
    
    //metodo para saber la cantidad de las variables
    public void printP(){
        System.out.print("\nAjo Rostizado: "+ajo);
        System.out.print("\nAvena: "+avena);
        System.out.print("\nBlanco: "+blanco);
        System.out.print("\nIntegral: "+integral);
        System.out.print("\nOregano parmesano: "+parmesano);
        
    }
    
   
}

