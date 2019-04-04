package proyecto.supermercado;
import javax.swing.JOptionPane;

public class Cajero extends Empleado{//La clase cajero es heredada de la clase empleado para simular a un cajero de supermercado.
 //Se declaran atributos propios de la clase cajero.
 private String Articulos = "";
 private float PrecioTotal;
 @Override
   public void Presentacion(){
   JOptionPane.showMessageDialog(null,"Hola, soy "+Nombre+" y hoy voy a ser su "+Puesto);
   }
 void Caja(){ /*Se crea el método caja, el cual es propio de la clase Cajero e imprime una lista de los artículos comprados
 junto con el precio total que se debe pagar.*/
JOptionPane.showMessageDialog(null,Articulos);
JOptionPane.showMessageDialog(null,"Van a ser "+PrecioTotal+" pesos.");
}
  public Cajero(String Nombre, String Puesto, String Articulos, float PrecioTotal){
      this.Nombre = Nombre;
      this.Puesto = Puesto;
      this.Articulos = Articulos;
      this.PrecioTotal = PrecioTotal;
  }
    public String getArticulos() {
        return Articulos;
    }

    public void setArticulos(String Articulos) {
        this.Articulos = Articulos;
    }

    public float getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(float Total) {
        this.PrecioTotal = Total;
    }
  
}