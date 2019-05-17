package midocumento;

/**
 *
 * @author George Rodriguez
 */
public class valoresConexion {
    //Url de la base de datos
    private String URL;
    //Nombre del usuario
    private String usuario;
    //Password del usuario
    private String password;
    //Puerto de acceso de la base de datos
    private int puerto;
    //Nombre de la base de datos
    private String dbase;
    //Tipo de administrador de base de datos: mysql, mariadb, microsoft sql, etc.
    private String tipo;
    //Complementos tales como idioma, reconexioon,etc.
    private String opciones;

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getURL() {
        return this.URL;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public int getPuerto() {
        return this.puerto;
    }
    public void setDbase(String dbase) {
        this.dbase = dbase;
    }

    public String getDbase() {
        return this.dbase;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }
    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }

    public String getOpciones() {
        return this.opciones;
    }

}