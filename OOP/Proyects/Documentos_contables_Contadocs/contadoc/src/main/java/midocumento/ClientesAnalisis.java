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
// Esta libreria gestiona las peticiones
import java.sql.Statement;

/**
 *
 * @author George Rodriguez
 */
public class ClientesAnalisis {
    private Connection conexion = null;

    // La funcion conexionDB() ingresa a la base de datos
    public boolean conexionDB(String usuario, String password) {
        /*
         * You have successfully created a new MySQL database. Your details can be found
         * below. Username: KDJroUoqfj Database: KDJroUoqfj Password: bmlp5wFD3l Server:
         * remotemysql.com Port: 3306
         */
        //Se le asignan los detalles de la base de datos, y se le especifica que use unicode para evitar conflictos de idioma
        // String stURL = "jdbc:mysql://localhost:3306/dbhibernate?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String stURL = "jdbc:mysql://remotemysql.com:3306/KDJroUoqfj";
        try {
            //Se llama al metodo que inicia la coexión
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

    public void CrearTabla(String nombreDeTabla) {
        // String crearBaseDeDatos = "CREATE DATABASE IF NOT EXISTS documentProject ";
        String crearTabla = "CREATE TABLE IF NOT EXISTS " + nombreDeTabla + " (id INTEGER not NULL, "
                + " nombre VARCHAR(255), " + " apellidoP VARCHAR(255), " + " apellidoM VARCHAR(255), "
                + " telefono VARCHAR(100), " + " correo VARCHAR(100), " + " asesor VARCHAR(100), "
                + " PRIMARY KEY ( id ))";
        // String dataTemporal="INSERT INTO KDJroUoqfj.miregistro VALUES "+
        // "(1, 'Jim','Neutron','Pelaez', '20120112','neutron@correo.com','Andrea'),"+
        // "(2, 'Konan','Barbaro','Chilorio', '20155112','konan@correo.com','Petra'),"+
        // "(3, 'Fido','Logan','Rognan', '56665555','fido@correo.com','Petra'),"+
        // "(4, 'Rudo','Acan','Polux', '56565235','rudo@correo.com','Andrea'),"+
        // "(5, 'Dexter','Polo','Chuk', '20120112','dexter@correo.com','Penelope')";
        // "(6, 'Jim','Corsario','Chong', '45120112','corsario@puk.com','Andrea'),"+
        try {
            Statement sentencia = conexion.createStatement();
            System.out.println("Base creada");
            sentencia.executeUpdate(crearTabla);
        } catch (SQLException sqle) {
            // solo depuracion
            System.out.println("Instrucción incorrecta:" + sqle.getErrorCode() + " " + sqle.getMessage());
        }
    }

    public ResultSet BuscarNombre(String Nombre, String Apellido) {
        CrearTabla("miregistro");
        ResultSet rs=null;
        String busqueda = "SELECT apellidoP, apellidoM, telefono, correo, asesor FROM KDJroUoqfj.miregistro WHERE nombre = '"+Nombre+"'";
                try {
       PreparedStatement sentencia = conexion.prepareStatement(busqueda);
        //sentencia.setString(1,Nombre);
        rs = sentencia.executeQuery(busqueda);

        } catch (SQLException sqle) {
            // solo depuracion
            System.out.println("Instrucción incorrecta:" + sqle.getErrorCode() + " " + sqle.getMessage());
        }
                return rs;
    }
    public void cerrarConexion(){
                try {
            if (conexion != null)
                conexion.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}