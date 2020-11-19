package QuizHut;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author SHATTER
 */
public class SystemReg {
    //to connect into db
    DatabaseCon dbcon = new DatabaseCon();
    
    // function to check if the username already exist in database table
    public boolean checkUsername(String username)
    {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = "SELECT * FROM `user` WHERE `Name` =?";
        
        try {
            ps = dbcon.connection().prepareStatement(query);
            ps.setString(1, username);
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                checkUser = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
         return checkUser;
    }
    
    public Boolean reg(String name, String pass, String re_pass){
        if(name.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Add A Username");
        }
        
        else if(pass.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Add A Password");
        }
        else if(!pass.equals(re_pass))
        {
            JOptionPane.showMessageDialog(null, "Retype The Password Again");
        }
        
        else if(checkUsername(name))
        {
            JOptionPane.showMessageDialog(null, "This Username Already Exist");
        }
        
        else{
        
            try{
            //Encrypt Password
            EncNDec enc = new EncNDec();
            pass = enc.encrypt(pass);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.toString());
            }

            PreparedStatement ps;
            String query = "INSERT INTO `user`(`Name`, `Pass`) VALUES (?,?)";

            try {
                ps = dbcon.connection().prepareStatement(query);
                ps.setString(1, name);
                ps.setString(2, pass);
                
                if(ps.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, "Register Successful");
                    return true;
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
        return false;
    }
    
}
