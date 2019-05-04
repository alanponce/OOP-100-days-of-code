package usodelclaseabstracta;

// Circulo es un "Tipo de Figura"
public class Circulo extends Figurageometrica{
    private double radio;
    
    
    public Circulo(String nombre, double radio){
     super(nombre);// cons, clase superior
     this.radio=radio;
    }
    @Override 
    public double CalcularArea(){
    // PI * R *R 
    super.area=Math.PI*(radio*radio);
    return super.area;  
    }
    @Override
    public double CalcularPerimetro(){
        // 2 * PI *R 
        super.perimetro=2*Math.PI*radio;
        return super.perimetro;
    }
}
