package equipo.de.baloncesto;
import javax.swing.JOptionPane;
public class Partido {
    /*Se declaran los atributos privados de la clase Partido, los cuales son estáticos para poder acceder a ellas
    sin necesidad de instanciar un objeto de esta clase.*/
    private static int Tiempo = 0;
    private static int Cuarto = 1;
    private static int Distancia = 0;
    private static int Puntuacion1 = 0;
    private static int Puntuacion2 = 0;
    private static String Jugadas = "";
    private static int Inicio;
    
    public static int getTiempo() {//Se crea el getter para poder acceder al atributo.
        return Tiempo;//Va a retornar el tiempo actual en el que se encuentra el partido.
    }

    public static void setTiempo(int Tiempo) {//Se crea el setter para poder modificar al atributo.
        Partido.Tiempo = Tiempo;/*El atributo Tiempo de la clase Partido va a tomar el valor que 
        se declare en el setter*/
    }

    public static int getCuarto() {//Se crea el getter para poder acceder al atributo.
        return Cuarto;/*Retorna el valor del cuarto en el que se encuentra el partido.
        El partido se compone de cuatro cuartos de 10 minutos cada uno.*/
    }

    public static void setCuarto(int Cuarto) {//Se crea el setter para poder modificar al atributo.
        Partido.Cuarto = Cuarto;/*El atributo Cuarto de la clase Partido va a tomar el valor que 
        se declare en el setter*/
    }

    public static int getDistancia() {//Se crea el getter para poder acceder al atributo.
        return Distancia;/*Retorna el valor de la posición actual del balón con respecto al punto medio,
        desde la perspectiva del equipo local (Distancia negativa es dentro del lado del equipo local, 
        distancia positiva es dentro del lado del equipo visitante)*/
    }

    public static void setDistancia(int Distancia) {//Se crea el setter para poder modificar al atributo.
        Partido.Distancia = Distancia;/*El atributo Distancia de la clase Partido va a tomar el valor que 
        se declare en el setter*/
    }

    public static int getPuntuacion1() {//Se crea el getter para poder acceder al atributo.
        return Puntuacion1;//Retorna el valor del puntaje actual del equipo local.
    }

    public static void setPuntuacion1(int Puntuacion1) {//Se crea el setter para poder modificar al atributo.
        Partido.Puntuacion1 = Puntuacion1;/*El atributo Puntuacion1 de la clase Partido va a tomar el valor que 
        se declare en el setter*/
    }

    public static int getPuntuacion2() {//Se crea el getter para poder acceder al atributo.
        return Puntuacion2;//Retorna el valor del puntaje actual del equipo visitante.
    }

    public static void setPuntuacion2(int Puntuacion2) {//Se crea el setter para poder modificar al atributo.
        Partido.Puntuacion2 = Puntuacion2;/*El atributo Puntuacion2 de la clase Partido va a tomar el valor que 
        se declare en el setter*/
    }

    public static String getJugadas() {//Se crea el getter para poder acceder al atributo.
        return Jugadas;//Retorna el texto almacenado dentro del atributo Jugadas de la clase Partido.
    }

    public static void setJugadas(String Jugadas) {//Se crea el setter para poder modificar al atributo.
        Partido.Jugadas = Jugadas;/*El atributo Jugadas de la clase Partido va a tomar el valor que 
        se declare en el setter*/
    }
    public static void Info(){/*Se crea el método info, el cual imprime en pantalla varios atributos
        de la clase Partido. Estos atributos indican el estado actual del partido.*/
        JOptionPane.showMessageDialog(null,"Tiempo: " + Tiempo + " minuto(s)." + "\nCuarto: " + Cuarto + "." + "\nEl balón fue lanzado desde " + Distancia + " metros del punto medio." + "\nLa puntuación del equipo 1 es: " + Puntuacion1 + "." + "\nLa puntuación del equipo 2 es: " + Puntuacion2 + "."); 
    }

    public static int getInicio() {//Se crea el getter para poder acceder al atributo.
        return Inicio;//Retorna el valor del atributo Inicio de la clase Partido.
    }

    public static void setInicio(int Inicio) {//Se crea el setter para poder modificar al atributo.
        Partido.Inicio = Inicio;/*El atributo Inicio de la clase Partido va a tomar el valor que 
        se declare en el setter*/
    }
    
    public static void Resumen(){/*Se crea el método resúmen, el cual imprime en pantalla el texto
        que tenga almacenado en el atributo Jugadas de la clase Partido. Después, borra el contenido
        almacenado del atributo para poder indicar un nuevo conjunto de jugadas.*/
        JOptionPane.showMessageDialog(null,Partido.Jugadas);
        Partido.Jugadas = "";
    }
}
