package proyecto.supermercado;
import javax.swing.JOptionPane;

class Pescadero extends Empleado{
   private static String Articulo;
   private static int Precio;
   private static float Cantidad;
   private static float PrecioTotal;
   private static String Eleccion;
    @Override //Se sobreescribe el método abstracto Presentación de la clase padre empleado con el contenido del método en la clase Pescadero
    public void Presentacion(){
    JOptionPane.showMessageDialog(null,"Pescadería del supermercado");    
    }
  //Se crea el método Catalogo, que imprime una lista con los artículos disponibles en la pescadería del supermercado.
    void Catalogo(){
    Eleccion = JOptionPane.showInputDialog(null,"Hoy tenemos: \n1. Filete de Basa $100 \n2. Camarón $275 \n3. Filete de Salmón $375 \n4. Filete de Pescado de Alaska $90 \n5. Filete de Mojarra $105 \n6. Barrita de Pescado $79 \n7. Mojarra Entera $64 \n8. Huachinango $269 \n9. Pescado para Caldo $85 \n10. Figuritas de Pescado Empanizado $79 \n0. Ir a otra sección");
    }
    public void Proceso(){ //Se crea el método proceso, que imprime en pantalla el artículo elegido junto con su cantidad.
    JOptionPane.showMessageDialog(null,"Aquí tiene su "+Articulo+", "+Cantidad+" Kg");
    }
    public Pescadero(String Nombre, String Puesto){
      this.Nombre = Nombre;
      this.Puesto = Puesto;
  }

    public static String getArticulo() {
        return Articulo;
    }

    public static void setArticulo(String Articulo) {
        Pescadero.Articulo = Articulo;
    }

    public static int getPrecio() {
        return Precio;
    }

    public static void setPrecio(int Precio) {
        Pescadero.Precio = Precio;
    }

    public static float getCantidad() {
        return Cantidad;
    }

    public static void setCantidad(float Cantidad) {
        Pescadero.Cantidad = Cantidad;
    }

    public static float getPrecioTotal() {
        return PrecioTotal;
    }

    public static void setPrecioTotal(float PrecioTotal) {
        Pescadero.PrecioTotal = PrecioTotal;
    }

    public static String getEleccion() {
        return Eleccion;
    }

    public static void setEleccion(String Eleccion) {
        Pescadero.Eleccion = Eleccion;
    }
    
}