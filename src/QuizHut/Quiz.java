package QuizHut;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

public class Quiz extends javax.swing.JFrame {
    
    QuizQuistion quiz = new QuizQuistion();
    SaveUserData save = new SaveUserData();
    
    Timer timer;
    int qNo=1, ans = 0, Sec = 60, correct = 0, wrong = 0, skip = 0, uid = 0, qid;
    String[] qns = new String[7];
    
    public Quiz() {
        initComponents();
    }

    public void setquestion(int qnoo, int qidd){
        this.qid = qidd;
        qns = quiz.getquestion(qnoo,qid);
        lblQno.setText("Question : " + qns[0]);
        lblQuestion.setText(qns[1]);
        radAns1.setText(qns[2]);
        radAns2.setText(qns[3]);
        radAns3.setText(qns[4]);
        radAns4.setText(qns[5]);
    }
    
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
    
    public Quiz(String name, int uidd, int qid) {
        initComponents();
        this.uid = uidd;
        lblName.setText("Welcome : " + name);
        setquestion(qNo,qid);
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Sec>0){
                    Sec--;
                }
                lblSec.setText(""+Sec);
                if(Sec==0){
                    timer.stop();
                    if(ans==Integer. parseInt(qns[6]))
                        correct++;
                    if(qNo==getqcount(qid)){
                        save.saveRslt(uid,correct,qid);
                        dispose();
                        new QuizHutMain().setVisible(true);
                    }
                    qNo++;
                    buttonGroup1.clearSelection();
                    setquestion(qNo,qid);
                    Sec=60;
                    timer.restart();
                }
            }
        });
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblName = new javax.swing.JLabel();
        lblQuestion = new javax.swing.JLabel();
        radAns1 = new javax.swing.JRadioButton();
        radAns2 = new javax.swing.JRadioButton();
        radAns3 = new javax.swing.JRadioButton();
        radAns4 = new javax.swing.JRadioButton();
        btnSubmit = new javax.swing.JButton();
        lblSec = new javax.swing.JLabel();
        lblQno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setText("Welcome : ");

        lblQuestion.setText("Question");

        buttonGroup1.add(radAns1);
        radAns1.setText("Answer 1");
        radAns1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radAns1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radAns2);
        radAns2.setText("Answer 2");
        radAns2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radAns2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radAns3);
        radAns3.setText("Answer 3");
        radAns3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radAns3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radAns4);
        radAns4.setText("Answer 4");
        radAns4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radAns4ActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblSec.setText("60");

        lblQno.setText("Question : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radAns4)
                            .addComponent(radAns3)
                            .addComponent(radAns2)
                            .addComponent(radAns1)
                            .addComponent(lblQuestion)
                            .addComponent(lblName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(btnSubmit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSec)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQno)
                .addGap(95, 373, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblName)
                        .addGap(18, 18, 18)
                        .addComponent(lblQno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblQuestion)
                        .addGap(18, 18, 18)
                        .addComponent(radAns1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radAns2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radAns3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radAns4)
                        .addGap(18, 18, 18)
                        .addComponent(btnSubmit)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblSec)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        timer.stop();
        if(ans==Integer. parseInt(qns[6]))
            correct++;
        if(qNo==getqcount(qid)){
            save.saveRslt(uid,correct, qid);
            this.dispose();
            new QuizHutMain().setVisible(true);
        }
        qNo++;
        buttonGroup1.clearSelection();
        setquestion(qNo,qid);
        Sec=60;
        timer.restart();
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblSec;
    private javax.swing.JRadioButton radAns1;
    private javax.swing.JRadioButton radAns2;
    private javax.swing.JRadioButton radAns3;
    private javax.swing.JRadioButton radAns4;
    // End of variables declaration//GEN-END:variables
}
