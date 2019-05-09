
package inventario;


class Liquidos extends Almacen {

     
    protected int mayonesa;
    protected int mostaza;
    protected int dulce;
    protected int chipotle;
    protected int ranch;
    
    public Liquidos(){
        this.chipotle = 0;
        this.dulce = 0;
        this.mayonesa = 0;
        this.mostaza = 0;
        this.ranch = 0;
    }
    
     public void Meterliquido(int l, int c){
        if(l == 1){
            Meterchipotle(c);
        }
        if(l == 2){
            Meterdulce(c);
        }
        if(l == 3){
            Metermayonesa(c);
        }
        if(l == 4){
            Metermostaza(c);
        }
        if(l == 5){
            Meterranch(c);
        }
    }
    
    
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
