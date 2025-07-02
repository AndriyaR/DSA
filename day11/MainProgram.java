package connection;

import java.sql.*;

public class MainProgram {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String pass = "";
        
        Connection c = DriverManager.getConnection(url, user, pass);
        Statement stmt = c.createStatement();
        
        String query = "Select * from ct";
        ResultSet rs=stmt.executeQuery(query);
        while(rs.next()) {
        	  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        }
       
        stmt.close();
        c.close();
    }
}
