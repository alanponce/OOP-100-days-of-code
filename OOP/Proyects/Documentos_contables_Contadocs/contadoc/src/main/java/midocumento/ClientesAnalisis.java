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
    private Connection conexion = null;
    private Tabla tabla=new Tabla();

   /*  // La funcion conexionDB() ingresa a la base de datos
    public Connection conexionDB(String usuario, String password) {
  ,l
        //Se le asignan los detalles de la base de datos, y se le especifica que use unicode para evitar conflictos de idioma
        // String stURL = "jdbc:mysql://localhost:3306/dbhibernate?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String stURL = "jdbc:mysql://remotemysql.com:3306/KDJroUoqfj?autoReconnect=true&useSSL=false";
        // ?autoReconnect=true
        try {
            //Se llama al metodo que inicia la coexión
            conexion = DriverManager.getConnection(stURL, usuario, password);
            //Se imprime un mensaje si la conexión de la base de datos fe exitosa
            System.out.println("Conexión exitosa");
            return conexion;
        } catch (SQLException ex) {
            //Se imprime el problema en la conexión de la base de datos 
            System.out.println(ex);
            Logger.getLogger(ClientesAnalisis.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 

    public boolean estaConectado() {
        boolean temporal=true;
        try{
        temporal=!conexion.isClosed();
        } catch (SQLException sqle) {
            // solo depuracion se genera el codigo de error
            System.out.println("Problemas con conexion.isClosed:" + sqle.getErrorCode() + " " + sqle.getMessage());
        }
        return temporal;
    }*/
    

    public ResultSet BuscarNombre(Clientes cliente, Conexion conexion) {
        //Si la tabla no existe se crea
        //tabla.CrearTabla("miregistro", "docregistro",conexion);
        //Se crea la variable para resultados
        ResultSet rs = null;
        String busqueda = "";
        // Si no se ingresa  un nombre se muestra todo
        //Solo depuracion:Conocer los datos que se muestran
        //System.out.println("Datos:" + cliente.getNombre() + cliente.getApellidoP() + cliente.getApellidoM());
        //Solo depuracion: conocer el query
        System.out.println(busqueda);

        if (cliente.getNombre().equals("*")) {
            if (cliente.getApellidoP().equals("*")) {
                busqueda = "";
            } else {
                if (cliente.getApellidoM().equals("*")) {
                    busqueda = " AND (apellidoP='" + cliente.getApellidoP() + "')";
                } else {
                    busqueda = " AND (apellidoP='" + cliente.getApellidoP() + "') AND (apellidoM='"
                            + cliente.getApellidoM() + "')";
                }
            }
        } else {
            if (cliente.getApellidoP().equals("*")) {
                busqueda = " AND (reg.nombre='" + cliente.getNombre() + "')";
            } else {
                System.out.println("Llega qui...........");

                if (cliente.getApellidoM().equals("*")) {
                    busqueda = " AND (reg.nombre='" + cliente.getNombre() + "') AND (apellidoP='"
                            + cliente.getApellidoP() + "')";
                } else {
                    busqueda = " AND (reg.nombre='" + cliente.getNombre() + "') AND (apellidoP='"
                            + cliente.getApellidoP() + "') AND (apellidoM='" + cliente.getApellidoM() + "')";
                }
            }
        }
        //Cadena base a realizar
        String base = "SELECT DISTINCT reg.id, nombre, apellidoP, apellidoM, telefono, correo, asesor, encabezado, tipo, ubicacion, referencia FROM KDJroUoqfj.miregistro reg INNER JOIN KDJroUoqfj.docregistro doc ON (reg.id=doc.id_cliente)";
        String Sfinal="ORDER BY reg.id ASC";
        //Se conjunta la base con la estructura elegida
        busqueda = base + busqueda+Sfinal;
        System.out.println(busqueda);
        try {
            PreparedStatement sentencia = conexion.conexionDB().prepareStatement(busqueda);
            rs = sentencia.executeQuery(busqueda);

        } catch (SQLException sqle) {
            // solo depuracion
            System.out.println("Instrucción incorrecta:" + sqle.getErrorCode() + " " + sqle.getMessage());
        }
        return rs;
    }
    public ResultSet BuscarDocumento(Clientes cliente, Conexion conexion) {
        //Si la tabla no existe se crea
        //tabla.CrearTabla("miregistro", "docregistro",conexion);
        //Se crea la variable para resultados
        ResultSet rs = null;
        String busqueda;
        // Si no se ingresa  un nombre se muestra todo

         //Cadena base a realizar
         String base = "SELECT doc.id, encabezado, tipo, ubicacion, referencia FROM KDJroUoqfj.miregistro reg INNER JOIN KDJroUoqfj.docregistro doc WHERE (reg.id=doc.id_cliente)";
        busqueda = " AND (reg.id=" +Long.toString(cliente.getId())+")";
        String Sfinal=" ORDER BY doc.id ASC";
        //Se conjunta la base con la estructura elegida
        busqueda = base + busqueda+Sfinal;
        try {
            System.out.println(busqueda);
            PreparedStatement sentencia;
            sentencia = conexion.conexionDB().prepareStatement(busqueda);
            rs = sentencia.executeQuery(busqueda);
        } catch (SQLException sqle) {
            // solo depuracion
            System.out.println("Instrucción incorrecta:" + sqle.getErrorCode() + " " + sqle.getMessage());
        }
        return rs;
    }
    
    public ResultSet BuscarDocumentoD(Documentos documento, Conexion conexion) {
        // Si la tabla no existe se crea
         //tabla.CrearTabla("miregistro", "docregistro",conexion);
        // Se crea la variable para resultados
        ResultSet rs = null;
        String busqueda = "";
        // Si no se ingresa un nombre se muestra todo
        // Solo depuracion:Conocer los datos que se muestran
        // Solo depuracion: conocer el query
        // Cadena base a realizar
        String base = "SELECT id, encabezado, tipo, ubicacion, referencia FROM KDJroUoqfj.docregistro ";
        busqueda = "WHERE id=" + Long.toString(documento.getId());
        //String Sfinal = " ORDER BY id ASC";
        // Se conjunta la base con la estructura elegida
        busqueda = base + busqueda;
        System.out.println(busqueda);
        try {
            PreparedStatement sentencia = conexion.conexionDB().prepareStatement(busqueda);
            // sentencia.setString(1,Nombre);
            rs = sentencia.executeQuery();
        } catch (SQLException sqle) {
            // solo depuracion
            System.out.println("Instrucción incorrecta:" + sqle.getErrorCode() + " " + sqle.getMessage());
        }
        //     conexion.cerrarConexion();
        return rs;
    }

}