//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 13/03/2019
//Hora de inicio: 07:48
//Hora de fin: 07:
import java.util.Scanner;
class Empleado{
  String Nombre;
  String Puesto;
  void Saludo(){
    System.out.println("Hola, soy"+Nombre+" y hoy voy a ser su "+Puesto);
}
class Carnicero extends Empleado{
  String Articulo;
  int Precio;
  int Cantidad;
  int Total;
  void Proceso(){
    System.out.println("Aqui tiene su "+Articulo+", "+Cantidad+", Kg");
  }
}
class Carnes{
  String Nombre;
  int Precio;
  int Cantidad;
  int Total;
}
  Carnes Chuleta = new Carnes();
  Chuleta.Nombre = "Chuleta de Cerdo";
  Chuleta.Precio = 93;
  Chuleta.Cantidad = 2;
  Chuleta.Total = Chuleta.Precio*Chuleta.Cantidad;
class Supermercado{
public static void main(String[]args){
System.out.println("Carniceria del Supermercado");
Carnicero.Nombre = "Juan";
Carnicero.Puesto = "carnicero";
Carnicero.Saludo();
Carnicero.Articulo = Chuleta.Nombre;
Carnicero.Precio = Chuleta.Precio;
Carnicero.Cantidad = Chuleta.Cantidad;
Carnicero.Total = Chuleta.Total;
Carnicero.Proceso();
}}
