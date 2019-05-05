
package inventario;


public class Vegetales extends Almacen{ 
    

    
    public Vegetales(){
        this.tomate = 0;
        this.pepino = 0;
        this.morron = 0;
        this.lechuga = 0;
        this.jalapeño = 0;
        this.cebolla = 0; 
    }
   
    
    
    public void Metervegetal(int v, int c){
       if(v == 1){
           Metertomate(c);
       }
       if(v == 2){
           Meterpepino(c);
       }
       if(v == 3){
           Metermorron(c);
       }
       if(v == 4){
           Meterlechuga(c);
       }
       if(v == 5){
           Meterjalapeño(c);
       }
       if(v == 6){
           Metercebolla(c);
       }
    }
}
