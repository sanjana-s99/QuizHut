package QuizHut;

import java.sql.*;
import javax.swing.JOptionPane;


public class QuizHutMain extends javax.swing.JFrame {

    public QuizHutMain() {
        initComponents();
        //populate combo box
        fillcmb();
    }
    
    public String name = null;
    public int uid = 0;
    
    public QuizHutMain(String Name, String uidd) {
        initComponents();
        fillcmb();
        name = Name;
        this.uid = Integer.parseInt(uidd);
        lblName.setText("Welcome : " + Name);
    }

    //get quizes from database
    public void fillcmb(){
        try{
            String query = "SELECT * FROM `quiz_name`";        
            DatabaseCon dbcon = new DatabaseCon();
            Statement mystm = dbcon.connection().createStatement();
            ResultSet rs = mystm.executeQuery(query);
            while(rs.next()){
                cmbQuiz.addItem(rs.getString("name"));
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PNLhome = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        SELECT_MODULE = new javax.swing.JLabel();
        cmbQuiz = new javax.swing.JComboBox<>();
        btnQuiz = new javax.swing.JButton();
        btnLB = new javax.swing.JButton();
        BUTlogout = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PNLhome.setBackground(new java.awt.Color(12, 11, 22));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        SELECT_MODULE.setForeground(new java.awt.Color(255, 255, 255));
        SELECT_MODULE.setText("SELECT MODULE");
        SELECT_MODULE.setToolTipText("");

        cmbQuiz.setBackground(new java.awt.Color(33, 30, 51));
        cmbQuiz.setEditable(true);
        cmbQuiz.setForeground(new java.awt.Color(255, 255, 255));

        btnQuiz.setBackground(new java.awt.Color(120, 109, 188));
        btnQuiz.setForeground(new java.awt.Color(255, 255, 255));
        btnQuiz.setText("START QUIZ");
        btnQuiz.setToolTipText("");
        btnQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizActionPerformed(evt);
            }
        });

        btnLB.setBackground(new java.awt.Color(120, 109, 188));
        btnLB.setForeground(new java.awt.Color(255, 255, 255));
        btnLB.setText("LEADERBOARD");
        btnLB.setToolTipText("");
        btnLB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLBActionPerformed(evt);
            }
        });

        BUTlogout.setBackground(new java.awt.Color(188, 109, 109));
        BUTlogout.setForeground(new java.awt.Color(255, 255, 255));
        BUTlogout.setText("LOGOUT");
        BUTlogout.setToolTipText("");
        BUTlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTlogoutActionPerformed(evt);
            }
        });

        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Welcome : ");
        lblName.setToolTipText("");

        javax.swing.GroupLayout PNLhomeLayout = new javax.swing.GroupLayout(PNLhome);
        PNLhome.setLayout(PNLhomeLayout);
        PNLhomeLayout.setHorizontalGroup(
            PNLhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNLhomeLayout.createSequentialGroup()
                .addContainerGap(303, Short.MAX_VALUE)
                .addGroup(PNLhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addGroup(PNLhomeLayout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegister))
                    .addComponent(BUTlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLB, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SELECT_MODULE))
                .addContainerGap(332, Short.MAX_VALUE))
        );
        PNLhomeLayout.setVerticalGroup(
            PNLhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNLhomeLayout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(lblName)
                .addGap(18, 18, 18)
                .addComponent(SELECT_MODULE)
                .addGap(18, 18, 18)
                .addComponent(cmbQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(PNLhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnRegister))
                .addGap(30, 30, 30)
                .addComponent(btnLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BUTlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNLhome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNLhome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Login
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // Reg
        this.dispose();
        new Register().setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizActionPerformed
        // Open Quiz
        int quiz = cmbQuiz.getSelectedIndex()+1;
        if(name==null){
            JOptionPane.showMessageDialog(rootPane, "Please Login First....");
        }
        else{
            try{
                new Quiz(name,uid,quiz).setVisible(true);
                this.dispose();
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "This Quiz Not Available Yet.....");
            }
        }
    }//GEN-LAST:event_btnQuizActionPerformed

    private void btnLBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLBActionPerformed
        // openlb
        if(name==null){
            JOptionPane.showMessageDialog(rootPane, "Please Login First....");
        }
        else{
            try{
                new HighScore(name,String.valueOf(uid)).setVisible(true);
                this.dispose();
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Error Loding Leaderboard.....");
            }
        }
    }//GEN-LAST:event_btnLBActionPerformed

    private void BUTlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTlogoutActionPerformed
        // logout
        this.dispose();
        new QuizHutMain().setVisible(true);
    }//GEN-LAST:event_BUTlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(QuizHutMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizHutMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizHutMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizHutMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizHutMain().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUTlogout;
    private javax.swing.JPanel PNLhome;
    private javax.swing.JLabel SELECT_MODULE;
    private javax.swing.JButton btnLB;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnQuiz;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbQuiz;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
