package basic_syntax.jdbcSyntax;

import java.sql.*;

public class ConnectionOfMysql {

    public static void main(String[] args) throws Exception {
        // Database credentials and URL
        String Driver = "com.mysql.cj.jdbc.Driver"; // MySQL JDBC driver class
        String url = "jdbc:mysql://localhost:3306/vicky"; // JDBC URL to connect to the 'vicky' database on localhost
        String username = "root"; // Username for the MySQL database
        String password = "vicky789"; // Password for the MySQL database
        
        // 1. Register the JDBC driver
        // This loads the MySQL JDBC driver into memory
        Class.forName(Driver);
        
        // 2. Establish the connection to the database
        // Using the DriverManager to get a connection to the database with the provided URL, username, and password
        Connection con = DriverManager.getConnection(url, username, password);
        
        // 3. Create a Statement object
        // Statement is used to execute SQL queries against the database
        Statement s = con.createStatement();
        
        // 4. Execute an SQL update query
        // This inserts a new record into the 'student' table with ID 1 and name 'santhosh'
        s.executeUpdate("INSERT INTO student VALUES (1, 'santhosh')");
        s.executeUpdate("INSERT INTO student VALUES (2, 'sobhan')");
        s.executeUpdate("INSERT INTO student VALUES (3, 'niha')");
        s.executeUpdate("INSERT INTO student VALUES (4, 'ksr')");
        
        // 5. Close the connection
        // Closing the connection to release database resources
        con.close();
    }
}
