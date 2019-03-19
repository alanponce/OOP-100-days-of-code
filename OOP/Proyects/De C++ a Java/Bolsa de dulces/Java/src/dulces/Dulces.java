
package dulces;//Se crea el package dulces en el que estaran las clases relacionadas entre si.


public class Dulces {//Se crea la clase Dulces 

    public static void main(String[] args) {//Se crea el main
       Bolsa c= new Bolsa();//Se declara el objeto c de la clase Bolsa
       
        //Dulce Azul=1, Dulce Rojo=2, Dulce Verde=3
        
        //Con el objeto c se llama la funcion Meterdulce 
       c.MeterDulce(1);
       c.MeterDulce(2);
       c.MeterDulce(3);
       c.MeterDulce(3);
       //Con el objeto c se llama la funcion SacarDulce
       c.SacarDulce(3);
       //Con el objeto c se llama la funcion Imprimir
       c.Imprimir();
    }
    
}