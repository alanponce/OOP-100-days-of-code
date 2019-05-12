
package inventario;


public class Liquidos {

    private int mayonesa;
    private int mostaza;
    private int dulce;
    private int chipotle;
    private int ranch;

    
    public Liquidos(){
        mayonesa=0;
        mostaza=0;
        dulce=0;
        chipotle=0;
        ranch=0;
    }
    
     public void Meterliquido(int l, int c){
        if(l == 12){
            Meterchipotle(c);
        }
        if(l == 13){
            Meterdulce(c);
        }
        if(l == 14){
            Metermayonesa(c);
        }
        if(l == 15){
            Metermostaza(c);
        }
        if(l == 16){
            Meterranch(c);
        }
    }
     
    public void Sacarliquido(int l, int c){
        if(l == 12){
            Sacarchipotle(c);
        }
        if(l == 13){
            Sacardulce(c);
        }
        if(l == 14){
            Sacarmayonesa(c);
        }
        if(l == 15){
            Sacarmostaza(c);
        }
        if(l == 16){
            Sacarranch(c);
        }
    } 
    
    public void printL(){
        System.out.print("Chipotle: "+chipotle+" Lt.");
        System.out.print("Mostaza Dulce: "+dulce+" Lt.");
        System.out.print("Mayonesa: "+mayonesa+" Lt.");
        System.out.print("Mostaza: "+mostaza+" Lt.");
        System.out.print("Ranch: "+ranch+" Lt.");
        
        
    }
    
    
    private void Metermayonesa(int x){
        mayonesa += x;
    }
    
    private void Metermostaza(int x){
        mostaza += x;
    }
    
    private void Meterdulce(int x){
        dulce += x;
    }
    
    private void Meterchipotle(int x){
        chipotle += x;
    }
    
    private void Meterranch(int x){
        ranch += x;
    }
    
    private void Sacarmayonesa(int x){
        mayonesa -= x;
    }
    
    private void Sacarmostaza(int x){
        mostaza -= x;
    }
    
    private void Sacardulce(int x){
        dulce -= x;
    }
    
    private void Sacarchipotle(int x){
        chipotle -= x;
    }
    
    private void Sacarranch(int x){
        ranch -= x;
    }
    
   
}
