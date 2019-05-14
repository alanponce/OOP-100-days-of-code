package pfinal;

public class Director extends Equipo {

    private final int idFifa;

    private int partidosGanados,incremento;

    private final int bono;
    
    
    
    public Director(String nombre,String apellido,int edad,double Id,int anioscontrato,int idfifa) 
    {
        super(nombre,apellido,edad,Id,anioscontrato);
        this.bono = 100;
        this.idFifa=idfifa;
        
    }

    public int getIDFifa() 
    {
        return this.idFifa;
    }

  
    protected void setPartidosGanados(int a)
    {
        this.partidosGanados=a;
    }
    
   
    @Override
    public void setSueldo(int a) 
    {
        incremento=this.bono*this.partidosGanados;
        Sueldo=a+incremento;
    }

    @Override
    public void entrenar() 
    {
        System.out.println("Entrenando al equipo");
    }

    @Override
    public void jugarPartido() 
    {
        System.out.println("Dirigiendo al equipo desde la banca");
    }

    public void obtenerInfo()
    {
        System.out.println("El nombre del DT es : "+this.Nombre);
        System.out.println("El apellido del DT es: "+this.Apellido);
        System.out.println("La edad del DT es: "+this.getEdad());
        System.out.println("El ID del DT es: "+this.getD());
        System.out.println("Los años de contrato del DT son: "+this.getAniosContrato());
        
    }
  
}
