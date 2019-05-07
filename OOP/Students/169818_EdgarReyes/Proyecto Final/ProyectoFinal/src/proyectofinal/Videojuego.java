package proyectofinal;
public class Videojuego extends Entretenimiento{
    private String[] plataformas;
    private String desarrollador;
    private String escritor;

    public String[] getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(String plataforma) {
        this.plataformas = plataformas;
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
    
    
}
