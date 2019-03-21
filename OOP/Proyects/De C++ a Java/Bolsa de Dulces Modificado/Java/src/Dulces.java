package dulces;

public class Dulces {
    public static void main(String[] args) {
        Bolsa b = new Bolsa();//Se crea el objeto b de la clase Bolsa
        //Con el objeto b se llama la funcion MeterDulce
        b.MeterDulce(2);
        b.MeterDulce(1);
        b.MeterDulce(3);
        b.MeterDulce(2);
        b.MeterDulce(2);
        //Con el objeto b se llama la funcion SacarDulce
        b.SacarDulce(2);
        //Con el objeto b se llama la funcion Imprimir
        b.Imprimir();
        
       
    }
}
