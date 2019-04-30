package proyecto.supermercado;
import javax.swing.JOptionPane;

public class Carnicero extends Empleado{//La clase carnicero es heredada de la clase empleado para simular a un carnicero de supermercado.
   //Se declaran los atributos propios de la clase carnicero.
   private String Articulo;
   private int Precio;
   private float Cantidad;
   private float PrecioTotal;
   private String Eleccion;
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
    public Carnicero(final String Nombre, final String Puesto){
      this.Nombre = Nombre;
      this.Puesto = Puesto;
  }

    public String getArticulo() {
        return Articulo;
    }

    public void setArticulo(String Articulo) {
        this.Articulo = Articulo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public float getCantidad() {
        return Cantidad;
    }

    public void setCantidad(float Cantidad) {
        this.Cantidad = Cantidad;
    }

    public float getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(float PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }

    public String getEleccion() {
        return Eleccion;
    }

    public void setEleccion(String Eleccion) {
        this.Eleccion = Eleccion;
    }
    
}