package midocumento;

// Esta librería contiene los metodos que nos permiten vincularnos con la base de datos, asignando
//todos los controles a las variables instanciadas en la librería
import java.sql.Connection;
// Permite controlar las excepciones de las solicitudes enviadas
import java.sql.SQLException;
// Permite realizar las peticiones a la base de datos
import java.sql.PreparedStatement;
// permite recuperar los resultados de las transacciones realizaadas
import java.sql.ResultSet;
// Esta libreria gestiona las peticiones
import java.sql.Statement;
//genera numeros aleatorios
import java.util.Random;
//genera numeros aleatorios
public class Tabla{
    private String declara(int reg) {
    // Ingresa el número de registros de la base de datos y regresa un conjunto de
        // datos aleatorios para ser ingresados.  
        String[] docs = new String[6];
        String cadena = "INSERT INTO KDJroUoqfj.docregistro (id_cliente,encabezado,tipo,ubicacion,referencia) VALUES ";
        Random rnd = new Random();
        docs[0] = "(" + (rnd.nextInt(reg) + 1)+ ",'Declaracion anual "+ (rnd.nextInt(reg) + 1) +"','Documento digital', 'Dropbox','c:/midropbox/miarchivo" + (rnd.nextInt(reg) + 1)
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

    public void LlenarTabla(Connection conexion) {
        // Llena la base de datos con un conjunto de
        // datos aleatorios para ser ingresados. 
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

        //String dataTemporalD = "INSERT INTO KDJroUoqfj.docregistro (id_cliente,encabezado,tipo,ubicacion,referencia) VALUES ";
                
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

    public void LlenarTabla(Clientes cliente, Connection conexion) {
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

    public void LlenarTabla(Clientes cliente, Documentos documento, Connection conexion) {
        //Definimos las sentencias a procesar
        String dataTemporalC = "INSERT INTO KDJroUoqfj.miregistro (nombre,apellidoP,apellidoM,telefono,correo,asesor) VALUES ('"
                + cliente.getNombre() + "','" + cliente.getApellidoP() + "','" + cliente.getApellidoM() + "','"
                + cliente.getTelefono() + "','" + cliente.getCorreo() + "','" + cliente.getAsesor() + "')";
        String dataTemporalD = "INSERT INTO KDJroUoqfj.docregistro (id_cliente,encabezado,tipo,ubicacion,referencia) VALUES "
                + "('" + documento.getId_cliente() + "','" + documento.getEncabezado() + "','" + documento.getTipo()
                + "','" + documento.getUbicacion() + "','" + documento.getReferencia() + "')";

        String ActualizarData = "UPDATE KDJroUoqfj.docregistro SET " + "encabezado=" + documento.getEncabezado()
                + "', tipo='" + documento.getTipo() + "', ubicacion='" + documento.getUbicacion() + "', referencia='"
                + documento.getReferencia() + "') WHERE id_cliente=" + String.valueOf(documento.getId_cliente());
        String AgregarData = "INSERT INTO KDJroUoqfj.docregistro (id_cliente,encabezado,tipo,ubicacion,referencia) VALUES "
                + "('" + documento.getId_cliente() + "','" + documento.getEncabezado() + "','" + documento.getTipo()
                + "','" + documento.getUbicacion() + "','" + documento.getReferencia() + "') WHERE id_cliente="
                + String.valueOf(documento.getId_cliente());
        String BorrarData = " ";
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
    
    public void LlenarTabla(Documentos documento,Connection conexion) {
        //Definimos las sentencias a procesar
        String AgregarData= "INSERT INTO KDJroUoqfj.docregistro (id_cliente,encabezado,tipo,ubicacion,referencia) VALUES "
                + "('" + documento.getId_cliente() + "','" + documento.getEncabezado() + "','" + documento.getTipo()
                + "','" + documento.getUbicacion() + "','" + documento.getReferencia() + "') WHERE id_cliente="
                + String.valueOf(documento.getId_cliente());
        String ActualizarData= "UPDATE KDJroUoqfj.docregistro SET "
                + "encabezado='" + documento.getEncabezado() + "', tipo='" + documento.getTipo()
                + "', ubicacion='" + documento.getUbicacion() + "', referencia='" + documento.getReferencia() + "' WHERE id_cliente="
                + String.valueOf(documento.getId_cliente())+" AND id="
                + String.valueOf(documento.getId());
        String BorrarData = "DELETE * FROM KDJroUoqfj.docregistro WHERE id_cliente="
                + String.valueOf(documento.getId_cliente())+" AND id="
                + String.valueOf(documento.getId());
                String Data="";
        switch (documento.getOperacion()) {
            case 1: Data=AgregarData;
            break;
            case 2: Data=ActualizarData;
            break;
            case 3: Data=BorrarData;
            break;      
            default: Data = ActualizarData;
            break;
        }
            System.out.println(Data);
        try {
            // Se genera la sentencia
            Statement sentencia = conexion.createStatement();
            // Se ejecutan la sentencias para procesarse por sql
            sentencia.executeUpdate(Data);
            // sentencia.executeUpdate(crearTablaDocumentos);
        } catch (SQLException sqle) {
            // solo depuracion se genera el codigo de error
            System.out.println("Instrucción incorrecta:" + sqle.getErrorCode() + " " + sqle.getMessage());
        }
    }
    
    public void CrearTabla(String nombreDeTablaC, String nombreDeTablaD, Connection conexion) {
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
            LlenarTabla(conexion);
        } catch (SQLException sqle) {
            // solo depuracion se genera el codigo de error
            System.out.println("Instrucción incorrecta:" + sqle.getErrorCode() + " " + sqle.getMessage());
        }
    }

    }