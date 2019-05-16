package proyectofinal;
public abstract class  Entretenimiento {
    //Atributos de la superclase Entretenimiento
    private String nombre;
    private int anioLanzamiento;
    private String clasificacion;
    private String genero;
    private String resena;
    private int calificacion;
    
    
    //Constructor de la clase Entretenimiento
    Entretenimiento(){
        nombre = null;
        anioLanzamiento = 0;
        clasificacion = null;
        genero = null;
        resena = null;
        calificacion = 0;
    }
    
    
    
    //Métodos de la superclase Entretenimiento
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getResena() {
        return resena;
    }

    public void setResena(String resena) {
        this.resena = resena;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }   
}
