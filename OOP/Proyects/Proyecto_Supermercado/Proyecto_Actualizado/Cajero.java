package proyecto.supermercado;
import javax.swing.JOptionPane;

class Cajero extends Empleado{//La clase cajero es heredada de la clase empleado para simular a un cajero de supermercado.
 //Se declaran atributos propios de la clase cajero.
 private static String Articulos = "";
 private static float PrecioTotal;
 @Override
   public void Presentacion(){
   JOptionPane.showMessageDialog(null,"Hola, soy "+Nombre+" y hoy voy a ser su "+Puesto);
   }
 static void Caja(){ /*Se crea el método caja, el cual es propio de la clase Cajero e imprime una lista de los artículos comprados
 junto con el precio total que se debe pagar.*/
JOptionPane.showMessageDialog(null,Cajero.Articulos);
JOptionPane.showMessageDialog(null,"Van a ser "+PrecioTotal+" pesos.");
}
  public Cajero(String Nombre, String Puesto){
      this.Nombre = Nombre;
      this.Puesto = Puesto;
  }
    public static String getArticulos() {
        return Articulos;
    }

    public static void setArticulos(String Articulos) {
        Cajero.Articulos = Articulos;
    }

    public static float getPrecioTotal() {
        return PrecioTotal;
    }

    public static void setPrecioTotal(float Total) {
        Cajero.PrecioTotal = Total;
    }
  
}