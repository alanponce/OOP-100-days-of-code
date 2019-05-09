
package inventario;


class Vegetales extends Almacen{ 
    
    private int tomate;
    private int cebolla;
    private int lechuga;
    private int morron;
    private int jalapeño;
    private int pepino ;
    
  
    
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
}
