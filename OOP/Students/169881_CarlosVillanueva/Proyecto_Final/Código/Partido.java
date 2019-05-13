package equipo.de.baloncesto;
import javax.swing.JOptionPane;
public class Partido {
    private static int Tiempo = 0;
    private static int Cuarto = 1;
    private static int Distancia = 0;
    private static int Puntuacion1 = 0;
    private static int Puntuacion2 = 0;
    private static String Jugadas = "";
    public static int getTiempo() {
        return Tiempo;
    }

    public static void setTiempo(int Tiempo) {
        Partido.Tiempo = Tiempo;
    }

    public static int getCuarto() {
        return Cuarto;
    }

    public static void setCuarto(int Cuarto) {
        Partido.Cuarto = Cuarto;
    }

    public static int getDistancia() {
        return Distancia;
    }

    public static void setDistancia(int Distancia) {
        Partido.Distancia = Distancia;
    }

    public static int getPuntuacion1() {
        return Puntuacion1;
    }

    public static void setPuntuacion1(int Puntuacion1) {
        Partido.Puntuacion1 = Puntuacion1;
    }

    public static int getPuntuacion2() {
        return Puntuacion2;
    }

    public static void setPuntuacion2(int Puntuacion2) {
        Partido.Puntuacion2 = Puntuacion2;
    }

    public static String getJugadas() {
        return Jugadas;
    }

    public static void setJugadas(String Jugadas) {
        Partido.Jugadas = Jugadas;
    }
    
    public static void Info(){
        JOptionPane.showMessageDialog(null,"Tiempo: " + Tiempo + " minuto(s)." + "\nCuarto: " + Cuarto + "." + "\nEl balón se encuentra a " + Distancia + " metros del punto medio." + "\nLa puntuación del equipo 1 es: " + Puntuacion1 + "." + "\nLa puntuación del equipo 2 es: " + Puntuacion2 + "."); 
    }
    public static void Resumen(){
        JOptionPane.showMessageDialog(null,Partido.Jugadas);
        Partido.Jugadas = "";
    }
}
