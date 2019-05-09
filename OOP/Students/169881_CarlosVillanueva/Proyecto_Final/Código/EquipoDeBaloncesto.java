package equipo.de.baloncesto;
public class EquipoDeBaloncesto {
    public static void main(String[] args) {
    System.out.println(Partido.Tiempo);
    Partido.Tiempo = Partido.Tiempo + 1;
    System.out.println(Partido.Tiempo);
    JugadorBase Base = new JugadorBase("Jorge","Base",178,100,70,70);
    Base.Tirar();
    System.out.println(Partido.Puntuacion1);
    System.out.println(Base.getStats());
    }
    
}
