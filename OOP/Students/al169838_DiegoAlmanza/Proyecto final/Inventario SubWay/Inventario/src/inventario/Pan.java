
package inventario;

public class Pan{

    private int ajo ;
    private int parmesano;
    private int integral;
    private int blanco;
    private int avena;
   
    public Pan(){
        ajo = 0;
        parmesano = 0;
        integral = 0;
        blanco = 0;
        avena = 0;
       }
    
    public void Meterpan(int p, int c){
        if(p == 7){
            Meterajo(c);
           }
        if(p == 8){
            Meteravena(c);
           }
        if(p == 9){
            Meterblanco(c);
           }
        if(p == 10){
            Meterintegral(c);
           }
        if(p == 11){
            Meterparmesano(c);
           }
       }
       
    public void Sacarpan(int p, int c){
        if(p == 7){
            Sacarajo(c);
            }
        if(p == 8){
            Sacaravena(c);
           }
        if(p == 9){
            Sacarblanco(c);
           }
        if(p == 10){
            Sacarintegral(c);
           }
        if(p == 11){
            Sacarparmesano(c);
           }
       }
       
    
    public void printP(){
        System.out.print("\nAjo Rostizado: "+ajo);
        System.out.print("\nAvena: "+avena);
        System.out.print("\nBlanco: "+blanco);
        System.out.print("\nIntegral: "+integral);
        System.out.print("\nOregano parmesano: "+parmesano);
        
    }
    
    private void Meterajo(int x){
       ajo += x;
        } 
   
    private void Meterparmesano(int x){
       parmesano += x;
        }
   
    private void Meterintegral(int x){
       integral += x;
        }
   
    private void Meterblanco(int x){
       blanco += x;
        }     
   
    private void Meteravena(int x){
       avena += x;
        }

    private void Sacarajo(int x){
       ajo -= x;
        }
   
    private void Sacarparmesano(int x){
       parmesano -= x; 
        }
   
    private void Sacarintegral(int x){
       integral -= x;
        }
   
    private void Sacarblanco(int x){
       blanco -= x;
        }
   
    private void Sacaravena(int x){
       avena -= x;
        }

}

