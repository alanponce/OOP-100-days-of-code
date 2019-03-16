//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 15/03/2019
//Hora de inicio: 12:24
//Hora de fin: 12:45
package proyecto.supermercado;
import java.util.Scanner;
public class ProyectoSupermercado {
    public static void main(String[]args){
Scanner N = new Scanner(System.in);
System.out.println("Carniceria del Supermercado");/*Por el momento se va a iniciar el programa usando la carnicería, por lo que se
imprime en pantalla un texto que lo indica.*/
Carnicero.Nombre = "Juan";//Se asigna el atributo de nombre de la clase carnicero como "Juan".
Carnicero.Puesto = "carnicero";//Se asigna el atributo de puesto de la clase carnicero como "carnicero".
Carnicero carnicero = new Carnicero();
carnicero.Saludo();//Realiza el método Saludo de la clase Carnicero.
Carnes Chuleta = new Carnes("Chuleta de Cerdo",92,0);//Se crea una chuleta, la cual es un objeto de la clase carnes.
System.out.println("Va a llevar "+Chuleta.Nombre+" ¿Qué Cantidad?");
Chuleta.Cantidad += N.nextInt();
Carnicero.Articulo = Chuleta.Nombre;//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto chuleta.
Carnicero.Precio = Chuleta.Precio;//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto chuleta.
Carnicero.Cantidad = Chuleta.Cantidad;//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto chuleta.
Carnicero.Total = Chuleta.Precio*Chuleta.Cantidad;//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto chuleta.
Carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero. 
Cajero.Total = Carnicero.Total;//Se asigna el atributo de precio total en la clase cajero con el precio total que posee la clase carnicero.
Cajero.Nombre = "Jorge";//Se asigna el atributo de nombre de la clase carnicero como "Jorge".
Cajero.Puesto = "cajero";//Se asigna el atributo de puesto de la clase cajero como "cajero".
System.out.println("Cajas del Supermercado");//Se imprime un mensaje que indica que ahora se encuentra en las cajas.
Cajero cajero = new Cajero();
cajero.Saludo();//Realiza el método Saludo de la clase Cajero.
Cajero.Caja();//Realiza el método Caja de la clase Cajero.
/*Error solucionado: Al asignar y mostrar primero los atributos y métodos de la clase carnicero, y después asignar y mostrar los
atributos y métodos de la clase cajero, se logra realizar el proceso como se esperaba; de todos modos, aún pienso que ésta práctica no
es óptima, por lo que me dedicaré a investigar alguna manera de hacer esto de forma más efectiva y práctica.*/
}}
