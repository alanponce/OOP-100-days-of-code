package pfinal;

//clase declarada final para que no tenga mas clases hijas, es una subclase de Cuerpotecnico
public final class Medico extends CuerpoTecnico {

    private final int cedulaPro;//variable de tipo int, con modificador de acceso private keyword final, utilizada para guardar la cedula profesional del doctor

    public Medico(String nombre,String apellido,int edad,double Id,int anioscontrato,int cedulaPro) //constructor de la clase
    {
        super(nombre,apellido,edad,Id,anioscontrato);
        this.cedulaPro=cedulaPro;
    }

    public int getCedulaProfesional()//metodo utilizado para obtener el valor de lacedula del doctor, retorna un entero
    {
        return this.cedulaPro;
    }
    
    @Override//metodo sobreescrito de la clase cuerpotecnico, la cual recibe un parametro entero
    public void setSueldo(int a) {
        this.Sueldo=a;//asignamos el valor del parametro recibido a sueldo
    }
 
    @Override//metodo utilizado para simular el comportamiento del medico en un entrenamiento
    public void entrenar() {
        System.out.println("Atendiendo nesesidades medicas");
    }

    @Override//metodo utilizado para simular el comportamiento del medico en un partido
    public void jugarPartido() {
        System.out.println("Esperando alguna lesion para entrar al terreno de juego");
    }

    @Override//metodo utilizado para obtener la informacion del medico meiante los gets
     public void obtenerInfo()
    {
        System.out.println("El nombre del Medico es : "+this.Nombre);
        System.out.println("El apellido del Medico es: "+this.Apellido);
        System.out.println("La edad del Medico es: "+this.getEdad());
        System.out.println("El ID del Medico es: "+this.getD());
        System.out.println("Los años de contrato del Medico son: "+this.getAniosContrato());
        System.out.println("La cedula profesional del medico es: "+this.cedulaPro);
        
    }
  
}
