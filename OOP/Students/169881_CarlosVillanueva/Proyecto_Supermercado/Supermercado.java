import java.util.Scanner;
class Carnes{
  String Nombre;
  int Precio;
  int Cantidad;
  int Total;
}
class Supermercado{
public static void main(String[]args){
System.out.println("Supermercado en línea");
Carnes Chuleta = new Carnes();
  Chuleta.Nombre = "Chuleta de Cerdo";
  Chuleta.Precio = 93;
  Chuleta.Cantidad = 2;
  Chuleta.Total = Chuleta.Precio*Chuleta.Cantidad;
System.out.println(Chuleta.Nombre+", Precio: "+Chuleta.Precio+", cantidad: "+Chuleta.Cantidad+" total: "+Chuleta.Total);
}}
