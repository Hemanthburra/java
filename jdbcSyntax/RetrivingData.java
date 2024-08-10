package basic_syntax.jdbcSyntax;

import java.sql.*;

public class RetrivingData {

    public static void main(String[] args) throws Exception {
        // Database credentials and URL
        String Driver = "com.mysql.cj.jdbc.Driver"; // MySQL JDBC driver class
        String url = "jdbc:mysql://localhost:3306/vicky"; // JDBC URL to connect to the 'vicky' database on localhost
        String username = "root"; // Username for the MySQL database
        String password = "vicky789"; // Password for the MySQL database
        
        // 1. Register the JDBC driver
        // This loads the MySQL JDBC driver into memory. It is necessary to be able to use the driver for connecting to the database.
        Class.forName(Driver);
        
        // 2. Establish the connection to the database
        // Using DriverManager to get a connection to the MySQL database using the provided URL, username, and password.
        Connection con = DriverManager.getConnection(url, username, password);
        
        // 3. Create a Statement object
        // Statement is used to execute SQL queries against the database.
        Statement s = con.createStatement();
        
        // 4. Execute an SQL query
        // Executes the SQL SELECT query to retrieve all records from the 'student' table.
        ResultSet res = s.executeQuery("SELECT * FROM student");
        
        // 5. Process the ResultSet
        // Iterate through the ResultSet to fetch and display each record from the 'student' table.
        while (res.next()) {
            // Retrieve and print the values of the columns in the current row
            // `res.getInt("rno")` retrieves the integer value from the column named "rno".
            // `res.getString("student_name")` retrieves the string value from the column named "student_name".
            System.out.println(res.getInt("rno") + " " + res.getString("student_name"));
            
            // `res.getInt(1)` retrieves the integer value from the first column in the current row.
            // `res.getString(2)` retrieves the string value from the second column in the current row.
            System.out.println(res.getInt(1) + " " + res.getString(2));
            
            /*
             * Example data in table:
             * 1 santhosh
             * 1 santhosh
             * 1 santhosh
             * 2 sobhan
             * 3 niha
             * 4 ksr
             */
        }
        
        // 6. Close the connection
        // Closing the connection to release database resources and avoid potential memory leaks.
        con.close();
    }
}
