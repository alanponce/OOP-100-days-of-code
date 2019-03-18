//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 16/03/2019
//Hora de inicio: 20:05
//Hora de fin: 20:52
package proyecto.supermercado;
import java.util.Scanner;
public class ProyectoSupermercado {
    public static void main(String[]args){
Scanner N = new Scanner(System.in);
int D;
System.out.println("Carniceria del Supermercado");/*Por el momento se va a iniciar el programa usando la carnicería, por lo que se
imprime en pantalla un texto que lo indica.*/
Carnicero.Nombre = "Juan";//Se asigna el atributo de nombre de la clase carnicero como "Juan".
Carnicero.Puesto = "carnicero";//Se asigna el atributo de puesto de la clase carnicero como "carnicero".
Carnicero carnicero = new Carnicero();//Se crea un objeto de la clase carnicero.
carnicero.Saludo();//Realiza el método Saludo de la clase Carnicero.
do{//Se inicia este bucle para realizar lo que se indique hasta que se seleccione el numero 0.
carnicero.Catalogo();//Se muestra el catalogo de productos que tiene la carniceria.
 D = N.nextInt();//Se llama al Scanner para asignar en D el valor del proximo numero que se inserte.
 if(D>=0&&D<=5){//Se utiliza el condicional if para indicar que se realizara una u otra accion si D se encuentra entre 0 y 5 o si no se encuentra entre estos valores.
     switch(D){/*Se utiliza la sentencia switch para realizar una serie de acciones dependiendo del valor de D.*/
         case 1:
            Carnes Chuleta = new Carnes("Chuleta de Cerdo",92,0);//Se crea una chuleta, la cual es un objeto de la clase carnes.
            System.out.println("Va a llevar "+Chuleta.Nombre+" ¿Qué Cantidad?");
            Chuleta.Cantidad += N.nextInt();
            Carnicero.Articulo = Chuleta.Nombre;//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto chuleta.
            Carnicero.Precio = Chuleta.Precio;//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto chuleta.
            Carnicero.Cantidad = Chuleta.Cantidad;//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto chuleta.
            Carnicero.Total = Carnicero.Total+Chuleta.Precio*Chuleta.Cantidad;//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto chuleta.
            //Verificar si la asignacion de valores a estos atributos de la clase carnicero se puede realizar de una manera que use menos codigo.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            break;
         case 2:
            Carnes Molida = new Carnes("Carne Molida",118,0);
            System.out.println("Va a llevar "+Molida.Nombre+" ¿Qué Cantidad?");
            Molida.Cantidad += N.nextInt();
            Carnicero.Articulo = Molida.Nombre;//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto molida.
            Carnicero.Precio = Molida.Precio;//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto molida.
            Carnicero.Cantidad = Molida.Cantidad;//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto molida.
            Carnicero.Total = Carnicero.Total+Molida.Precio*Molida.Cantidad;//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto molida.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            break;
         case 3:
            Carnes Lengua = new Carnes("Lengua",260,0);
            System.out.println("Va a llevar "+Lengua.Nombre+" ¿Qué Cantidad?");
            Lengua.Cantidad += N.nextInt();
            Carnicero.Articulo = Lengua.Nombre;//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Lengua.
            Carnicero.Precio = Lengua.Precio;//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Lengua.
            Carnicero.Cantidad = Lengua.Cantidad;//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Lengua.
            Carnicero.Total = Carnicero.Total+Lengua.Precio*Lengua.Cantidad;//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Lengua.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            break;
         case 4:
            Carnes Salchicha = new Carnes("Salchicha",98,0);
            System.out.println("Va a llevar "+Salchicha.Nombre+" ¿Qué Cantidad?");
            Salchicha.Cantidad += N.nextInt();
            Carnicero.Articulo = Salchicha.Nombre;//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Salchicha.
            Carnicero.Precio = Salchicha.Precio;//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Salchicha.
            Carnicero.Cantidad = Salchicha.Cantidad;//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Salchicha.
            Carnicero.Total = Carnicero.Total+Salchicha.Precio*Salchicha.Cantidad;//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Salchicha.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            break;
         case 5:
            Carnes Chorizo = new Carnes("Chorizo",60,0);
            System.out.println("Va a llevar "+Chorizo.Nombre+" ¿Qué Cantidad?");
            Chorizo.Cantidad += N.nextInt();
            Carnicero.Articulo = Chorizo.Nombre;//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto Chorizo.
            Carnicero.Precio = Chorizo.Precio;//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto Chorizo.
            Carnicero.Cantidad = Chorizo.Cantidad;//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto Chorizo.
            Carnicero.Total = Carnicero.Total+Chorizo.Precio*Chorizo.Cantidad;//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto Chorizo.
            carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
            break;
         case 0:
            break;
     }
 }
 else{
  System.out.println("No seleccionaste un numero valido.");
 }
}
while(D!=0); 
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
