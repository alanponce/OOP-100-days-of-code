import java.util.Scanner;
class Carnes{
  private String Nombre;
  private int Precio;
  private int Cantidad;
  private int Total;
}
class Supermercado{
public static void main(String[]args){
System.out.println("Supermercado en línea");
Carnes Chuleta = new Carnes();
  Chuleta.nombre = "Chuleta de Cerdo";
  Chuleta.Precio = 93;
  Chuleta.Cantidad = 2;
  Chuleta.Total = Chuleta.Precio*Chuleta.Cantidad;
System.out.println(Chuleta.nombre+", Precio: "+Chuleta.Precio+", cantidad: "+Chuleta.Cantidad+" total: "+Chuleta.Total);
}}
