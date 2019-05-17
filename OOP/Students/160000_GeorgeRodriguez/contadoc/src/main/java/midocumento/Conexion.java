package midocumento;

/**
 *
 * @author George Rodriguez
 */
import java.sql.Connection;
// Esta librería nos permite acceder a la base de datos solicitada
import java.sql.DriverManager;
// Permite controlar las excepciones de las solicitudes enviadas
import java.sql.SQLException;
// Guarda un registro de los problemas asignados por niveles
import java.util.logging.Level;
// Guarda los registros de las transacciones
import java.util.logging.Logger;

public class Conexion {
        //Variable de conexion
    private Connection conexion = null;
        // Url de la base de datos
    private String URL;
    // Nombre del usuario
    private String usuario;
    // Password del usuario
    private String password;
    // Puerto de acceso de la base de datos
    private int puerto;
    // Nombre de la base de datos
    private String dbase;
    // Tipo de administrador de base de datos: mysql, mariadb, microsoft sql, etc.
    private String tipo;
    // Complementos tales como idioma, reconexioon,etc.
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
    // La funcion conexionDB() ingresa a la base de datos

    public Connection conexionDB() {
          // Se le asignan los detalles de la base de datos
        String strURL = "jdbc:" + getTipo() + "://" + getURL() + ":" + String.valueOf(getPuerto())+ "/" + getDbase() + "?"
                + getOpciones();
        try {
            // Se llama al metodo que inicia la coexión
            conexion = DriverManager.getConnection(strURL, getUsuario(), getPassword());
            // Se imprime un mensaje si la conexión de la base de datos fe exitosa
            System.out.println("Conexión exitosa");
            return conexion;
        } catch (SQLException ex) {
            // Se imprime el problema en la conexión de la base de datos
            System.out.println(ex);
            Logger.getLogger(ClientesAnalisis.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean estaConectado() {
        boolean temporal = true;
        try {
            temporal = !conexion.isClosed();
        } catch (SQLException sqle) {
            // solo depuracion se genera el codigo de error
            System.out.println("Problemas con conexion.isClosed:" + sqle.getErrorCode() + " " + sqle.getMessage());
        }
        return temporal;
    }
    
    public void cerrarConexion() {
        try {
            if (conexion != null)
                conexion.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}