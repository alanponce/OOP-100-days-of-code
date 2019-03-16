//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 14/03/2019
//Hora de inicio: 19:01
//Hora de fin: 20:10

class Empleado{//La clase empleado se implementa para simular atributos y comportamientos de un empleado de supermercado.
  //Se declaran los atributos de la clase Empleado, que pueden ser heredadas por otras clases.
  static String Nombre;
  static String Puesto;
  //Se crea el método saludo, que puede ser heredado por otras clases.
  public static void Saludo(){
    System.out.println("Hola, soy "+Nombre+" y hoy voy a ser su "+Puesto);
}}
class Carnicero extends Empleado{//La clase carnicero es heredada de la clase empleado para simular a un carnicero de supermercado.
   //Se declaran los atributos propios de la clase carnicero.
   static String Articulo;
   static int Precio;
   static int Cantidad;
   static int Total;
  //Se crea el método proceso, el cual es propio de la clase Carnicero.
   static void Proceso(){
    System.out.println("Aqui tiene su "+Articulo+", "+Cantidad+" Kg");
  }
}
class Cajero extends Empleado{//La clase cajero es heredada de la clase empleado para simular a un cajero de supermercado.
 //Se declaran atributos propios de la clase cajero.
 static int Total;
 //Se crea el método caja, el cual es propio de la clase Cajero
 static void Caja(){
System.out.println("Van a ser "+Total+" pesos.");
}
}
class Carnes{//La clase carnes es creada para simular los atributos de un producto de carne en el supermercado.
  //Se declaran los atributos de la clase Carnes
  String Nombre;
  int Precio;
  int Cantidad;
  int Total;
}
class Supermercado{/*La clase supermercado implementa una aplicación que simula una compra en un supermercado.*/
public static void main(String[]args){
System.out.println("Carniceria del Supermercado");/*Por el momento se va a iniciar el programa usando la carnicería, por lo que se
imprime en pantalla un texto que lo indica.*/
Carnes Chuleta = new Carnes();//Se crea una chuleta, la cual es un objeto de la clase carnes.
Chuleta.Nombre = "Chuleta de Cerdo";//Se indica que su atributo de nombre es el de "Chuleta de Cerdo".
Chuleta.Precio = 93;//Se indica que su atributo de precio es de $93.
Chuleta.Cantidad = 2;//Se indica que la cantidad que se va a comprar es 2.
Chuleta.Total = Chuleta.Precio*Chuleta.Cantidad;//Se indica que el precio total va a ser la multiplicación entre el precio unitario y la cantidad.
Carnicero.Articulo = Chuleta.Nombre;//Se asigna el atributo de artículo en la clase carnicero con el nombre que posee el objeto chuleta.
Carnicero.Precio = Chuleta.Precio;//Se asigna el atributo de precio en la clase carnicero con el precio que posee el objeto chuleta.
Carnicero.Cantidad = Chuleta.Cantidad;//Se asigna el atributo de cantidad en la clase carnicero con la cantidad que posee el objeto chuleta.
Carnicero.Total = Chuleta.Total;//Se asigna el atributo de precio total en la clase carnicero con el precio total que posee el objeto chuleta.
Cajero.Total = Carnicero.Total;//Se asigna el atributo de precio total en la clase cajero con el precio total que posee la clase carnicero.
Carnicero.Nombre = "Juan";//Se asigna el atributo de nombre de la clase carnicero como "Juan".
Carnicero.Puesto = "carnicero";//Se asigna el atributo de puesto de la clase carnicero como "carnicero".
Carnicero.Saludo();//Realiza el método Saludo de la clase Carnicero.
Carnicero.Proceso();//Realiza el método Proceso de la clase Carnicero.
Cajero.Nombre = "Jorge";//Se asigna el atributo de nombre de la clase carnicero como "Jorge".
Cajero.Puesto = "cajero";//Se asigna el atributo de puesto de la clase cajero como "cajero".
System.out.println("Cajas del Supermercado");//Se imprime un mensaje que indica que ahora se encuentra en las cajas.
Cajero.Saludo();//Realiza el método Saludo de la clase Cajero.
Cajero.Caja();//Realiza el método Caja de la clase Cajero.
/*Error solucionado: Al asignar y mostrar primero los atributos y métodos de la clase carnicero, y después asignar y mostrar los
atributos y métodos de la clase cajero, se logra realizar el proceso como se esperaba; de todos modos, aún pienso que ésta práctica no
es óptima, por lo que me dedicaré a investigar alguna manera de hacer esto de forma más efectiva y práctica.*/
}}
