package QuizHut;

import java.sql.*;

public class QuizQuistion {
    public int no, ans;
    
    public void setans(int no,int ans){
        this.no = no;
        this.ans = ans;
    }
    
    public String[] getquestion(int qno, int qid){
        String[] qna = new String[7];
        String query = "SELECT * FROM `"+qid+"` WHERE `qid` ="+qno;        
        DatabaseCon dbcon = new DatabaseCon();
        try {
            Statement mystm = dbcon.connection().createStatement();
            ResultSet rs = mystm.executeQuery(query);
            while(rs.next()){
                qna[0] = rs.getString("qid");
                qna[1] = rs.getString("question");
                qna[2] = rs.getString("ans1");
                qna[3] = rs.getString("ans2");
                qna[4] = rs.getString("ans3");
                qna[5] = rs.getString("ans4");
                qna[6] = rs.getString("correctans");
            }            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return qna;
    }
}
