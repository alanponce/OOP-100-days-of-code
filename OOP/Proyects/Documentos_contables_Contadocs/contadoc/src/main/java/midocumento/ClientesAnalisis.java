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
//genera numeros aleatorios
import java.util.Random;
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
        String stURL = "jdbc:mysql://remotemysql.com:3306/KDJroUoqfj?autoReconnect=true&useSSL=false";
        // ?autoReconnect=true
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

    public boolean estaConectado() {
        boolean temporal=true;
        try{
        temporal=!conexion.isClosed();
        } catch (SQLException sqle) {
            // solo depuracion se genera el codigo de error
            System.out.println("Problemas con conexion.isClosed:" + sqle.getErrorCode() + " " + sqle.getMessage());
        }
        return temporal;
    }
    
    private String declara(int reg) {      
        String[] docs = new String[6];
        String cadena = "INSERT INTO KDJroUoqfj.docregistro (id_cliente,encabezado,tipo,ubicacion,referencia) VALUES ";
        Random rnd = new Random();
        docs[0] = "(" + (rnd.nextInt(reg) + 1)
                + ",'Declaracion anual','Documento digital', 'Dropbox','c:/midropbox/miarchivo" + (rnd.nextInt(reg) + 1)
                + ".pdf')";
        docs[1] = "(" + (rnd.nextInt(reg) + 1)
                + ",'Declaracion anual','Documento digital', 'Dropbox','c:/midropbox/otroArchivo"
                + (rnd.nextInt(reg) + 1) + ".pdf')";
        docs[2] = "(" + (rnd.nextInt(reg) + 1) + ",'Factura','Documento digital', 'Dropbox','c:/midropbox/mifactura"
                + (rnd.nextInt(reg) + 1) + ".pdf')";
        docs[3] = "(" + (rnd.nextInt(reg) + 1) + ",'RFC','Documento digital', 'Dropbox','c:/midropbox/RFC"
                + (rnd.nextInt(reg) + 1) + ".pdf')";
        docs[4] = "(" + (rnd.nextInt(reg) + 1) + ",'RFC','Documento digital', 'Dropbox','c:/midropbox/otroRFC"
                + (rnd.nextInt(reg) + 1) + ".pdf')";
        docs[5] = "(" + (rnd.nextInt(reg) + 1) + ",'Aclaración','Documento digital', 'Dropbox','c:/midropbox/aclaracion"
                + (rnd.nextInt(reg) + 1) + ".pdf')";

        return (cadena+docs[(rnd.nextInt(6))]);
    }
    public void LlenarTabla() {
        Random rnd = new Random();
        String nombreAle[] = { "Jaime", "Javier", "Juan", "Rodolfo", "Dexter", "Dulce","Salvador","Penelope","Sara","José" };
        String apellidoAle[] = { "Soria","Smith", "Chilorio", "Sulvarán", "Cruz", "Chuk", "Corsario", "Chong", "Jimenez",
                "Gutierrez", "Fernández","Hernández","López","Vázquez","Rocha","Slim"};
        String nom = nombreAle[rnd.nextInt(9)],ase = nombreAle[rnd.nextInt(9)];
        String apeP = apellidoAle[rnd.nextInt(15)],apeM = apellidoAle[rnd.nextInt(15)];
        String tel;
        Integer num, nRegistros;

        do{
            num=rnd.nextInt(9999999);
        }while(num<999999);
        tel=Integer.toString(num);
        String dataTemporalC="INSERT INTO KDJroUoqfj.miregistro (nombre,apellidoP,apellidoM,telefono,correo,asesor) VALUES "+
                "('" + nom + "','" + apeP + "','" + apeM + "', '(656)"
                + tel+ "','" + nom + "_" + apeP + "_" + apeM
                + "@correo.com','" + ase + "')";

        
        String dataTemporalD = "INSERT INTO KDJroUoqfj.docregistro (id_cliente,encabezado,tipo,ubicacion,referencia) VALUES ";
                
        String numeroRegistros = "SELECT count(*) as registros from KDJroUoqfj.miregistro";
        try {
            // Se genera la sentencia
            Statement sentencia = conexion.createStatement();
            PreparedStatement sentencia2 = conexion.prepareStatement(numeroRegistros);
            // Se ejecuta la sentencia
            sentencia.executeUpdate(dataTemporalC);
            ResultSet res=sentencia2.executeQuery();
             if (res.next())
                nRegistros = Integer.parseInt(res.getString("registros"));
            else
                nRegistros = 0; 
            //System.out.println("Instrucción " + dataTemporalD + declara(nRegistros));
            sentencia.executeUpdate(declara(nRegistros));
            sentencia.executeUpdate(declara(nRegistros));
           // sentencia.executeUpdate(crearTablaDocumentos);
        } catch (SQLException sqle) {
            // solo depuracion se genera el codigo de error
            System.out.println("Instrucción incorrecta:" + sqle.getErrorCode() + " " + sqle.getMessage());
        }
    }

    public void LlenarTabla(Clientes cliente) {
        //Definimos las sentencias a procesar
        String dataTemporalC = "INSERT INTO KDJroUoqfj.miregistro (nombre,apellidoP,apellidoM,telefono,correo,asesor) VALUES ('"
                +cliente.getNombre()+"','"+cliente.getApellidoP()+"','"+cliente.getApellidoM()+"','"+cliente.getTelefono()+"','"+cliente.getCorreo()+"','"+cliente.getAsesor()+"')";
        try {
            // Se genera la sentencia
            Statement sentencia = conexion.createStatement();
            // Se ejecutan la sentencias para procesarse por sql
            sentencia.executeUpdate(dataTemporalC);
            System.out.println("Llenar tabla" + cliente.getNombre());
            // sentencia.executeUpdate(crearTablaDocumentos);
        } catch (SQLException sqle) {
            // solo depuracion se genera el codigo de error
            System.out.println("Instrucción incorrecta:" + sqle.getErrorCode() + " " + sqle.getMessage());
        }
    }
    public void LlenarTabla(Clientes cliente, Documentos documento) {
        //Definimos las sentencias a procesar
        String dataTemporalC = "INSERT INTO KDJroUoqfj.miregistro (nombre,apellidoP,apellidoM,telefono,correo,asesor) VALUES ('"
                +cliente.getNombre()+"','"+cliente.getApellidoP()+"','"+cliente.getApellidoM()+"','"+cliente.getTelefono()+"','"+cliente.getCorreo()+"','"+cliente.getAsesor()+"')";
        String dataTemporalD = "INSERT INTO KDJroUoqfj.docregistro (id_cliente,encabezado,tipo,ubicacion,referencia) VALUES "
                + "('"+documento.getId_cliente()+"','"+documento.getEncabezado()+"','"+documento.getTipo()+"','"+documento.getUbicacion()+"','"+documento.getReferencia()+"')";
        try {
            // Se genera la sentencia
            Statement sentencia = conexion.createStatement();
            // Se ejecutan la sentencias para procesarse por sql
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

    public ResultSet BuscarNombre(Clientes cliente) {
        //Si la tabla no existe se crea
        CrearTabla("miregistro","docregistro");
        //Se crea la variable para resultados
        ResultSet rs = null;
        String busqueda = "";
        // Si no se ingresa  un nombre se muestra todo
        //if (Nombre != "")
        //    Nombre=" WHERE (id=id_cliente) AND (nombre='"+Nombre+")'";
        System.out.println("query:" + cliente.getNombre());
        System.out.println(busqueda);

        if (cliente.getNombre().equals("*")) {
            if (cliente.getApellidoP().equals("")) {
                busqueda = "";
            }  else{
                if (cliente.getApellidoM().equals("")) {
                busqueda = " AND (apellidoP='"+ cliente.getApellidoP() + "')"; 
                } 
                else
                {busqueda = " AND (apellidoP='" + cliente.getApellidoP() + "') AND (apellidoM='"+ cliente.getApellidoM() + "')"; 
                }    
            } 
        } 
        else 
        {
            if (cliente.getApellidoP().equals("*")) {
                busqueda = " AND (reg.nombre='"+ cliente.getNombre() + "')";
            } else {
                System.out.println("Llega qui...........");
                
                if (cliente.getApellidoM().equals("*")) {
                busqueda = " AND (reg.nombre='"+ cliente.getNombre() + "') AND (apellidoP='" + cliente.getApellidoP() + "')"; 
                } 
                else
                {
                busqueda = " AND (reg.nombre='"+ cliente.getNombre() + "') AND (apellidoP='" + cliente.getApellidoP() + "') AND (apellidoM='"+ cliente.getApellidoM() + "')"; 
                }    
            } 
        }
        
        /*             String busqueda = "SELECT DISTINCT apellidoP, apellidoM, telefono, correo, asesor, encabezado, tipo, ubicacion, referencia FROM KDJroUoqfj.miregistro reg INNER JOIN KDJroUoqfj.docregistro doc ON (reg.id=doc.id_cliente) AND (reg.nombre='"
                            + cliente.getNombre() + "') AND (apellidoP='" + cliente.getApellidoP() + "') AND (apellidoM='"
                            + cliente.getApellidoM() + "')";
                     if (cliente.getApellidoP().equals("")) {
             busqueda = "SELECT DISTINCT apellidoP, apellidoM, telefono, correo, asesor, encabezado, tipo, ubicacion, referencia FROM KDJroUoqfj.miregistro reg INNER JOIN KDJroUoqfj.docregistro doc ON (reg.id=doc.id_cliente) AND (reg.nombre='"
                                + cliente.getNombre() + "') AND (apellidoP='" + cliente.getApellidoP() + "') AND (apellidoM='"
                                + cliente.getApellidoM() + "')"; 
                     }   
 */
                     String base="SELECT DISTINCT apellidoP, apellidoM, telefono, correo, asesor, encabezado, tipo, ubicacion, referencia FROM KDJroUoqfj.miregistro reg INNER JOIN KDJroUoqfj.docregistro doc ON (reg.id=doc.id_cliente)";
        busqueda = base + busqueda;
        System.out.println(busqueda);
      /*  if (cliente.getApellidoM() == "") {
            cliente.setNombre("*");
        } */
         
/*         String busqueda = "SELECT DISTINCT apellidoP, apellidoM, telefono, correo, asesor, encabezado, tipo, ubicacion, referencia FROM KDJroUoqfj.miregistro reg INNER JOIN KDJroUoqfj.docregistro doc ON (reg.id=doc.id_cliente) AND (reg.nombre='"
                + 
        cliente.getNombre()+"') AND (apellidoP='"+cliente.getApellidoP()+"') AND (apellidoM='"+cliente.getApellidoM()+"')"; */
                try {
                    System.out.println("entra al try "+busqueda);
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