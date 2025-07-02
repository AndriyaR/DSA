package connection;

import java.sql.*;
import java.util.Scanner;

public class PostAssignment {

    static final String URL = "jdbc:mysql://localhost:3306/test";
    static final String USER = "root";
    static final String PASS = "";

    public static void inventory() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Create Table");
            System.out.println("2. Insert Data");
            System.out.println("3. Drop 'age' Column");
            System.out.println("4. Display Table");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> createTable();
                case 2 -> insertData();
                case 3 -> alterTable();
                case 4 -> displayData();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option");
            }
        }
    }

    public static void createTable() throws SQLException {
        Connection c = DriverManager.getConnection(URL, USER, PASS);
        Statement stmt = c.createStatement();
        String query = "CREATE TABLE IF NOT EXISTS demo (id TINYINT, name VARCHAR(32), age INT)";
        stmt.executeUpdate(query);
        System.out.println("Table Created");
        stmt.close();
        c.close();
    }

    public static void insertData() throws SQLException {
        Connection c = DriverManager.getConnection(URL, USER, PASS);
        Statement stmt = c.createStatement();
        String query = "INSERT INTO demo VALUES (1,'Aish',20),(2,'pooja',23),(3,'Alby',19),(4,'josh',25)";
        int no = stmt.executeUpdate(query);
        System.out.println(no + " rows inserted");
        stmt.close();
        c.close();
    }

    public static void alterTable() throws SQLException {
        Connection c = DriverManager.getConnection(URL, USER, PASS);
        Statement stmt = c.createStatement();
        String query = "ALTER TABLE demo DROP COLUMN age";
        stmt.executeUpdate(query);
        System.out.println("Column Dropped");
        stmt.close();
        c.close();
    }

    public static void displayData() throws SQLException {
        Connection c = DriverManager.getConnection(URL, USER, PASS);
        Statement stmt = c.createStatement();
        String query = "SELECT * FROM demo";
        ResultSet rs = stmt.executeQuery(query);

        boolean hasData = false;
        while (rs.next()) {
            hasData = true;
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }

        if (!hasData) {
            System.out.println("Table is empty");
        }

        rs.close();
        stmt.close();
        c.close();
    }
   
    public static void main(String[] args) throws Exception {
        inventory();
        
    }
}
