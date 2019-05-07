package proyectofinal;
public class Serie extends Entretenimiento{
    private String cadenaTelevision;
    private String companiaTelevision;
    private String creador;

    public String getCadenaTelevision() {
        return cadenaTelevision;
    }

    public void setCadenaTelevision(String cadenaTelevision) {
        this.cadenaTelevision = cadenaTelevision;
    }

    public String getCompaniaTelevision() {
        return companiaTelevision;
    }

    public void setCompaniaTelevision(String companiaTelevision) {
        this.companiaTelevision = companiaTelevision;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
}
