package pfinal;

public abstract class Jugadores extends Equipo {

    protected final int numeroCamisa;

    public Jugadores(String nombre,String apellido,int edad,double Id,int anioscontrato,int ncamisa) 
    {
        super(nombre,apellido,edad,Id,anioscontrato);
        this.numeroCamisa=ncamisa;
    }
    
    
    public void obtenerInfo()
    {
        System.out.println("El nombre del jugador es: "+this.Nombre);
        System.out.println("El apellido del jugador es: "+this.Apellido);
        System.out.println("La edad del jugadro es: "+this.getEdad());
        System.out.println("El ID del jugador es: "+this.getD());
        System.out.println("Los años de contrato del jugador son: "+this.getAniosContrato());
        System.out.println("El numero de camisa del jugador son: "+this.numeroCamisa);
    }
}
