
package inventario;

public class Carnes extends Productos{
    //declaramos las variables privadas de tipo entero
    private int costilla;
    private int atun;
    private int pollo;
    private int salami;
    private int jamon;
    private int peperoni;
            
    //constructor de la calse
    Carnes(int id, int c){
        //invocamos al constructor de la calse padre
        super(id, c);
        //dependiendo del id agregamos las cantidades
        if(ID==17){
            costilla += c;
        }
        if(ID==18){
            atun += c;
        }
        if(ID==19){
            pollo += c;
        }
        if(ID==20){
            salami += c;
        }
        if(ID==21){
            jamon += c;
        }
        if(ID==22){
            peperoni += c;
        }
    }
    //Metodo para saber las cantidades de las carnes
    public void printC(){
          System.out.print("Costilla: "+costilla+" kg\n");
          System.out.print("Atún: "+atun+" kg\n");
          System.out.print("Pollo: "+pollo+" kg\n");
          System.out.print("Salami: "+salami+" kg\n");
          System.out.print("Jamón: "+jamon+" kg\n");
          System.out.print("Peperoni: "+peperoni+" kg\n");
    }
}
