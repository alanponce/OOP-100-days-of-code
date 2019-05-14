
package equipo.de.baloncesto;

import javax.swing.JOptionPane;

public abstract class Jugador {
    /*Se declaran los atributos privados de la clase Jugador, los cuales pueden ser heredados por las
    instancias de sus subclases.*/
    private String Nombre;
    private String Posicion;
    private int Estatura;
    private int NivelPase;
    private int NivelTiro;
    private int Jugada;
    private boolean Visitante;/*Este atributo se ha declarado boolean porque su función es indicar
    si una instancia de la clase forma parte del equipo visitante, o si forma parte del equipo local.*/
    private static int Objetivo;/*Los atributos Objetivo y Decision se han declarado estáticos porque
    sus valores son compartidos con todas las instanciaciones de la clase*/
    private static int Decision;
    /*Se declaran los métodos abstractos de la clase Jugador, los cuales serán sobreescritos en 
    sus subclases.*/
    public abstract void Pasar();
    public abstract void Tirar();
    public abstract void Avanzar();
    public abstract void Retroceder();
    public abstract void Jugar();
    
    public String getNombre() {//Se crea el getter para poder acceder al atributo.
        return Nombre;//Retorna el nombre de la instancia (Un jugador de baloncesto).
    }

    public final void setNombre(String Nombre) {/*Se crea el setter para poder modificar al atributo.
    El setter es final para evitar que se sobreescriba en las subclases.*/
        this.Nombre = Nombre;//El atributo va a tomar el valor de string que se declare en el setter.
    }

    public String getPosicion() {//Se crea el getter para poder acceder al atributo.
        return Posicion;//Retorna la posición en la que se juega.
    }

    public void setPosicion(String Posicion) {/*Se crea el setter para poder modificar al atributo.
    El setter es final para evitar que se sobreescriba en las subclases.*/
        this.Posicion = Posicion;//El atributo va a tomar el valor de string que se declare en el setter.
    }

    public int getEstatura() {//Se crea el getter para poder acceder al atributo.
        return Estatura;//Retorna el valor de la estatura que posee el jugador.
    }

    public final void setEstatura(int Estatura) {/*Se crea el setter para poder modificar al atributo.
    El setter es final para evitar que se sobreescriba en las subclases.*/
        this.Estatura = Estatura;//El atributo va a tomar el valor entero que se declare en el setter.
    }

    public int getNivelPase() {//Se crea el getter para poder acceder al atributo.
        return NivelPase;//Retorna la destreza que posee el jugador al realizar pases.
    }

    public final void setNivelPase(int NivelPase) {/*Se crea el setter para poder modificar al atributo.
    El setter es final para evitar que se sobreescriba en las subclases.*/
        this.NivelPase = NivelPase;//El atributo va a tomar el valor entero que se declare en el setter.
    }

    public int getNivelTiro() {//Se crea el getter para poder acceder al atributo.
        return NivelTiro;//Retorna la destreza que posee el jugador al realizar tiros a canasta.
    }

    public final void setNivelTiro(int NivelTiro) {/*Se crea el setter para poder modificar al atributo.
    El setter es final para evitar que se sobreescriba en las subclases.*/
        this.NivelTiro = NivelTiro;//El atributo va a tomar el valor entero que se declare en el setter.
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

    public static int getDecision() {//Se crea el getter para poder acceder al atributo.
        return Decision;/*Retorna un número entero que representa la acción que va
        a realizar el jugador*/
    }

    public static void setDecision(int Decision) {//Se crea el setter para poder modificar al atributo.
        Jugador.Decision = Decision;//El atributo va a tomar el valor entero que se declare en el setter.
    }

    public boolean isVisitante() {/*Este método funciona como getter, pero como es de tipo boolean sólo 
    puede retornar true o false, por lo que en lugar de get, una notación más entendible seria la de is*/
        return Visitante;//Retorna el valor que afirma o niega que el jugador sea del equipo visitante.
    }

    public final void setVisitante(boolean Visitante) {/*Se crea el setter para poder modificar al atributo.
    El setter es final para evitar que se sobreescriba en las subclases.*/
        this.Visitante = Visitante;//El atributo va a tomar el valor booleano que se declare en el setter.
    }

    public void Stats(){/*Este método imprime en pantalla el valor de los atributos que posee el jugador.*/
        JOptionPane.showMessageDialog(null,"Nombre: " + Nombre + "\nPosición: " + Posicion + "\nEstatura: " + Estatura + " cm" + "\nPrecisión en pases: " + NivelPase + "\nPrecisión en tiros: " + NivelTiro);
    }
}
