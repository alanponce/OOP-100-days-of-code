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

    //public void LlenarTabla(Clientes cliente,Documentos documento) {
    public void LlenarTabla() {
        String dataTemporalC="INSERT INTO KDJroUoqfj.miregistro (nombre,apellidoP,apellidoM,telefono,correo,asesor) VALUES "+
        "('Jim','Neutron','Pelaez', '20120112','neutron@correo.com','Andrea'),"+
        "('Konan','Barbaro','Chilorio', '20155112','konan@correo.com','Petra'),"+
        "('Fido','Logan','Rognan', '56665555','fido@correo.com','Petra'),"+
        "('Rudo','Acan','Polux', '56565235','rudo@correo.com','Andrea'),"+
        "('Dexter','Polo','Chuk', '20120112','dexter@correo.com','Penelope'),"+
        "('Jim','Corsario','Chong', '45120112','corsario@puk.com','Andrea')";
        String dataTemporalD="INSERT INTO KDJroUoqfj.docregistro (id_cliente,encabezado,tipo,ubicacion,referencia) VALUES "+
        "(5,'Declaracion anual','Documento digital', 'Dropbox','c:/midropbox/miarchivo.pdf'),"+
        "(4,'Declaracion anual','Documento digital', 'Dropbox','c:/midropbox/otroArchivo.pdf'),"+
        "(2,'Factura','Documento digital', 'Dropbox','c:/midropbox/mifactura1.pdf'),"+
        "(1,'RFC','Documento digital', 'Dropbox','c:/midropbox/miRFC.pdf'),"+
        "(3,'RFC','Documento digital', 'Dropbox','c:/midropbox/otroRFC.pdf'),"+
        "(6,'Aclaración','Documento digital', 'Dropbox','c:/midropbox/aclaracion.pdf')";
        try {
            // Se genera la sentencia
            Statement sentencia = conexion.createStatement();
            // Se ejecuta la sentencia
            sentencia.executeUpdate(dataTemporalC);
            sentencia.executeUpdate(dataTemporalD);
           // sentencia.executeUpdate(crearTablaDocumentos);
        } catch (SQLException sqle) {
            // solo depuracion se genera el codigo de error
            System.out.println("Instrucción incorrecta:" + sqle.getErrorCode() + " " + sqle.getMessage());
        }
    }
    
    public void CrearTabla(String nombreDeTablaC, String nombreDeTablaD) {
        // String crearBaseDeDatos = "CREATE DATABASE IF NOT EXISTS documentProject ";
        //Genera la sentencia principal para buscar por nombre y apellidos
        String crearTablaClientes = "CREATE TABLE IF NOT EXISTS " + nombreDeTablaC + " (id INTEGER not NULL AUTO_INCREMENT, "
                + " nombre VARCHAR(255), " + " apellidoP VARCHAR(255), " + " apellidoM VARCHAR(255), "
                + " telefono VARCHAR(100), " + " correo VARCHAR(100), " + " asesor VARCHAR(100), "
                + " PRIMARY KEY ( id ))";
        String crearTablaDocumentos = "CREATE TABLE IF NOT EXISTS " + nombreDeTablaD + " (id INTEGER not NULL AUTO_INCREMENT, "+ " id_cliente INTEGER not NULL, "
                + " encabezado VARCHAR(255), " + " tipo VARCHAR(255), "+ " ubicacion VARCHAR(255), " + " referencia VARCHAR(255), "  + " PRIMARY KEY ( id ), "+"FOREIGN KEY(id_cliente) REFERENCES "+nombreDeTablaC+"(id))";
    
        try {
            // Se genera la sentencia 
            Statement sentencia = conexion.createStatement();
            //Depuracion
            //System.out.println("Base creada");
            // Se ejecuta la sentencia 
            sentencia.executeUpdate(crearTablaClientes);
            sentencia.executeUpdate(crearTablaDocumentos);
            LlenarTabla();
        } catch (SQLException sqle) {
            // solo depuracion se genera el codigo de error
            System.out.println("Instrucción incorrecta:" + sqle.getErrorCode() + " " + sqle.getMessage());
        }
    }

    public ResultSet BuscarNombre(String Nombre, String Apellido) {
        //Si la tabla no existe se crea
        CrearTabla("miregistro","docregistro");
        //Se crea la variable para resultados
        ResultSet rs = null;
        // Si no se ingresa  un nombre se muestra todo
        //if (Nombre != "")
         //    Nombre=" WHERE (id=id_cliente) AND (nombre='"+Nombre+")'";
        String busqueda = "SELECT DISTINCT apellidoP, apellidoM, telefono, correo, asesor, encabezado, tipo, ubicacion, referencia FROM KDJroUoqfj.miregistro reg INNER JOIN KDJroUoqfj.docregistro doc ON (reg.id=doc.id_cliente) AND (reg.nombre='"+Nombre+"')";
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