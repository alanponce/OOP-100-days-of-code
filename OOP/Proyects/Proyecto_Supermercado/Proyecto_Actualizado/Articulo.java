package proyecto.supermercado;

public final class Articulo{//La clase Articulo es creada para simular los atributos de un producto en el supermercado.
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

    public int getPrecio() {
        return Precio;
    }

    public float getCantidad() {
        return Cantidad;
    }

    public void setCantidad(float Cantidad) {
        this.Cantidad = Cantidad;
    }

}