package proyecto;
import usodelclaseabstracta.*;
public class proyecto {
    
    public static void main(String[] args){
    Circulo c = new Circulo("Circulo",14.89);
    
    System.out.println("El area del el "+c.getNombre()+"es:"+c.CalcularArea());
    
    Cuadrado cua = new Cuadrado(10,"Cuadrado");
    System.out.println("El area del el "+cua.getNombre()+"es:"+cua.CalcularArea());
    
    
}
}