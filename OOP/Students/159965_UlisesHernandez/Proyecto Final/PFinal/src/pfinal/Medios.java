package pfinal;

//clase declarada final para no tener mas sublases, es una subclase de jugadores
public final class Medios extends Jugadores {

    private float pasesCompletos;//declarao una variable de tipo float con modificador de acceso private, utilizada para lmacenar los pases que deel medio
    private final int bono;//variable de tipo int, con modificador de acceso private, con keyword final para evitar modificaciones
    
    public Medios(String nombre,String apellido,int edad,double Id,int anioscontrato,int ncamisa)//constructor de la clase
    {
        super(nombre,apellido,edad,Id,anioscontrato,ncamisa);
        this.pasesCompletos=0;//Inicializo el atributo 
        this.bono=45;//le asigno valor al atributo bono
    }

    //metodo utilizado para aumentar los pases, mediante un parametro de tipo float
    private void aumentarPases(float pase) {
        this.pasesCompletos+=pase;
    }
    
    //metodo sobreescrito de la clase jugaores utilizado para dar el sueldo del jugador
    @Override
    public void setSueldo(int a) {
        float incremento=this.bono*this.pasesCompletos;//declaro una variable de tipo flaot para almacenar una operacion entre los atributos bono y pasescompletos
        this.Sueldo=incremento;//le asigno a sueldo el valor de la vriable atributo
    }

    @Override//metodo que simula lo que hace el medio en un entrenamiento, metodo sobreescrito de la clase jugadores
    public void entrenar() {
        System.out.println("Practicando pases");
    }
    

    @Override//metodo que simula lo que hace el medio en un partido, metodo sobreescrito de la clase jugadores
    public void jugarPartido() {
        System.out.println("Jugando de medio, esperando pases y dando pases");
    }

  
}
