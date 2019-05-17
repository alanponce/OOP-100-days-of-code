package equipo.de.baloncesto;
import javax.swing.JOptionPane;

public abstract class Jugador {/*La clase Jugador contiene atributos propios de un jugador de baloncesto,
    como la posición en la que juegan o su precisión en tiros y pases.*/
    /*Se declaran los atributos privados de la clase Jugador, los cuales pueden ser heredados por las
    instancias de sus subclases.*/
    private final String Nombre;//El atributo es final y no cuenta con setter para que no se pueda modificar una vez inicializado.
    private final String Posicion;//El atributo es final y no cuenta con setter para que no se pueda modificar una vez inicializado.
    private final int Estatura;//El atributo es final y no cuenta con setter para que no se pueda modificar una vez inicializado.
    private final int NivelPase;//El atributo es final y no cuenta con setter para que no se pueda modificar una vez inicializado.
    private final int NivelTiro;//El atributo es final y no cuenta con setter para que no se pueda modificar una vez inicializado.
    private int Jugada;
    private final boolean Visitante;/*Este atributo se ha declarado boolean porque su función es indicar
    si una instancia de la clase forma parte del equipo visitante, o si forma parte del equipo local.
    Además, es declarado final para que no se pueda modificar una vez inicializado.*/
    private static int Objetivo;/*Los atributos Objetivo y Decision se han declarado estáticos porque
    sus valores son compartidos con todas las instanciaciones de la clase*/
    private static int DecisionDeJuego;
    public String getNombre() {//Se crea el getter para poder acceder al atributo.
        return Nombre;//Retorna el nombre de la instancia (Un jugador de baloncesto).
    }

    public String getPosicion() {//Se crea el getter para poder acceder al atributo.
        return Posicion;//Retorna la posición en la que se juega.
    }

    public int getEstatura() {//Se crea el getter para poder acceder al atributo.
        return Estatura;//Retorna el valor de la estatura que posee el jugador.
    }

    public int getNivelPase() {//Se crea el getter para poder acceder al atributo.
        return NivelPase;//Retorna la destreza que posee el jugador al realizar pases.
    }

    public int getNivelTiro() {//Se crea el getter para poder acceder al atributo.
        return NivelTiro;//Retorna la destreza que posee el jugador al realizar tiros a canasta.
    }

    public static int getObjetivo() {//Se crea el getter para poder acceder al atributo.
        return Objetivo;/*Retorna un número entero que representa el objetivo
        en el que se enfoca el jugador al realizar su pase o tiro.*/
    }

    public void setObjetivo(int Objetivo) {//Se crea el setter para poder modificar al atributo.
        Jugador.Objetivo = Objetivo;//El atributo va a tomar el valor entero que se declare en el setter.
    }

    public int getJugada() {//Se crea el getter para poder acceder al atributo.
        return Jugada;/*Retorna un número entero que representa la efectividad 
        de una jugada que va realizarse.*/
    }

    public void setJugada(int Jugada) {//Se crea el setter para poder modificar al atributo.
        this.Jugada = Jugada;//El atributo va a tomar el valor entero que se declare en el setter.
    }

    public static int getDecisionDeJuego() {//Se crea el getter para poder acceder al atributo.
        return DecisionDeJuego;/*Retorna un número entero que representa la acción que va
        a realizar el jugador*/
    }

    public static void setDecisionDeJuego(int DecisionDeJuego) {//Se crea el setter para poder modificar al atributo.
        Jugador.DecisionDeJuego = DecisionDeJuego;//El atributo va a tomar el valor entero que se declare en el setter.
    }

    public boolean isVisitante() {/*Este método funciona como getter, pero como es de tipo boolean sólo 
    puede retornar true o false, por lo que en lugar de get, una notación más entendible seria la de is*/
        return Visitante;//Retorna el valor que afirma o niega que el jugador sea del equipo visitante.
    }

    public void Stats(){/*Este método imprime en pantalla el valor de los atributos que posee el jugador.*/
        if(this.isVisitante()){
        JOptionPane.showMessageDialog(null,"Nombre: " + Nombre + "\nEquipo: Visitante" + "\nPosición: " + Posicion + "\nEstatura: " + Estatura + " cm" + "\nPrecisión en pases: " + NivelPase + "\nPrecisión en tiros: " + NivelTiro);    
        }
        else{
        JOptionPane.showMessageDialog(null,"Nombre: " + Nombre + "\nEquipo: Local" + "\nPosición: " + Posicion + "\nEstatura: " + Estatura + " cm" + "\nPrecisión en pases: " + NivelPase + "\nPrecisión en tiros: " + NivelTiro);
        }
    }
    public Jugador(String Nombre, String Posicion, boolean Visitante, int Estatura, int NivelPase, int NivelTiro){
        //Se crea un constructor para inicializar los atributos de la clase.
        this.Nombre = Nombre;
        this.Posicion = Posicion;
        this.Visitante = Visitante;
        this.Estatura = Estatura;
        this.NivelPase = NivelPase;
        this.NivelTiro = NivelTiro;
    }
}
