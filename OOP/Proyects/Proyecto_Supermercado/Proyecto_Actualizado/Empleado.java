package proyecto.supermercado;
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
   public static void Proceso(){
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
  public Carnes(String Nombre, int Precio, int Cantidad){//Se crea un constructor para la clase Carnes
      this.Nombre = Nombre;
      this.Precio = Precio;
      this.Cantidad = Cantidad;
  }
}
