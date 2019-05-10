package proyectofinal;
public class Videojuego extends Entretenimiento implements manejarRegistros{
   
    private String desarrollador;
    private String escritor;

    //Constructor de la clase Videojuego
    Videojuego(){
        
        desarrollador = null;
        escritor = null;
    }
    


    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getEscritor() {
        return escritor;
    }
    
    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }
    
    //Sobrescritura de métodos de la interfaz manejarRegistros
    @Override
    public void mostrarDatos(){
        System.out.println("Nombre:" + getNombre());
        System.out.println("Año de Lanzamiento" + getAnioLanzamiento());
        System.out.println("Clasificacion: " + getClasificacion());
        System.out.println("Genero: " + getGenero());
        System.out.println("Reseña: " + getResena());
        System.out.println("Calificacion: " + getCalificacion());
        System.out.println("Plataformas: ");
        System.out.println("Desarrollador: " + getDesarrollador());
        System.out.println("Escritor: " + getEscritor());
        
    }
    
    @Override
    public void agregarRegistro(int... nums){
        
    }
    
    public void eliminarRegistro(){
        
    }
    
    public void actualizarRegistro(){
        
    }
}
