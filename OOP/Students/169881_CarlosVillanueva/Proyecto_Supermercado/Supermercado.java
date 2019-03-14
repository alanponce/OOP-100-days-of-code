//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 13/03/2019
//Hora de inicio: 07:48
//Hora de fin: 
import java.util.Scanner;
class Empleado{
  static String Nombre;
  static String Puesto;
  public static void Saludo(){
    System.out.println("Hola, soy "+Nombre+" y hoy voy a ser su "+Puesto);
}}
class Carnicero extends Empleado{
   public Carnicero(){
}
   static String Articulo;
   static int Precio;
   static int Cantidad;
   static int Total;
   static void Proceso(){
    System.out.println("Aqui tiene su "+Articulo+", "+Cantidad+" Kg");
  }
}
class Cajero extends Empleado{
 static int Total;
 static void Caja(){
System.out.println("Van a ser "+Total+" pesos.");
}
}
class Carnes{
  String Nombre;
  int Precio;
  int Cantidad;
  int Total;
}
class Supermercado{
public static void main(String[]args){
System.out.println("Carniceria del Supermercado");
Carnes Chuleta = new Carnes();
Chuleta.Nombre = "Chuleta de Cerdo";
Chuleta.Precio = 93;
Chuleta.Cantidad = 2;
Chuleta.Total = Chuleta.Precio*Chuleta.Cantidad;
Carnicero.Articulo = Chuleta.Nombre;
Carnicero.Precio = Chuleta.Precio;
Carnicero.Cantidad = Chuleta.Cantidad;
Carnicero.Total = Chuleta.Total;
Cajero.Total = Carnicero.Total;
Cajero.Nombre = "Jorge";
Cajero.Puesto = "cajero";
Carnicero.Nombre = "Juan";
Carnicero.Puesto = "carnicero";
Carnicero.Saludo();//Error: El saludo se muestra como si estuviera hablando el cajero, debo investigar y corregir.
Carnicero.Proceso();
System.out.println("Cajas del Supermercado");
Cajero.Saludo();
Cajero.Caja();
}}
