package usodelclaseabstracta;

public abstract class Figurageometrica {
    private String nombre;
    public double area;
    public double perimetro;
    
   public Figurageometrica(String nombre){
       this.nombre=nombre;
}
   
   public abstract double CalcularArea();
   public abstract double CalcularPerimetro();

    public String getNombre() {
        return nombre;
    }
   
}
