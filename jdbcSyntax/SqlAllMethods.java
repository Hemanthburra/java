package basic_syntax.jdbcSyntax;

import java.sql.*;

public class SqlAllMethods {
    // Main class to demonstrate DAO operations
    public static void main(String[] args) throws Exception {
        StudentDao dao = new StudentDao();
        dao.connect(); // Establish database connection
        
        // Retrieve and print student details
        Student s = dao.getStudent(1);
        System.out.println(s.sname);
        
        // Create a new student object and add to the database
        Student s2 = new Student();
        s2.rollno = 13;
        s2.sname = "Archana";
        dao.addStudent(s2);
    }
}

class StudentDao {
    Connection con = null;

    // Connect to the MySQL database
    public void connect() throws Exception {
        String url = "jdbc:mysql://localhost:3306/vicky";
        String username = "root";
        String password = "vicky789";
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, username, password);
    }

    // Retrieve student details by roll number
    public Student getStudent(int rollno) throws Exception {
        Student s1 = new Student();
        s1.rollno = rollno;
        String query = "SELECT student_name FROM student WHERE rno = " + rollno;
        Statement s = con.createStatement();
        ResultSet res = s.executeQuery(query);
        res.next();
        s1.sname = res.getString(1);
        return s1;
    }

    // Add a new student to the database
    public void addStudent(Student st) throws Exception {
        String query = "INSERT INTO student VALUES (?, ?)";
        PreparedStatement s = con.prepareStatement(query);
        s.setInt(1, st.rollno);
        s.setString(2, st.sname);
        s.executeUpdate();
    }
}

class Student {
    int rollno;
    String sname;
}
