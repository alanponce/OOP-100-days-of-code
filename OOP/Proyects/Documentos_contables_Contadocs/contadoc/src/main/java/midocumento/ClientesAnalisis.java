/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midocumento;
// Esta librería contiene los metodos que nos permiten vincularnos con la base de datos, asignando
//todos los controles a las variables instanciadas en la librería
import java.sql.Connection;
// Esta librería nos permite acceder a la base de datos solicitada
import java.sql.DriverManager;
// Permite controlar las excepciones de las solicitudes enviadas
import java.sql.SQLException;
// Guarda un registro de los problemas asignados por niveles
import java.util.logging.Level;
// Guarda los registros de las transacciones
import java.util.logging.Logger;
// Permite realizar las peticiones a la base de datos
import java.sql.PreparedStatement;
// permite recuperar los resultados de las transacciones realizaadas
import java.sql.ResultSet;

/**
 *
 * @author George Rodriguez
 */
public class ClientesAnalisis {
    Connection conexion = null;
    // La funcion conexionDB() ingresa a la base de datos
    public boolean conexionDB(String usuario, String password) {
        //Se le asignan los detalles de la base de datos, y se le especifica que use unicode para evitar conflictos de idioma
        String stURL = "jdbc:mysql://localhost:3306/dbhibernate?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        //String stURL = "jdbc:mysql:198.91.81.7/geoxneox_documentProject";
        try {
            //Se llama al metodo que inicia la coexi[on]
            conexion = DriverManager.getConnection(stURL, usuario, password);
            //Se imprime un mensaje si la conexión de la base de datos fe exitosa
            System.out.println("Conexión exitosa");
            return true;
        } catch (SQLException ex) {
            //Se imprime el problema en la conexión de la base de datos 
            System.out.println(ex);
            Logger.getLogger(ClientesAnalisis.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public String BuscarNombre(String Nombre,String Apellido) {
        try (PreparedStatement stmt = conexion.prepareStatement("SELECT nombre FROM clientes")) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next())
                System.out.println(rs.getString("nombre");

        } catch (SQLException sqle) {
            // solo depuracion
            System.out.println("Error en la ejecución:" + sqle.getErrorCode() + " " + sqle.getMessage());
        }
        return "Hola";
    }
}
