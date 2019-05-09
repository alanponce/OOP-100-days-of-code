
package equipo.de.baloncesto;
public abstract class Jugador {
    private String Nombre;
    private String Posicion;
    private int Estatura;
    private int NivelDefensa;
    private int NivelPase;
    private int NivelTiro;
    public abstract void Pasar();
    public abstract void Tirar();
    public abstract void Defender();
    public abstract void Avanzar();
    public abstract void Retroceder();

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

    public int getNivelDefensa() {
        return NivelDefensa;
    }

    public final void setNivelDefensa(int NivelDefensa) {
        this.NivelDefensa = NivelDefensa;
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
    public String getStats(){
        return "Nombre: " + Nombre + "\nPosición: " + Posicion + "\nEstatura: " + Estatura + " cm"+ "\nDefensa: " + NivelDefensa + "\nPrecisión en pases: " + NivelPase + "\nPrecisión en tiros: " + NivelTiro;
    }
}
