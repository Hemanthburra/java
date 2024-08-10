package basic_syntax.jdbcSyntax;

import java.sql.*;
import java.util.*;
import java.sql.DriverManager;

public class InsertingData {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/vicky"; // JDBC URL to connect to the 'vicky' database on localhost
        String username = "root"; // Username for the MySQL database
        String password = "vicky789"; // Password for the MySQL database
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the roll number: ");
        int rno = sc.nextInt();
        System.out.println("enter the student_name: ");
        String user = sc.next();
        
        
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,username, password);
		
		String query = "insert into student values (?,?)";
		//?,? -- > positional parameters
		// we use PreparedStatement for instead of Statement due to dynamic data entering into the table
		
		// using PreparedStatement the query goes to the database and waits for the values to perform the query
		
		PreparedStatement s = con.prepareStatement(query);
		// PreparedStatement is created now we set the values in the positional parameters
		s.setInt(1, rno);
		s.setString(2, user);
		s.executeUpdate();
		con.close();
		sc.close();
		
	}

}
