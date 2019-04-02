package proyecto.supermercado;
import javax.swing.JOptionPane;

class Carnicero extends Empleado{//La clase carnicero es heredada de la clase empleado para simular a un carnicero de supermercado.
   //Se declaran los atributos propios de la clase carnicero.
   private static String Articulo;
   private static int Precio;
   private static float Cantidad;
   private static float PrecioTotal;
   private static String Eleccion;
   @Override //Se sobreescribe el método abstracto Presentación de la clase padre empleado con el contenido del método en la clase Carnicero
   public void Presentacion(){
   JOptionPane.showMessageDialog(null,"Carniceria del Supermercado");
   JOptionPane.showMessageDialog(null,"Hola, soy "+Nombre+" y hoy voy a ser su "+Puesto);
   }
   //Se crea el método Catalogo, que imprime una lista con los artículos disponibles en la carnicería del supermercado.
   void Catalogo(){
    Eleccion = JOptionPane.showInputDialog(null,"El día de hoy contamos con: \n1. Chuleta de Cerdo $92 \n2. Carne Molida $118 \n3. Lengua $260 \n4. Salchicha $98 \n5. Chorizo $60 \n6. Chicharrón de Cerdo $176 \n7. Milanesa de Cerdo $94\n8. Costilla de Cerdo $110\n9. Sirloin de Ternera $229\n10. Pata de Res $54\n0. Ir a otra sección \nEscoge un número:");
   }
   public void Proceso(){ //Se crea el método proceso, que imprime en pantalla el artículo elegido junto con su cantidad.
    JOptionPane.showMessageDialog(null,"Aqui tiene su "+Articulo+", "+Cantidad+" Kg");
  }
    public Carnicero(String Nombre, String Puesto){
      this.Nombre = Nombre;
      this.Puesto = Puesto;
  }

    public static String getArticulo() {
        return Articulo;
    }

    public static void setArticulo(String Articulo) {
        Carnicero.Articulo = Articulo;
    }

    public static int getPrecio() {
        return Precio;
    }

    public static void setPrecio(int Precio) {
        Carnicero.Precio = Precio;
    }

    public static float getCantidad() {
        return Cantidad;
    }

    public static void setCantidad(float Cantidad) {
        Carnicero.Cantidad = Cantidad;
    }

    public static float getPrecioTotal() {
        return PrecioTotal;
    }

    public static void setPrecioTotal(float PrecioTotal) {
        Carnicero.PrecioTotal = PrecioTotal;
    }

    public static String getEleccion() {
        return Eleccion;
    }

    public static void setEleccion(String Eleccion) {
        Carnicero.Eleccion = Eleccion;
    }
    
}