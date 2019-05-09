
package inventario;


public class Almacen {

    private int tomate;
    private int cebolla;
    private int lechuga;
    private int morron;
    private int jalapeño;
    private int pepino ;
    
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
        jalapeño += x;
    }
    
    public void Metercebolla(int x){
        cebolla += x;
    }
    
        public void Sacartomate(int x){
        tomate -= x;
    }
    
    public void Sacarpepino(int x){
        pepino -= x;
    }
    
    public void Sacarmorron(int x){
        morron -= x;
    }
    
    public void Sacarlechuga(int x){
        lechuga -= x;
    }
    
    public void Sacarjalapeño(int x){
        jalapeño -= x;
    }
    
    public void Sacarcebolla(int x){
        cebolla -= x;
    }
    
    
    private int ajo ;
    private int parmesano;
    private int integral;
    private int blanco;
    private int avena;
    
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
   
    private int mayonesa;
    private int mostaza;
    private int dulce;
    private int chipotle;
    private int ranch;
    
        
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
