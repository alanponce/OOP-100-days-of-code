
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaleb150204
 */
public class Conexion {
    
    public static Connection ObtenerConexion(){
      String Driver="sun.odbc.JdbcOdbcDriiver";
      String URL="jdbc:mysql://localhost:3306/ForaneosCU";
      String user="kaleb123";
      String pass="kaleb12345";
      
      
      Connection cn = null;
        try{
            Class.forName(Driver);
            cn=DriverManager.getConnection(URL, user, pass);
        }catch (Exception e){
            System.out.print("Error" + e.getMessage());
            
        }
      return cn;
}}
