
package inventario;


class Vegetales extends Almacen{ 
    public Vegetales(){
 
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
    
    public void Sacarvegetal(int v, int c){
    if(v == 1){
        Sacartomate(c);
        }
    if(v == 2){
        Sacarpepino(c);
        }
    if(v == 3){
        Sacarmorron(c);
        }
    if(v == 4){
        Sacarlechuga(c);
        }
    if(v == 5){
        Sacarjalapeño(c);
        }
    if(v == 6){
        Sacarcebolla(c);
        }
    
    }
    
}
