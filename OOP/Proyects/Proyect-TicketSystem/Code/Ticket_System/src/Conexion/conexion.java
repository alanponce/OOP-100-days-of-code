/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection; //importacion de la libreria para realizar la coneccion
import java.sql.DriverManager; //importacion para gestionar las conecciones
import java.sql.SQLException;//importacion de la libreria para poder manejar errores en la ejecucion de JDBC
import javax.swing.JOptionPane;//importacion de la libreria para imprimir mensajes en pantalla

/**
 *
 * @author owner
 */
public class conexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String connectionURL="jdbc:sqlserver://DESKTOP-HI0PTQQ:1433;database=Ticket_System;user=UsuarioSQL;password=123;";
    
    try{
    Connection con = DriverManager.getConnection(connectionURL);
    System.out.println("Conexion");
    }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Error al Acceder a la Base de Datos");
        }
    }
    
}
