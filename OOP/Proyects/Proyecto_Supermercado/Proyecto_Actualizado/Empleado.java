package proyecto.supermercado;
public abstract class Empleado{//La clase empleado se implementa para simular atributos y comportamientos de un empleado de supermercado.
  //Se declaran los atributos de la clase Empleado, que pueden ser heredadas por otras clases.
  static String Nombre;
  static String Puesto;
  //Se crea el método abstracto saludo, que puede ser heredado por otras clases.
  public abstract void Presentacion();
      
}
class Carnicero extends Empleado{//La clase carnicero es heredada de la clase empleado para simular a un carnicero de supermercado.
   //Se declaran los atributos propios de la clase carnicero.
   static String Articulo;
   static int Precio;
   static float Cantidad;
   static float Total;
   @Override
   public void Presentacion(){
   System.out.println("Carniceria del Supermercado");
   System.out.println("Hola, soy "+Nombre+" y hoy voy a ser su "+Puesto);
   }
  //Se crea el método proceso, el cual es propio de la clase Carnicero.
   void Catalogo(){
    System.out.println("El día de hoy contamos con: \n1. Chuleta de Cerdo \n2. Carne Molida \n3. Lengua \n4. Salchicha \n5. Chorizo \n6. Chicharrón de Cerdo \n7. Milanesa de Cerdo \n8. Costilla de Cerdo \n9. Sirloin de Ternera \n10. Pata de Res \n0. Ir a otra sección \nEscoge un número:");
   }
   public void Proceso(){
    System.out.println("Aqui tiene su "+Articulo+", "+Cantidad+" Kg");
  }
}
class Fruteria extends Empleado{
   static String Articulo;
   static int Precio;
   static float Cantidad;
   static float Total;
    @Override
    public void Presentacion(){
    System.out.println("Esta es la sección de frutas y verduras del supermercado");    
    }
    void Estantes(){
        System.out.println("En esta sección hay estantes con diferentes productos: \n1. Manzana \n2. Naranja \n3. Platano \n4. Mango \n5.Guayaba \n6. Zanahoria \n7. Cebolla \n8. Apio \n9. Brócoli \n10. Lechuga \n0. Ir a otra sección");
    }
    public void Eleccion(){
        System.out.println("Has decidido elegir "+Cantidad+" Kg de "+Articulo);
    }
}
class Pescadero extends Empleado{
   static String Articulo;
   static int Precio;
   static float Cantidad;
   static float Total;
    @Override
    public void Presentacion(){
    System.out.println("Pescadería del supermercado");    
    }
    void Catalogo(){
        System.out.println("Hoy tenemos: \n1. Filete de Basa \n2. Camarón \n3. Filete de Salmón \n4. Filete de Pescado de Alaska \n5. Filete de Mojarra \n6. Barrita de Pescado \n7. Mojarra Entera \n8. Huachinango \n9. Pescado para Caldo \n10. Figuritas de Pescado Empanizado \n0. Ir a otra sección");
    }
    public void Proceso(){
        System.out.println("Aquí tiene su "+Articulo+", "+Cantidad+" Kg");
    }
}
class Cajero extends Empleado{//La clase cajero es heredada de la clase empleado para simular a un cajero de supermercado.
 //Se declaran atributos propios de la clase cajero.
 static String Articulos = "";
 static float Total;
 //Se crea el método caja, el cual es propio de la clase Cajero
 @Override
   public void Presentacion(){
   System.out.println("Hola, soy "+Nombre+" y hoy voy a ser su "+Puesto);
   }
 static void Caja(){
System.out.print(Cajero.Articulos);
System.out.println("\nVan a ser "+Total+" pesos.");
}
}
class Articulo{//La clase Articulo es creada para simular los atributos de un producto en el supermercado.
  //Se declaran los atributos de la clase Articulo
  String Nombre;
  int Precio;
  float Cantidad;
  float Total;
  public Articulo(String Nombre, int Precio, int Cantidad){
      this.Nombre = Nombre;
      this.Precio = Precio;
      this.Cantidad = Cantidad;
  }
}
