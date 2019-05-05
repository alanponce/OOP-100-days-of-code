
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
    
    public void Metertomate(int x){
        tomate += x; 
    }

    public void Meterpepino(int x){
        pepino += x;
    }
    
    public void Metermorron(int x){
        morron += x;
    }
    
    public void Meterlechuga(int x){
        lechuga += x;
    }
    
    public void Meterjalapeño(int x){
        lechuga += x;
    }
    
    public void Metercebolla(int x){
        lechuga += x;
    }
}
