package pfinal;

public abstract class Jugadores extends Equipo {//clase astracta que es una clase hija de la clase equipo

    protected final int numeroCamisa;//atributo de tipo int con modificador de acceso protected y keyword final, utilizado para guardar el dorsal del jugador

    public Jugadores(String nombre,String apellido,int edad,double Id,int anioscontrato,int ncamisa) //constructor de la clase
    {
        super(nombre,apellido,edad,Id,anioscontrato);
        this.numeroCamisa=ncamisa;//Le damos el valor del parametro ncamisa al atributo numerocamisa
    }
    
    //metodo utilizado para obtener la informacion de los jugadores mediante los gets 
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
