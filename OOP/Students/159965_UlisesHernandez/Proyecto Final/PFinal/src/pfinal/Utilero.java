package pfinal;

public final class Utilero extends CuerpoTecnico {

    private final int matriculaC;
    private static final int bono=50;
    
    public Utilero(String nombre,String apellido,int edad,double Id,int anioscontrato,int matricula) {
        super(nombre,apellido,edad,Id,anioscontrato);
        this.matriculaC=matricula;
    }

 
    public int getMatricula()
    {
        return this.matriculaC;
    }
    
    @Override
    public void setSueldo(int a) {
        this.Sueldo=a*Utilero.bono;
    }

    @Override
    public void entrenar() {
        System.out.println("Realizar circuitos con los utiles del equipo");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Orden todo lo que el equipo utilizara");
    }

    @Override
    public void obtenerInfo() {
        System.out.println("El nombre del utilero es : "+this.Nombre);
        System.out.println("El apellido del utilero es: "+this.Apellido);
        System.out.println("La edad del utilero es: "+this.getEdad());
        System.out.println("El ID del utilero es: "+this.getD());
        System.out.println("Los años de contrato del utilero son: "+this.getAniosContrato());
        System.out.println("La matricula del utilero es "+this.getMatricula());
    }
}
