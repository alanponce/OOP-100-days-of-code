
package inventario;


public class Liquidos extends Almacen {

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
    
}
