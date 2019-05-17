/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author victor
 */
public class conexion_bd {

   private static String URL = "jdbc:mysql://localhost/bd_sistema_abc";
   private static String Usuario = "root";
   private static String Contraseña = "123stytech456";

   public static Connection conectar (){
       Connection conexion = null;
       
       try {
           Class.forName("com.mysql.jdbc.Driver");
           conexion = DriverManager.getConnection( URL, Usuario, Contraseña);
           System.out.println("conexion establecida");
       } catch (ClassNotFoundException| SQLException e){ 
           System.out.println("Error: " +e);
       }
       return conexion;
   }
   
   
}

    
