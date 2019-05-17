package pfinal;

//clase final defensas, clase hija de jugadores,declarada final para no tener mas clases hijas
public final class Defensas extends Jugadores {

    private int balonesParados;//variable private utilizada para aumentar el salario del jugador, se suma cada vez que un portero detenga un tiro
    private final int bono=30;//variable declara final par que no cambie, puesto que es un bono de dinero
    
    public Defensas(String nombre,String apellido,int edad,double Id,int anioscontrato,int ncamisa) //constructor de la clase
    {
        super(nombre,apellido,edad,Id,anioscontrato,ncamisa);//constructor que se hereda de la clase jugadores  
        this.balonesParados=0;//se inicializa el atributo
    }

    
    //funcion para aumentar los balones que el portero detenga, con parametro entero
    private void aumentarBP(int a) {
        this.balonesParados+=a;//operacion de suma para aumentar el valor del atributo con el parametro recibido
    }
    
    //funcion heredada de la clase jugadores
    @Override
    public void setSueldo(int a) {
        int aumento=bono*this.balonesParados;//declaramos una variable aumento la cual almacena el bono y lo multiplica por los balonesparados
        this.Sueldo=aumento+a;//le damos el valor de la operacion a sueldo, mas el parametro que se reciba en la funcion
    }

    //funcion que simula lo que el jugador hace en un enrenamiento
    @Override
    public void entrenar() {
        System.out.println("Entrenando barridas");
    }

    //funcion que simula lo que el jugador hace en un partido
    @Override
    public void jugarPartido() {
        System.out.println("Jugando de defensa, esperando al enemigo");
    }

}
