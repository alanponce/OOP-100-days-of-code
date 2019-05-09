package Proyecto;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ENEMY345
 */
public class Basedatos {
    Connection conect = null;//Este es el interruptor que activa la base de datos
    
    public Connection Conexion()//Creamos esta funcion para que realize la conexion a la base
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");//Inicializamos el driver
            conect = DriverManager.getConnection("jdbc:mysql://localhost/parking","root","");//nos conecta a la base de datos
            JOptionPane.showMessageDialog(null,"Conectado");//Nos muestra una ventana que nos dice si se realizo la conexion con exito
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,"error"+e);//Nos muestra una ventana que nos dice si ocurrio un error al intentar conectarse a la base
        }
        return conect;//nos conecta a la base de 
    }
}
