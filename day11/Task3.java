package connection;
import java.sql.*;
public class Task3 {
	    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	    	
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        String url = "jdbc:mysql://localhost:3306/test";
		        String user = "root";
		        String pass = "";
		        
		        Connection c = DriverManager.getConnection(url, user, pass);
		        Statement stmt = c.createStatement();
		        
		        String query = "alter table ct drop age";
		        int no=stmt.executeUpdate(query);
		       
		        System.out.println("Execution Successfull!");
		        
		        stmt.close();
		        c.close();
	    }
	}

