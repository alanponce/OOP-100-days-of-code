package proyectofinal;
public abstract class  Entretenimiento {
    //Atributos de la superclase Entretenimiento
    private String nombre;
    private int anioLanzamiento;
    private String clasificacion;
    private String genero;
    private String resena;
    private float calificacion;
    private static int numRegistro;
    
    
    //Constructor de la clase Entretenimiento
    Entretenimiento(){
        this.nombre = null;
        this.anioLanzamiento = 0;
        this.clasificacion = null;
        this.genero = null;
        this.resena = null;
        this.calificacion = 0;
        this.numRegistro++;
    }
    
    Entretenimiento(String nombre, int anioLanzamiento, String clasificacion, String genero, String resena, float calificacion){
        this.nombre = nombre;
        this.anioLanzamiento = anioLanzamiento;
        this.clasificacion = clasificacion;
        this.genero = genero;
        this.resena = resena;
        this.calificacion = calificacion;
        this.numRegistro++;
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

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }   
    
    public int getNumRegistro(){
        return this.numRegistro;
    }
}
