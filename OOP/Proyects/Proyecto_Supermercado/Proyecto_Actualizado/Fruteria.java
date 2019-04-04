package proyecto.supermercado;
import javax.swing.JOptionPane;

public class Fruteria extends Empleado{ //La clase Fruteria es heredada de la clase empleado para simular a la frutería de un supermercado.
  //Se declaran los atributos propios de la clase Fruteria 
   private String Articulo;
   private int Precio;
   private float Cantidad;
   private float PrecioTotal;
   private String Eleccion;
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