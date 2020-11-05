package QuizHut;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class SaveUserData {
    //to connect into db
    DatabaseCon dbcon = new DatabaseCon();
    
    //check exiting quiz or not
    public boolean checkquiz(int uid, int qid)
    {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkquiz = false;
        String query = "SELECT * FROM `result` WHERE `uid` =? AND  `quiz_id` =?";
        
        try {
            ps = dbcon.connection().prepareStatement(query);
            ps.setString(1, String.valueOf(uid));
            ps.setString(2, String.valueOf(qid));
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                checkquiz = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
         return checkquiz;
    }
    
    public void saveRslt(int uid, int correct, int qid){
        //add updated score after first time
        if(checkquiz(uid, qid)){
            PreparedStatement ps;
            String query = "UPDATE `result` SET `score`= ? WHERE `uid` = ? AND `quiz_id` = ?";
            
             try {
                ps = dbcon.connection().prepareStatement(query);
                ps.setString(1, String.valueOf(correct*5));
                ps.setString(2, String.valueOf(uid));
                ps.setString(3, String.valueOf(qid));

                if(ps.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, "Quiz Sucessfully Finished with " + correct + " Correct Answers!!!" );
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        //add user score in first time
        }else{
            PreparedStatement ps;
            String query = "INSERT INTO `result` (`uid`,`quiz_id`,`score`) VALUES (?,?,?)";

            try {
                ps = dbcon.connection().prepareStatement(query);
                ps.setString(1, String.valueOf(uid));
                ps.setString(2, String.valueOf(qid));
                ps.setString(3, String.valueOf(correct*10));

                if(ps.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, "Quiz Sucessfully Finished with " + correct + " Correct Answers!!!" );
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
    }
}
