package pfinal;

//clase declarada final para que no herede a otras subclases,es subclase de la clase jugadores
public final class Delanteros extends Jugadores {

    private int goles;//variable private para evitar que sea modificada de tipo int, para contar los goles que el jugador tenga y aumentar su salario
    private final int bono;//varaible declarada private para evitar modificaciones por otras clases, y declarada final para evitar que su valor cambie. De tipo int llamada bono la cual se usara para dar el monto del bono del jugador

    public Delanteros(String nombre,String apellido,int edad,double Id,int anioscontrato,int ncamisa) //constructor de la clase
    {
        super(nombre,apellido,edad,Id,anioscontrato,ncamisa);
        this.goles=0;//inicializamos la variable goles
        this.bono=15;//le asignamos el valor al bono del jugador
        
    }

    //funcion para aumentar los goles que el delantero aga para asi hacer una operacion despues
    public void aumentarGoles(int gol) 
    {
        this.goles+=gol;//hacemos una operacion para sumar el valor que tiene actualmente la variable goles con el parametro que se recibe
    }
    
    
    //funcion hecha para dar sueldo a un delantero, con parametro entero
    @Override
    public void setSueldo(int a) 
    {
        int incremento=this.bono+(this.goles*a);//declaramos una variable de tipo int llamada incremento para darle el valor del bono multiplicado por los goles del jugador y sumado al salario del mismo
        this.Sueldo=incremento;//asignamos el valr de sueldo a salario
    }

    //Funciones que simulan lo que el jugador realiza en un entrenamiento y en un partido
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
