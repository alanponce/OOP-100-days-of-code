
package inventario;


class Liquidos extends Almacen {

     

    
    public Liquidos(){

    }
    
     public void Meterliquido(int l, int c){
        if(l == 11){
            Meterchipotle(c);
        }
        if(l == 12){
            Meterdulce(c);
        }
        if(l == 13){
            Metermayonesa(c);
        }
        if(l == 14){
            Metermostaza(c);
        }
        if(l == 15){
            Meterranch(c);
        }
    }
    

    

    
   
}
