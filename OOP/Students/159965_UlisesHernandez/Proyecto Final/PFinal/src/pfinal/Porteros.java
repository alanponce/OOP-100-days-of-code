package pfinal;

public class Porteros extends Jugadores {

    private int minutosSGol;
    private final int bono=50;
   
    public Porteros(String nombre,String apellido,int edad,double Id,int anioscontrato,int ncamisa)
    {
        super(nombre,apellido,edad,Id,anioscontrato,ncamisa);
        this.minutosSGol=0;
    }
    
    @Override
    public void entrenar()
    {
        System.out.println("Entrenando penales y atajadas");
    }
    
    public void aumentarMSG(int minutos) 
    {
        this.minutosSGol+=minutos;
    }
    
    /**
     *
     * @param a
     */
    
    @Override
    public void setSueldo(int a)
    {
        double incremento=this.minutosSGol*bono;
        this.Sueldo=a+incremento;
    }
    
    /**
     *
     */
    @Override
    public void jugarPartido()
    {
        System.out.println("Jugando en la porteria");
    }

    
}
