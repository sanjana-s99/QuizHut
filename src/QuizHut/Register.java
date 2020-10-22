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

        btnReg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnReg.setText("Register");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

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
            JOptionPane.showMessageDialog(rootPane, ex.toString());
        }
         return checkUser;
    }
    
    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        // TO register to system
        String name = "Manuja";
        String pass = "manuja";
        String re_pass = "manuja";
                
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
        
        /*if(jDateChooser_BDATE.getDate() != null)
        {
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            bdate = dateformat.format(jDateChooser_BDATE.getDate());
        }*/
        
        try{
        //Encrypt Password
        EncNDec enc = new EncNDec();
        pass = enc.encrypt(pass);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
        
        PreparedStatement ps;
        String query = "INSERT INTO `user`(`Name`, `Pass`) VALUES (?,?)";
        
        try {
            ps = dbcon.connection().prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, pass);
           /* if(bdate != null)
            {
             ps.setString(5, bdate);
            }else{
                ps.setNull(5, 0);
            }
            ps.setString(6, address);
            */
            if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "Register Successful");
                this.dispose();
                new Login().setVisible(true);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString());
        }
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
    private javax.swing.JButton btnReg;
    // End of variables declaration//GEN-END:variables
}
