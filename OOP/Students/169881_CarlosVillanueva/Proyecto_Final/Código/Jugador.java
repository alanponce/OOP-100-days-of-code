
package equipo.de.baloncesto;
public abstract class Jugador {//Se crea la clase abstracta Jugador.
    //Se crean los atributos privados de Nombre, Posición, Estatura, NivelDefensa, NivelPase y NivelTiro.
    private String Nombre;
    private String Posicion;
    private int Estatura;
    private int NivelDefensa;
    private int NivelPase;
    private int NivelTiro;
    //Se crean los métodos abstractos Pasar, Tirar, Defender, Avanzar y Retroceder. Estos métodos serán sobreescritos en las subclases.
    public abstract void Pasar();
    public abstract void Tirar();
    public abstract void Defender();
    public abstract void Avanzar();
    public abstract void Retroceder();
    //Se crean los métodos getters y setters para poder obtener y modificar el valor de estos atributos en otras clases.
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
    //Se crea el método getStats, que retorna los valores de los atributos de esta clase.
    public String getStats(){
        return "Nombre: " + Nombre + "\nPosición: " + Posicion + "\nEstatura: " + Estatura + " cm"+ "\nDefensa: " + NivelDefensa + "\nPrecisión en pases: " + NivelPase + "\nPrecisión en tiros: " + NivelTiro;
    }
}
