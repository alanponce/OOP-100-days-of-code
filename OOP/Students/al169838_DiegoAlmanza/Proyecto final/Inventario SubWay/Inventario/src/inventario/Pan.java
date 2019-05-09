
package inventario;

class Pan extends Almacen{

    private int ajo ;
    private int parmesano;
    private int integral;
    private int blanco;
    private int avena;
   
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
       
   public void Meterajo(int x){
       ajo += x;
   } 
   
   public void Meterparmesano(int x){
       parmesano += x;
   }
   
   public void Meterintegral(int x){
       integral += x;
   }
   
   public void Meterblanco(int x){
       blanco += x;
   } 
   
   public void Meteravena(int x){
       avena += x;
   }
      
}
