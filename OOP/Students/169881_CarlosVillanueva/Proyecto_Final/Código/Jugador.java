
package equipo.de.baloncesto;

import javax.swing.JOptionPane;

public abstract class Jugador {
    private String Nombre;
    private String Posicion;
    private int Estatura;
    private int NivelPase;
    private int NivelTiro;
    private static int Objetivo;
    private static int Decision;
    private int Jugada;
    public abstract void Pasar();
    public abstract void Tirar();
    public abstract void Avanzar();
    public abstract void Retroceder();
    public abstract void Jugar();
    
    public String getNombre() {
        return Nombre;
    }

    public final void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPosicion() {
        return Posicion;
    }

    public final void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public int getEstatura() {
        return Estatura;
    }

    public final void setEstatura(int Estatura) {
        this.Estatura = Estatura;
    }

    public int getNivelPase() {
        return NivelPase;
    }

    public final void setNivelPase(int NivelPase) {
        this.NivelPase = NivelPase;
    }

    public int getNivelTiro() {
        return NivelTiro;
    }

    public final void setNivelTiro(int NivelTiro) {
        this.NivelTiro = NivelTiro;
    }

    public static int getObjetivo() {
        return Objetivo;
    }

    public void setObjetivo(int Objetivo) {
        Jugador.Objetivo = Objetivo;
    }

    public int getJugada() {
        return Jugada;
    }

    public void setJugada(int Jugada) {
        this.Jugada = Jugada;
    }

    public static int getDecision() {
        return Decision;
    }

    public static void setDecision(int Decision) {
        Jugador.Decision = Decision;
    }
    public void Stats(){
        JOptionPane.showMessageDialog(null,"Nombre: " + Nombre + "\nPosición: " + Posicion + "\nEstatura: " + Estatura + " cm" + "\nPrecisión en pases: " + NivelPase + "\nPrecisión en tiros: " + NivelTiro);
    }
}
