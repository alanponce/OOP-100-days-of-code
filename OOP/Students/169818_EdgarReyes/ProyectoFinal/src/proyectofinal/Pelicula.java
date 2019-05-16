package proyectofinal;

import java.util.ArrayList;

public class Pelicula extends Entretenimiento implements manejarRegistros{
    //Atributos de la clase Pelicula
    private int duracion;        //Los atributos son declarados como privados para 
                                //que nada fuera de la clase los pueda modificar
    private String estudioCine;
    private int presupuesto;
    private int recaudacion;
    private String director;
    private ArrayList<String> listaActores;

    //Métodos de la clase Pelicula
    Pelicula(){
        this.estudioCine = null;
        this.presupuesto = 0;
        this.recaudacion = 0;
        this.director = null;
        this.listaActores = new ArrayList<String>();
    }
    
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
    
     public String[] getActores(){
        String[] actores = this.listaActores.toArray(new String[this.listaActores.size()]);
        return actores;
    }
    
    public void setActores(String actor){
        this.listaActores.add(actor);
    }
    
    //Sobrescritura de metodo en interfaz.
    public void mostrarDatos(){
        
    }
    
    //Sobrescritura de metodo en interfaz.
    public void crearRegistro(){
        
    }
    
    //Sobrescritura de metodo en interfaz.
    public void eliminarRegistro(){
        
    }
    
    //Sobrescritura de metodo en interfaz.
    public void actualizarRegistro(){
        
    }
}
