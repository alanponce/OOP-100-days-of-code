
package inventario;

class Pan extends Almacen{


   
    public Pan(){

       }
    
       public void Meterpan(int p, int c){
           if(p == 7){
               Meterajo(c);
           }
           if(p == 8){
               Meteravena(c);
           }
           if(p == 9){
               Meterblanco(c);
           }
           if(p == 10){
               Meterintegral(c);
           }
       }
       

      
}
