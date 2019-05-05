
package inventario;


public class Almacen {
    protected int tomate;
    protected int cebolla;
    protected int lechuga;
    protected int morron;
    protected int jalapeño;
    protected int pepino ;
    
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
    
    
    protected int ajo ;
    protected int parmesano;
    protected int integral;
    protected int blanco;
    protected int avena;
    
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
    
    protected int mayonesa;
    protected int mostaza;
    protected int dulce;
    protected int chipotle;
    protected int ranch; 
    
    public void Metermayonesa(int x){
        mayonesa += x;
    }
    
    public void Metermostaza(int x){
        mostaza += x;
    }
    
    public void Meterdulce(int x){
        dulce += x;
    }
    
    public void Meterchipotle(int x){
        chipotle += x;
    }
    
    public void Meterranch(int x){
        ranch += x;
    }
}
