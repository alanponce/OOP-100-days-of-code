package proyecto.supermercado;
import javax.swing.JOptionPane;

class Fruteria extends Empleado{ //La clase Fruteria es heredada de la clase empleado para simular a la frutería de un supermercado.
  //Se declaran los atributos propios de la clase Fruteria 
   private static String Articulo;
   private static int Precio;
   private static float Cantidad;
   private static float PrecioTotal;
   private static String Eleccion;
    @Override //Se sobreescribe el método abstracto Presentación de la clase padre empleado con el contenido del método en la clase Fruteria
    public void Presentacion(){
    JOptionPane.showMessageDialog(null,"Esta es la sección de frutas y verduras del supermercado");    
    }
    //Se crea el método Estantes, que imprime una lista con los artículos disponibles en la frutería del supermercado.
    void Estantes(){ 
        Eleccion = JOptionPane.showInputDialog(null,"En esta sección hay estantes con diferentes productos: \n1. Manzana $35 \n2. Naranja $13 \n3. Platano $16 \n4. Mango $40 \n5.Guayaba $39 \n6. Zanahoria $16 \n7. Cebolla $30 \n8. Apio $26 \n9. Brócoli $39 \n10. Lechuga $18\n0. Ir a otra sección");
    }
    public void Decision(){ //Se crea el método elección, que imprime en pantalla el artículo elegido junto con su cantidad.
        JOptionPane.showMessageDialog(null,"Has decidido elegir "+Cantidad+" Kg de "+Articulo);
    }

    public static String getArticulo() {
        return Articulo;
    }

    public static void setArticulo(String Articulo) {
        Fruteria.Articulo = Articulo;
    }

    public static int getPrecio() {
        return Precio;
    }

    public static void setPrecio(int Precio) {
        Fruteria.Precio = Precio;
    }

    public static float getCantidad() {
        return Cantidad;
    }

    public static void setCantidad(float Cantidad) {
        Fruteria.Cantidad = Cantidad;
    }

    public static float getPrecioTotal() {
        return PrecioTotal;
    }

    public static void setPrecioTotal(float PrecioTotal) {
        Fruteria.PrecioTotal = PrecioTotal;
    }

    public static String getEleccion() {
        return Eleccion;
    }

    public static void setEleccion(String Eleccion) {
        Fruteria.Eleccion = Eleccion;
    }
    
}