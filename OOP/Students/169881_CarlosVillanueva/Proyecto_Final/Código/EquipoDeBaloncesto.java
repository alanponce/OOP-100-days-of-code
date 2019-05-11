package equipo.de.baloncesto;
public class EquipoDeBaloncesto {
    public static void main(String[] args) {
    System.out.println(Partido.getTiempo());
    Partido.setTiempo(Partido.getTiempo() + 1);
    System.out.println(Partido.getTiempo());
    JugadorBase Base = new JugadorBase("Jorge",178,100,70,70);
    Base.Tirar();
    System.out.println(Base.getStats());
    Base.Pasar();
    System.out.println(Partido.getInfo());
    }
    
}
