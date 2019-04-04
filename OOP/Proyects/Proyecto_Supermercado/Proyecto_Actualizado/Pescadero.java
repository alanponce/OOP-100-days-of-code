package proyecto.supermercado;
import javax.swing.JOptionPane;
public class Pescadero extends Empleado{
   private String Articulo;
   private int Precio;
   private float Cantidad;
   private float PrecioTotal;
   private String Eleccion;
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