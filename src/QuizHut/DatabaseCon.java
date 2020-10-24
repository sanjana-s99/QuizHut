package QuizHut;

import java.sql.*;
import javax.swing.JOptionPane;

public class DatabaseCon {
    public Connection connection(){
        Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/quizhut";
            String uname = "root";
            String pass = "";
            con = DriverManager.getConnection(url, uname, pass);
            return con;
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return null;    
        
    }
}
