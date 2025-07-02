package connection;
import java.sql.*;
public class Task2 {
	    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        String url = "jdbc:mysql://localhost:3306/test";
	        String user = "root";
	        String pass = "";
	        
	        Connection c = DriverManager.getConnection(url, user, pass);
	        Statement stmt = c.createStatement();
	        
	        String query = "insert into ct values (1,'Aish',20),(2,'pooja',23),(3,'Alby',19),(4,'josh',25)";
	        int no=stmt.executeUpdate(query);
	       
	        System.out.println(no);
	        
	        stmt.close();
	        c.close();
	    }
	}

