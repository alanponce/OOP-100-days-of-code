package proyecto.supermercado;
import javax.swing.*;
public abstract class Empleado{//La clase empleado se implementa para simular atributos y comportamientos de un empleado de supermercado.
  //Se declaran los atributos de la clase Empleado, que pueden ser heredadas por otras clases.
  String Nombre;
  String Puesto;
  //Se crea el método abstracto saludo, que puede ser heredado por otras clases.
  public abstract void Presentacion();
      
}
class Carnicero extends Empleado{//La clase carnicero es heredada de la clase empleado para simular a un carnicero de supermercado.
   //Se declaran los atributos propios de la clase carnicero.
   static String Articulo;
   static int Precio;
   static float Cantidad;
   static float Total;
   static String Eleccion;
   @Override //Se sobreescribe el método abstracto Presentación de la clase padre empleado con el contenido del método en la clase Carnicero
   public void Presentacion(){
   JOptionPane.showMessageDialog(null,"Carniceria del Supermercado");
   JOptionPane.showMessageDialog(null,"Hola, soy "+Nombre+" y hoy voy a ser su "+Puesto);
   }
   //Se crea el método Catalogo, que imprime una lista con los artículos disponibles en la carnicería del supermercado.
   void Catalogo(){
    Eleccion = JOptionPane.showInputDialog(null,"El día de hoy contamos con: \n1. Chuleta de Cerdo \n2. Carne Molida \n3. Lengua \n4. Salchicha \n5. Chorizo \n6. Chicharrón de Cerdo \n7. Milanesa de Cerdo \n8. Costilla de Cerdo \n9. Sirloin de Ternera \n10. Pata de Res \n0. Ir a otra sección \nEscoge un número:");
   }
   public void Proceso(){ //Se crea el método proceso, que imprime en pantalla el artículo elegido junto con su cantidad.
    JOptionPane.showMessageDialog(null,"Aqui tiene su "+Articulo+", "+Cantidad+" Kg");
  }
    public Carnicero(String Nombre, String Puesto){
      this.Nombre = Nombre;
      this.Puesto = Puesto;
  }
}
class Fruteria extends Empleado{ //La clase Fruteria es heredada de la clase empleado para simular a la frutería de un supermercado.
  //Se declaran los atributos propios de la clase Fruteria 
  static String Articulo;
   static int Precio;
   static float Cantidad;
   static float Total;
   static String Eleccion;
    @Override //Se sobreescribe el método abstracto Presentación de la clase padre empleado con el contenido del método en la clase Fruteria
    public void Presentacion(){
    JOptionPane.showMessageDialog(null,"Esta es la sección de frutas y verduras del supermercado");    
    }
    //Se crea el método Estantes, que imprime una lista con los artículos disponibles en la frutería del supermercado.
    void Estantes(){ 
        Eleccion = JOptionPane.showInputDialog(null,"En esta sección hay estantes con diferentes productos: \n1. Manzana \n2. Naranja \n3. Platano \n4. Mango \n5.Guayaba \n6. Zanahoria \n7. Cebolla \n8. Apio \n9. Brócoli \n10. Lechuga \n0. Ir a otra sección");
    }
    public void Eleccion(){ //Se crea el método elección, que imprime en pantalla el artículo elegido junto con su cantidad.
        JOptionPane.showMessageDialog(null,"Has decidido elegir "+Cantidad+" Kg de "+Articulo);
    }
}
class Pescadero extends Empleado{
   static String Articulo;
   static int Precio;
   static float Cantidad;
   static float Total;
   static String Eleccion;
    @Override //Se sobreescribe el método abstracto Presentación de la clase padre empleado con el contenido del método en la clase Pescadero
    public void Presentacion(){
    JOptionPane.showMessageDialog(null,"Pescadería del supermercado");    
    }
  //Se crea el método Catalogo, que imprime una lista con los artículos disponibles en la pescadería del supermercado.
    void Catalogo(){
    Eleccion = JOptionPane.showInputDialog(null,"Hoy tenemos: \n1. Filete de Basa \n2. Camarón \n3. Filete de Salmón \n4. Filete de Pescado de Alaska \n5. Filete de Mojarra \n6. Barrita de Pescado \n7. Mojarra Entera \n8. Huachinango \n9. Pescado para Caldo \n10. Figuritas de Pescado Empanizado \n0. Ir a otra sección");
    }
    public void Proceso(){ //Se crea el método proceso, que imprime en pantalla el artículo elegido junto con su cantidad.
    JOptionPane.showMessageDialog(null,"Aquí tiene su "+Articulo+", "+Cantidad+" Kg");
    }
    public Pescadero(String Nombre, String Puesto){
      this.Nombre = Nombre;
      this.Puesto = Puesto;
  }
}
class Cajero extends Empleado{//La clase cajero es heredada de la clase empleado para simular a un cajero de supermercado.
 //Se declaran atributos propios de la clase cajero.
 static String Articulos = "";
 static float Total;
 @Override
   public void Presentacion(){
   JOptionPane.showMessageDialog(null,"Hola, soy "+Nombre+" y hoy voy a ser su "+Puesto);
   }
 static void Caja(){ /*Se crea el método caja, el cual es propio de la clase Cajero e imprime una lista de los artículos comprados
 junto con el precio total que se debe pagar.*/
JOptionPane.showMessageDialog(null,Cajero.Articulos);
JOptionPane.showMessageDialog(null,"Van a ser "+Total+" pesos.");
}
  public Cajero(String Nombre, String Puesto){
      this.Nombre = Nombre;
      this.Puesto = Puesto;
  }
}
class Articulo{//La clase Articulo es creada para simular los atributos de un producto en el supermercado.
  //Se declaran los atributos de la clase Articulo
  String Nombre;
  int Precio;
  float Cantidad;
  float Total;
  public Articulo(String Nombre, int Precio, int Cantidad){ //Se crea un constructor para los atributos de los objetos en la clase Artículo.
      this.Nombre = Nombre;
      this.Precio = Precio;
      this.Cantidad = Cantidad;
  }
}