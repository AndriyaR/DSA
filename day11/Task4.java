package day12;

import java.sql.*;
import java.util.Scanner;


public class Task1 {
//Prepared Statement
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String pass = "";
        
        Connection c = DriverManager.getConnection(url, user, pass);
        Scanner sc =new Scanner(System.in);
       System.out.println("Enter the id:");
       int id=sc.nextInt();
       sc.nextLine();
       System.out.println("Enter the Name:");
       String name=sc.nextLine();
       System.out.println("Enter the age:");
       int age=sc.nextInt();
        
        String query = "insert into ct values (?,?,?)";
       PreparedStatement ps=c.prepareStatement(query);
       ps.setInt(1, id);
       ps.setString(2, name);
       ps.setInt(3, age);
        
       ps.execute();
       System.out.println("Execution Successfull!");
        ps.close();
        sc.close();
        c.close();
    }
}
