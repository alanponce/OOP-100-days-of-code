package pfinal;

public class Delanteros extends Jugadores {

    private int goles;
    private final int bono;

    public Delanteros(String nombre,String apellido,int edad,double Id,int anioscontrato,int ncamisa) 
    {
        super(nombre,apellido,edad,Id,anioscontrato,ncamisa);
        this.goles=0;
        this.bono=15;
        
    }

    public void aumentarGoles(int gol) 
    {
        this.goles+=gol;
    }
    
    @Override
    public void setSueldo(int a) 
    {
        int incremento=this.bono*a;
        this.Sueldo=incremento;
    }

    @Override
    public void entrenar() 
    {
        System.out.println("Entrenando tiros a gol");
    }

    @Override
    public void jugarPartido() 
    {
        System.out.println("Jugando de delantero esperando centros");
    }

  
}
