/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizHut;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author SHATTER
 */
public class SystemLogin {
    public String login(String pass, String uname){
        PreparedStatement ps;
        ResultSet rs;
        String uid;
        
        try{
        //Encrypt Password to check
        EncNDec enc = new EncNDec();
        pass = enc.encrypt(pass);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        //check username and password
        String query = "SELECT * FROM `user` WHERE `Name` =? AND `Pass` =?";  
        DatabaseCon dbcon = new DatabaseCon();
        try {
            ps = dbcon.connection().prepareStatement(query);
            
            ps.setString(1, uname);
            ps.setString(2, pass);
            
            rs = ps.executeQuery();
            if(rs.next())
            {
                //if user exist return user id
                uid = rs.getString("uid");
                return uid;
            }
            else{
                    JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
                }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return null;
    }
    
}
