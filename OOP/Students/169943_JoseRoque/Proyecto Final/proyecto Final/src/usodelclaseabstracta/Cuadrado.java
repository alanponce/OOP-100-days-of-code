package usodelclaseabstracta;

public class Cuadrado extends Figurageometrica{
    private double lado;

    public Cuadrado(double lado, String nombre) {
        super(nombre);
        this.lado = lado;
    }
    @Override
    public double CalcularArea() {
        super.area=lado*lado;
        return super.area;
    }

    @Override
    public double CalcularPerimetro() {
    super.perimetro=4*lado;
    return super.perimetro;
    }
    
}
