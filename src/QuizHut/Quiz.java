package QuizHut;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.Stack;
import javax.swing.*;

public class Quiz extends javax.swing.JFrame {
    
    QuizQuistion quiz = new QuizQuistion();
    SaveUserData save = new SaveUserData();
    
    //stack for shaffule questions un quiz
    private Stack<Integer> numbers = new Stack<>();
    
    Timer timer;
    int qNo=1, ans = 0, Sec = 60, correct = 0, wrong = 0, skip = 0, uid = 0, qid, qend=0, qcount;
    String[] qns = new String[7];
    
    public Quiz() {
        initComponents();
    }
    
    public Quiz(String name, int uidd, int qid){
        initComponents();
        lblname.setText("Welcome : " + name);
        this.uid = uidd;
        qcount = getqcount(qid);
        loadNumbers();
        //set question a with poping qestion number
        setquestion(nextInt(),qid);
        //set timer to count 60seconds
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Sec>0){
                    Sec--;
                }
                //display timer
                lblSec.setText(""+Sec);
                if(Sec==0){
                    //after 60sec get next question
                    question();
                }
            }
        });
        timer.start();
    }

    //to get quiestion numbers and shuffle
    private void loadNumbers(){
         for (int i=1;i<=qcount;i++){
                numbers.push(i);
            }
         Collections.shuffle(numbers);
    }
    public int nextInt(){
        if (numbers.empty()) loadNumbers();
        return numbers.pop();
    }
    
    //set question using questin no. and quiz_id
    public void setquestion(int qnoo, int qidd){
        this.qid = qidd;
        qns = quiz.getquestion(qnoo,qid);
        lblQno.setText("Question : " + (qend+1));
        lblQuestion.setText(qns[1]);
        radAns1.setText(qns[2]);
        radAns2.setText(qns[3]);
        radAns3.setText(qns[4]);
        radAns4.setText(qns[5]);
        qend++;
    }
    
    //get question count from database
    public int getqcount(int quiz_id){
        int count = 0;
        String query = "SELECT * FROM `quiz` WHERE `quiz_id` ="+quiz_id;        
        DatabaseCon dbcon = new DatabaseCon();
        try {
            Statement mystm = dbcon.connection().createStatement();
            ResultSet rs = mystm.executeQuery(query);
            while(rs.next())
                count = count+1;          
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return count;
    }
    
    //after time out or submition button clicked
    public void question(){
        //stop timer
        timer.stop();
        //count corrct answers
        if(ans==Integer. parseInt(qns[6]))
            correct++;
        //check if quiz reach end
        if(qend==getqcount(qid) || qend==20){
            //save resault in database
            save.saveRslt(uid,correct,qid);
            dispose();
            new QuizHutMain().setVisible(true);
        }
        //clear radio button selectino
        buttonGroup1.clearSelection();
        //set next question
        setquestion(nextInt(),qid);
        //reset timer
        Sec=60;
        //restart timer again
        timer.restart();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblQuestion = new javax.swing.JLabel();
        radAns1 = new javax.swing.JRadioButton();
        radAns2 = new javax.swing.JRadioButton();
        radAns3 = new javax.swing.JRadioButton();
        radAns4 = new javax.swing.JRadioButton();
        btnSubmit = new javax.swing.JButton();
        lblSec = new javax.swing.JLabel();
        lblQno = new javax.swing.JLabel();
        lblSelectOne = new javax.swing.JLabel();
        BTNhome = new javax.swing.JButton();
        lblname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(12, 11, 22));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        lblQuestion.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion.setText("Question");

        radAns1.setBackground(new java.awt.Color(32, 29, 58));
        buttonGroup1.add(radAns1);
        radAns1.setForeground(new java.awt.Color(255, 255, 255));
        radAns1.setText("Answer 1");
        radAns1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radAns1ActionPerformed(evt);
            }
        });

        radAns2.setBackground(new java.awt.Color(32, 29, 58));
        buttonGroup1.add(radAns2);
        radAns2.setForeground(new java.awt.Color(255, 255, 255));
        radAns2.setText("Answer 2");
        radAns2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radAns2ActionPerformed(evt);
            }
        });

        radAns3.setBackground(new java.awt.Color(32, 29, 58));
        buttonGroup1.add(radAns3);
        radAns3.setForeground(new java.awt.Color(255, 255, 255));
        radAns3.setText("Answer 3");
        radAns3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radAns3ActionPerformed(evt);
            }
        });

        radAns4.setBackground(new java.awt.Color(32, 29, 58));
        buttonGroup1.add(radAns4);
        radAns4.setForeground(new java.awt.Color(255, 255, 255));
        radAns4.setText("Answer 4");
        radAns4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radAns4ActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(120, 109, 188));
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblSec.setForeground(new java.awt.Color(255, 255, 255));
        lblSec.setText("60");

        lblQno.setForeground(new java.awt.Color(255, 255, 255));
        lblQno.setText("Question : ");

        lblSelectOne.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectOne.setText("Select One :");

        BTNhome.setBackground(new java.awt.Color(120, 109, 188));
        BTNhome.setForeground(new java.awt.Color(255, 255, 255));
        BTNhome.setText("Back to home");
        BTNhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNhomeActionPerformed(evt);
            }
        });

        lblname.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(695, Short.MAX_VALUE)
                .addComponent(lblname)
                .addGap(105, 105, 105))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSelectOne)
                    .addComponent(lblQno)
                    .addComponent(lblQuestion)
                    .addComponent(radAns1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addComponent(radAns2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radAns3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radAns4, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addComponent(lblSec)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNhome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblname)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblQno)
                .addGap(18, 18, 18)
                .addComponent(lblQuestion)
                .addGap(106, 106, 106)
                .addComponent(lblSelectOne)
                .addGap(18, 18, 18)
                .addComponent(radAns1)
                .addGap(18, 18, 18)
                .addComponent(radAns2)
                .addGap(18, 18, 18)
                .addComponent(radAns3)
                .addGap(18, 18, 18)
                .addComponent(radAns4)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblSec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNhome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        //call questin function to submit answer
        question();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void radAns1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radAns1ActionPerformed
        ans = 1;
    }//GEN-LAST:event_radAns1ActionPerformed

    private void radAns2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radAns2ActionPerformed
        ans = 2;
    }//GEN-LAST:event_radAns2ActionPerformed

    private void radAns3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radAns3ActionPerformed
        ans = 3;
    }//GEN-LAST:event_radAns3ActionPerformed

    private void radAns4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radAns4ActionPerformed
        ans = 4;
    }//GEN-LAST:event_radAns4ActionPerformed

    private void BTNhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNhomeActionPerformed
        new QuizHutMain(toname,touid).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTNhomeActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNhome;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblSec;
    private javax.swing.JLabel lblSelectOne;
    private javax.swing.JLabel lblname;
    private javax.swing.JRadioButton radAns1;
    private javax.swing.JRadioButton radAns2;
    private javax.swing.JRadioButton radAns3;
    private javax.swing.JRadioButton radAns4;
    // End of variables declaration//GEN-END:variables
}
