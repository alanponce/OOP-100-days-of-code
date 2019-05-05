
package inventario;


public class Almacen {

    protected int tomate;
    protected int cebolla;
    protected int lechuga;
    protected int morron;
    protected int jalapeño;
    protected int pepino ;
    
    Vegetales veg = new Vegetales();
    
    public void Metervegetal(int v, int c){
       if(v == 1){
           veg.Metertomate(c);
       }
       if(v == 2){
           veg.Meterpepino(c);
       }
       if(v == 3){
           veg.Metermorron(c);
       }
       if(v == 4){
           veg.Meterlechuga(c);
       }
       if(v == 5){
           veg.Meterjalapeño(c);
       }
       if(v == 6){
           veg.Metercebolla(c);
       }
       
    
    }
    
    
}
