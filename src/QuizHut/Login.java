package QuizHut;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PNLlogreg = new javax.swing.JPanel();
        USERNAME = new javax.swing.JLabel();
        TXTFuname = new javax.swing.JTextField();
        PASSWORD = new javax.swing.JLabel();
        TXTFpass = new javax.swing.JTextField();
        BUTlogin = new javax.swing.JButton();
        OR = new javax.swing.JLabel();
        BUTreg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUIZHUT- LOGIN");

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

        BUTlogin.setBackground(new java.awt.Color(120, 109, 188));
        BUTlogin.setForeground(new java.awt.Color(255, 255, 255));
        BUTlogin.setText("LOGIN");
        BUTlogin.setToolTipText("Click To Login");
        BUTlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTloginActionPerformed(evt);
            }
        });

        OR.setForeground(new java.awt.Color(255, 255, 255));
        OR.setText("OR");
        OR.setToolTipText("");

        BUTreg.setBackground(new java.awt.Color(120, 109, 188));
        BUTreg.setForeground(new java.awt.Color(255, 255, 255));
        BUTreg.setText("REGISTER");
        BUTreg.setToolTipText("Go To Registration");
        BUTreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTregActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PNLlogregLayout = new javax.swing.GroupLayout(PNLlogreg);
        PNLlogreg.setLayout(PNLlogregLayout);
        PNLlogregLayout.setHorizontalGroup(
            PNLlogregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNLlogregLayout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addGroup(PNLlogregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PNLlogregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(OR)
                        .addComponent(BUTlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TXTFpass, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PNLlogregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTFuname, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(USERNAME)))
                    .addComponent(BUTreg, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PASSWORD))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        PNLlogregLayout.setVerticalGroup(
            PNLlogregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNLlogregLayout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(USERNAME)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTFuname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PASSWORD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTFpass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(BUTlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(OR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BUTreg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNLlogreg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNLlogreg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTFunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTFunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTFunameActionPerformed

    private void TXTFpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTFpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTFpassActionPerformed

    private void BUTloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTloginActionPerformed
        // TO Login to system
        String uid = null;
        String uname = TXTFuname.getText();
        String pass = TXTFpass.getText();

        //create login object
        SystemLogin slog = new SystemLogin();
        try{
            //asign returned value to uid
            uid = slog.login(pass, uname);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());

        }finally{
            //if uid setted loged into system
            if(uid!=null){
                new QuizHutMain(uname,uid).setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_BUTloginActionPerformed

    private void BUTregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTregActionPerformed
        // Reg
        this.dispose();
        new Register().setVisible(true);
    }//GEN-LAST:event_BUTregActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUTlogin;
    private javax.swing.JButton BUTreg;
    private javax.swing.JLabel OR;
    private javax.swing.JLabel PASSWORD;
    private javax.swing.JPanel PNLlogreg;
    private javax.swing.JTextField TXTFpass;
    private javax.swing.JTextField TXTFuname;
    private javax.swing.JLabel USERNAME;
    // End of variables declaration//GEN-END:variables
}
