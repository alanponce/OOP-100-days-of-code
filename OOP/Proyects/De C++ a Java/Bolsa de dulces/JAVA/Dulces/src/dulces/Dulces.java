
package dulces;


public class Dulces {

    public static void main(String[] args) {
       Bolsa c= new Bolsa();
       
       c.MeterDulce(1);
       c.MeterDulce(2);
       c.MeterDulce(3);
       c.MeterDulce(3);
       
       c.SacarDulce(3);
       
       
       c.Imprimir();
    }
    
}
