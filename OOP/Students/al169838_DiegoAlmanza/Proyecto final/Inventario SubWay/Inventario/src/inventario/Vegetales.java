//Paquete en el que se encontraran las calses usadas ene ste proyecto 
package inventario;

//Clase Vegetales que hereda de la clase Productos
public class Vegetales extends Productos{ 
    //Se declaran la variables privadas de tipo int
    private int tomate;
    private int cebolla;
    private int lechuga;
    private int morron;
    private int jalapeño;
    private int pepino ;
    
    //Constructor de la clase que recibe dos parametros de tipo entero
    public Vegetales(int id, int c){
        //invoca el constructor de la calse padre
        super(id, c);
        //si el id es 1 ingresamos la cantidad a la variable tomate
        if(id == 1){
           tomate += c;
       }
        //si el id es 2 ingresamos la cantidad a la variable pepino
        if(id == 2){
           pepino += c;
       }
        //si el id es 3 ingresamos la cantidad a la variable morron
       if(id == 3){
           morron += c;
       }
       //si el id es 4 ingresamos la cantidad a la variable lechuga
       if(id == 4){
           lechuga += c;
       }
       //si el id es 5 ingresamos la cantidad a la variable jalapeño
       if(id == 5){
           jalapeño += c;
       }
       //si el id es 6 ingreamos la cantidad a la variable cebolla
       if(id == 6){
           cebolla += c;
       }
    }
  
    //funcion para mostrar la cantidad en cada variable
    public void printV(){
          System.out.print("Tomate: "+tomate+" kg\n");
          System.out.print("Pepino: "+pepino+" kg\n");
          System.out.print("Chile Morron: "+morron+" kg\n");
          System.out.print("Lechuga: "+lechuga+" kg\n");
          System.out.print("Jalapeño: "+jalapeño+" kg\n");
          System.out.print("Cebolla morada: "+cebolla+" kg\n");
    }
    
}
