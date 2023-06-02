import java.sql.*;

public class jdbc {

    public static void main(String[] args) {
        try {
            // Load the JDBC driver for the database
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");

            // Create a statement to retrieve data from a table
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");

            // Print the results to the console
            while (rs.next()) {
                System.out.println(rs.getString("column1") + "\t" + rs.getString("column2"));
            }

            // Close the statement and connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
