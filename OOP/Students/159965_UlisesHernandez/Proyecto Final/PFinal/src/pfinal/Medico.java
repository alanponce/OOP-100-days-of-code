package pfinal;

public class Medico extends Equipo {

    private final int cedulaPro;

    public Medico(String nombre,String apellido,int edad,double Id,int anioscontrato,int cedulaPro) 
    {
        super(nombre,apellido,edad,Id,anioscontrato);
        this.cedulaPro=cedulaPro;
    }

    

    @Override
    public void setSueldo(int a) {
        this.Sueldo=a;
    }
 
    @Override
    public void entrenar() {
        System.out.println("Atendiendo nesesidades medicas");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Esperando alguna lesion para entrar al terrenode juego");
    }

    
  
}
