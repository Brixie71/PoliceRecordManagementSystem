package prms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection connectDB() throws ClassNotFoundException {

        
        Connection conn = null;
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prms", "root", "");
            return conn;

        } catch (SQLException ex) {

            System.out.println("The system was unable to connect to the database!");
            return null;

        }
    }
}
