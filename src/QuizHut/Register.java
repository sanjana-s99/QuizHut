package QuizHut;

import java.sql.*;
import javax.swing.*;


public class Register extends javax.swing.JFrame {

    
    public Register() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< Updated upstream
        btnReg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnReg.setText("Register");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
=======
        PNLlogreg = new javax.swing.JPanel();
        USERNAME = new javax.swing.JLabel();
        TXTFuname = new javax.swing.JTextField();
        PASSWORD = new javax.swing.JLabel();
        TXTFpass = new javax.swing.JTextField();
        BUTreg = new javax.swing.JButton();
        TXTFpass1 = new javax.swing.JTextField();
        PASSWORD1 = new javax.swing.JLabel();
        OR = new javax.swing.JLabel();
        BUTreg1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PNLlogreg.setBackground(new java.awt.Color(12, 11, 22));
        PNLlogreg.setPreferredSize(new java.awt.Dimension(800, 600));

        USERNAME.setForeground(new java.awt.Color(255, 255, 255));
        USERNAME.setText("USERNAME");
        USERNAME.setToolTipText("");

        TXTFuname.setBackground(new java.awt.Color(33, 30, 51));
        TXTFuname.setForeground(new java.awt.Color(255, 255, 255));
        TXTFuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTFunameActionPerformed(evt);
            }
        });

        PASSWORD.setForeground(new java.awt.Color(255, 255, 255));
        PASSWORD.setText("PASSWORD");
        PASSWORD.setToolTipText("");

        TXTFpass.setBackground(new java.awt.Color(33, 30, 51));
        TXTFpass.setForeground(new java.awt.Color(255, 255, 255));
        TXTFpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTFpassActionPerformed(evt);
            }
        });

        BUTreg.setBackground(new java.awt.Color(120, 109, 188));
        BUTreg.setForeground(new java.awt.Color(255, 255, 255));
        BUTreg.setText("REGISTER");
        BUTreg.setToolTipText("");
        BUTreg.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> Stashed changes
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

<<<<<<< Updated upstream
=======
        TXTFpass1.setBackground(new java.awt.Color(33, 30, 51));
        TXTFpass1.setForeground(new java.awt.Color(255, 255, 255));
        TXTFpass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTFpass1ActionPerformed(evt);
            }
        });

        PASSWORD1.setForeground(new java.awt.Color(255, 255, 255));
        PASSWORD1.setText("RE-PASSWORD");
        PASSWORD1.setToolTipText("");

        OR.setForeground(new java.awt.Color(255, 255, 255));
        OR.setText("OR");
        OR.setToolTipText("");

        BUTreg1.setBackground(new java.awt.Color(120, 109, 188));
        BUTreg1.setForeground(new java.awt.Color(255, 255, 255));
        BUTreg1.setText("LOGIN");
        BUTreg1.setToolTipText("");
        BUTreg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTreg1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PNLlogregLayout = new javax.swing.GroupLayout(PNLlogreg);
        PNLlogreg.setLayout(PNLlogregLayout);
        PNLlogregLayout.setHorizontalGroup(
            PNLlogregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNLlogregLayout.createSequentialGroup()
                .addContainerGap(323, Short.MAX_VALUE)
                .addGroup(PNLlogregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OR)
                    .addComponent(BUTreg1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PNLlogregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(TXTFpass, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PNLlogregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTFuname, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(USERNAME))
                        .addGroup(PNLlogregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTFpass1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PASSWORD1)))
                    .addComponent(BUTreg, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PASSWORD))
                .addGap(317, 317, 317))
        );
        PNLlogregLayout.setVerticalGroup(
            PNLlogregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNLlogregLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(USERNAME)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTFuname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PASSWORD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTFpass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PASSWORD1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTFpass1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(BUTreg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BUTreg1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

>>>>>>> Stashed changes
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(btnReg)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(btnReg)
                .addGap(27, 27, 27))
        );

        btnReg.getAccessibleContext().setAccessibleName("btnReg");

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< Updated upstream
=======
    private void TXTFunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTFunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTFunameActionPerformed

    private void TXTFpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTFpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTFpassActionPerformed

    private void BUTregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTregActionPerformed
         // TO register to system
        String name = TXTFuname.getText();
        String pass = TXTFpass.getText();
        String re_pass = TXTFpass1.getText();
                
        SystemReg sreg = new SystemReg();
        if(sreg.reg(name, pass, re_pass)){
            this.dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_BUTregActionPerformed

    private void TXTFpass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTFpass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTFpass1ActionPerformed

    private void BUTreg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTreg1ActionPerformed
        // Reg
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_BUTreg1ActionPerformed

>>>>>>> Stashed changes
    
    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        // TO register to system
        String name = "Kasun";
        String pass = "kasun";
        String re_pass = "kasun";
                
        SystemReg sreg = new SystemReg();
        if(sreg.reg(name, pass, re_pass)){
            this.dispose();
            new Login().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Error!!");
        }
        
    }//GEN-LAST:event_btnRegActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< Updated upstream
    private javax.swing.JButton btnReg;
=======
    private javax.swing.JButton BUTreg;
    private javax.swing.JButton BUTreg1;
    private javax.swing.JLabel OR;
    private javax.swing.JLabel PASSWORD;
    private javax.swing.JLabel PASSWORD1;
    private javax.swing.JPanel PNLlogreg;
    private javax.swing.JTextField TXTFpass;
    private javax.swing.JTextField TXTFpass1;
    private javax.swing.JTextField TXTFuname;
    private javax.swing.JLabel USERNAME;
>>>>>>> Stashed changes
    // End of variables declaration//GEN-END:variables
}
