package proyecto.supermercado;
import javax.swing.JOptionPane;
public abstract class Empleado{//La clase empleado se implementa para simular atributos y comportamientos de un empleado de supermercado.
  //Se declaran los atributos de la clase Empleado, que pueden ser heredadas por otras clases.
  protected String Nombre;
  protected String Puesto;
  //Se crea el método abstracto Presentación, que puede ser heredado por otras clases.
  public abstract void Presentacion();
      
}
class Carnicero extends Empleado{//La clase carnicero es heredada de la clase empleado para simular a un carnicero de supermercado.
   //Se declaran los atributos propios de la clase carnicero.
   private static String Articulo;
   private static int Precio;
   private static float Cantidad;
   private static float Total;
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

    public static float getTotal() {
        return Total;
    }

    public static void setTotal(float Total) {
        Carnicero.Total = Total;
    }

    public static String getEleccion() {
        return Eleccion;
    }

    public static void setEleccion(String Eleccion) {
        Carnicero.Eleccion = Eleccion;
    }
    
}
class Fruteria extends Empleado{ //La clase Fruteria es heredada de la clase empleado para simular a la frutería de un supermercado.
  //Se declaran los atributos propios de la clase Fruteria 
   private static String Articulo;
   private static int Precio;
   private static float Cantidad;
   private static float Total;
   private static String Eleccion;
    @Override //Se sobreescribe el método abstracto Presentación de la clase padre empleado con el contenido del método en la clase Fruteria
    public void Presentacion(){
    JOptionPane.showMessageDialog(null,"Esta es la sección de frutas y verduras del supermercado");    
    }
    //Se crea el método Estantes, que imprime una lista con los artículos disponibles en la frutería del supermercado.
    void Estantes(){ 
        Eleccion = JOptionPane.showInputDialog(null,"En esta sección hay estantes con diferentes productos: \n1. Manzana $35 \n2. Naranja $13 \n3. Platano $16 \n4. Mango $40 \n5.Guayaba $39 \n6. Zanahoria $16 \n7. Cebolla $30 \n8. Apio $26 \n9. Brócoli $39 \n10. Lechuga $18\n0. Ir a otra sección");
    }
    public void Eleccion(){ //Se crea el método elección, que imprime en pantalla el artículo elegido junto con su cantidad.
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

    public static float getTotal() {
        return Total;
    }

    public static void setTotal(float Total) {
        Fruteria.Total = Total;
    }

    public static String getEleccion() {
        return Eleccion;
    }

    public static void setEleccion(String Eleccion) {
        Fruteria.Eleccion = Eleccion;
    }
    
}
class Pescadero extends Empleado{
   private static String Articulo;
   private static int Precio;
   private static float Cantidad;
   private static float Total;
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

    public static float getTotal() {
        return Total;
    }

    public static void setTotal(float Total) {
        Pescadero.Total = Total;
    }

    public static String getEleccion() {
        return Eleccion;
    }

    public static void setEleccion(String Eleccion) {
        Pescadero.Eleccion = Eleccion;
    }
    
}
class Cajero extends Empleado{//La clase cajero es heredada de la clase empleado para simular a un cajero de supermercado.
 //Se declaran atributos propios de la clase cajero.
 private static String Articulos = "";
 private static float Total;
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
    public static String getArticulos() {
        return Articulos;
    }

    public static void setArticulos(String Articulos) {
        Cajero.Articulos = Articulos;
    }

    public static float getTotal() {
        return Total;
    }

    public static void setTotal(float Total) {
        Cajero.Total = Total;
    }
  
}
class Articulo{//La clase Articulo es creada para simular los atributos de un producto en el supermercado.
  //Se declaran los atributos d     e la clase Articulo
  private String Nombre;
  private int Precio;
  private float Cantidad;
  public Articulo(String Nombre, int Precio, int Cantidad){
      this.Nombre = Nombre;
      this.Precio = Precio;
      this.Cantidad = Cantidad;
  }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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

}