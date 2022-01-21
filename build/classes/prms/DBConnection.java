package prms;
import java.sql.*;

public class DBConnection {
    public static Connection connectDB(){
 
        Connection conn = null;
        try
        {
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost/prms", "root", "");
            return conn;
            
        }catch(SQLException ex)
        {
            
            System.out.println("The system was unable to connect to the database");
            return null;
            
        }
    }
}
