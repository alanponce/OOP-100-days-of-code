/*
 * https://www.homeandlearn.co.uk/java/connect_to_a_database_using_java_code.html
 */
package pokemon_database_console;
import java.sql.Connection; //A connection (session) with a specific database. SQL statements are executed and results are returned within the context of a connection. https://docs.oracle.com/javase/7/docs/api/java/sql/Connection.html
import java.sql.DriverManager; //The basic service for managing a set of JDBC (Java DataBase Connectivity) drivers. https://docs.oracle.com/javase/8/docs/api/java/sql/DriverManager.html
import java.sql.SQLException; //An exception that provides information on a database access error or other errors.https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html
/**
 *
 * @author hecto
 */
public class DBConnect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try {
        String host = "jdbc:derby://localhost:1527/sample";
        String username= "hecto";
        String password=null;
        Connection con = DriverManager.getConnection( host, username, password );
}
catch ( SQLException err ) {
System.out.println( err.getMessage( ) );
}
    }
    
}
