package pfinal;

public class Defensas extends Jugadores {

    private int balonesParados;
    private final int bono=30;
    
    public Defensas(String nombre,String apellido,int edad,double Id,int anioscontrato,int ncamisa) 
    {
        super(nombre,apellido,edad,Id,anioscontrato,ncamisa);
        this.balonesParados=0;
    }

    private void aumentarBP(int a) {
        this.balonesParados+=a;
    }
    
    @Override
    public void setSueldo(int a) {
        int aumento=bono*this.balonesParados;
        this.Sueldo=aumento+a;
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenando barridas");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Jugando de defensa, esperando al enemigo");
    }

}
