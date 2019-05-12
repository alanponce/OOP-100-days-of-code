
package inventario;


public class Vegetales{ 
    
    private int tomate;
    private int cebolla;
    private int lechuga;
    private int morron;
    private int jalapeño;
    private int pepino ;
    
    public Vegetales(){
        tomate = 0;
        cebolla = 0;
        lechuga = 0;
        morron = 0;
        jalapeño = 0;
        pepino = 0;
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
    
    public void printV(){
          System.out.print("Tomate: "+tomate+" kg\n");
          System.out.print("Pepino: "+pepino+" kg\n");
          System.out.print("Chile Morron: "+morron+" kg\n");
          System.out.print("Lechuga: "+lechuga+" kg\n");
          System.out.print("Jalapeño: "+jalapeño+" kg\n");
          System.out.print("Cebolla morada: "+cebolla+" kg\n");
    }
    
    private void Metertomate(int x){
        tomate += x; 
    }

    private void Meterpepino(int x){
        pepino += x;
    }
    
    private void Metermorron(int x){
        morron += x;
    }
    
    private void Meterlechuga(int x){
        lechuga += x;
    }
    
    private void Meterjalapeño(int x){
        jalapeño += x;
    }
    
    private void Metercebolla(int x){
        cebolla += x;
    }
    
    private void Sacartomate(int x){
        tomate -= x;
    }
    
    private void Sacarpepino(int x){
        pepino -= x;
    }
    
    private void Sacarmorron(int x){
        morron -= x;
    }
    
    private void Sacarlechuga(int x){
        lechuga -= x;
    }
    
    private void Sacarjalapeño(int x){
        jalapeño -= x;
    }
    
    private void Sacarcebolla(int x){
        cebolla -= x;
    }
    
    
}
