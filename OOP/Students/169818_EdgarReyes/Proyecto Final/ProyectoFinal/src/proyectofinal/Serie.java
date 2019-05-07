package proyectofinal;
public class Serie extends Entretenimiento{ //Declaracion de clase serie que hereda de la clase Entretenimiento
    //Atributos de la clase Serie
    private String cadenaTelevision;    //Los atributos son declarados como privados para 
                                        //que nada fuera de la clase los pueda modificar
    private String companiaTelevision;
    private String creador;

    //Métodos de la clase Serie
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
