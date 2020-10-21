/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizHut;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author SHATTER
 */
public class DatabaseCon {
    public Connection connection(){
        Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3300/quizhut";
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
