package connection;
import java.sql.*;
public class Task1 {
	    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        String url = "jdbc:mysql://localhost:3306/test";
	        String user = "root";
	        String pass = "";
	        
	        Connection c = DriverManager.getConnection(url, user, pass);
	        Statement stmt = c.createStatement();
	        
	        String query = "CREATE TABLE IF NOT EXISTS ct (id TINYINT, name VARCHAR(32), age INT)";
	        stmt.executeUpdate(query);
	       
	        System.out.println("Table Created Successfully");
	        
	        stmt.close();
	        c.close();
	    }
	}

