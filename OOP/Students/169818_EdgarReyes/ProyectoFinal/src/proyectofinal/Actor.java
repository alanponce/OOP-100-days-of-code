package proyectofinal;
public class Actor extends Persona {
    private String peliculasActuadas;
    
    //Metodos de la clase
    Actor(){
        this.peliculasActuadas = null;
    }

    public String getPeliculasActuadas() {
        return peliculasActuadas;
    }

    public void setPeliculasActuadas(String peliculasActuadas) {
        this.peliculasActuadas = peliculasActuadas;
    }
    
}
