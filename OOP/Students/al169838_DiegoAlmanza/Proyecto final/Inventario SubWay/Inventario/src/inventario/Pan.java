
package inventario;

public class Pan extends Almacen{

       public Pan(){
           this.ajo = 0;
           this.avena = 0;
           this.blanco = 0;
           this.integral = 0;
       }
    
       public void Meterpan(int p, int c){
           if(p == 1){
               Meterajo(c);
           }
           if(p == 2){
               Meteravena(c);
           }
           if(p == 3){
               Meterblanco(c);
           }
           if(p == 4){
               Meterintegral(c);
           }
       }
}
