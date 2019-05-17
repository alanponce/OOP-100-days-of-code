package pfinal;
//clase declarada final para no tener mas sublases, es una subclase de jugadores
public final class Porteros extends Jugadores {

    private int minutosSGol;//declarao una variable de tipo int con modificador de acceso private, utilizada para almacenar los minutos sin recibir gol del portero
    private final int bono=50;//variable de tipo int, con modificador de acceso private, con keyword final para evitar modificaciones
   
    public Porteros(String nombre,String apellido,int edad,double Id,int anioscontrato,int ncamisa)//constructor de la clase
    {
        super(nombre,apellido,edad,Id,anioscontrato,ncamisa);
        this.minutosSGol=0;//inicializo el atributo minutos gol
    }
    //Funciones que simulan lo que el jugador realiza en un entrenamiento
    @Override
    public void entrenar()
    {
        System.out.println("Entrenando penales y atajadas");
    }
    
    //metodo utilizado para amuentar el atributo minutosgol mediante parametro recibido de tipo inr
    public void aumentarMSG(int minutos) 
    {
        this.minutosSGol+=minutos;
    }
    
    /**
     *
     * @param a
     */
    
    @Override//metodo sobreescrito de la clase jugaores utilizado para dar el valor del sueldo al jugador
    public void setSueldo(int a)
    {
        double incremento=this.minutosSGol*bono;//declaro una variable de tipo double para almacenar el valor de la operacion etre los atributos minutosgol y bono
        this.Sueldo=a+incremento;//le doy el valor de la variable anterios a sueldo
    }
    
    //Funciones que simulan lo que el jugador realiza en un partido
    /**
     *
     */
    @Override
    public void jugarPartido()
    {
        System.out.println("Jugando en la porteria");
    }

    
}
