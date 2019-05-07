package proyectofinal;
public class Pelicula extends Entretenimiento{
    //Atributos de la clase Pelicula
    private int duracion;        //Los atributos son declarados como privados para 
                                //que nada fuera de la clase los pueda modificar
    private String estudioCine;
    private int presupuesto;
    private int recaudacion;
    private String director;

    //Métodos de la clase Pelicula
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getEstudioCine() {
        return estudioCine;
    }

    public void setEstudioCine(String estudioCine) {
        this.estudioCine = estudioCine;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(int recaudacion) {
        this.recaudacion = recaudacion;
    }
    
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    
}
