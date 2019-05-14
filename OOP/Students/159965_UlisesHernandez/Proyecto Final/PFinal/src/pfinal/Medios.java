package pfinal;

public class Medios extends Jugadores {

    private float pasesCompletos;
    private final int bono;
    
    public Medios(String nombre,String apellido,int edad,double Id,int anioscontrato,int ncamisa)
    {
        super(nombre,apellido,edad,Id,anioscontrato,ncamisa);
        this.pasesCompletos=0;
        this.bono=45;
    }

    private void aumentarPases(float pase) {
        this.pasesCompletos+=pase;
    }
    
    
    @Override
    public void setSueldo(int a) {
        float incremento=this.bono*this.pasesCompletos;
        this.Sueldo=incremento;
    }

    @Override
    public void entrenar() {
        System.out.println("Practicando pases");
    }
    

    @Override
    public void jugarPartido() {
        System.out.println("Jugando de medio, esperando pases y dando pases");
    }

  
}
