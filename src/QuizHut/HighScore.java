package QuizHut;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class HighScore extends javax.swing.JFrame {
    
    public String name , score, toname, touid;
    public int i, uid;
    DatabaseCon dbcon = new DatabaseCon();
    
    public HighScore() {
        initComponents();
    }

    public HighScore(String name, String uidd) {
        toname = name;
        touid = uidd;
        initComponents();
        dispData();
        //fill combo box with loading...
        fillcmb();
    }
    
    //get data for combo box
        public void fillcmb(){
        try{
            String query = "SELECT * FROM `quiz_name`";        
            Statement mystm = dbcon.connection().createStatement();
            ResultSet rs = mystm.executeQuery(query);
            while(rs.next()){
                cmbQuiz.addItem(rs.getString("name"));
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
    }
        
        //display high score users in table
    private void dispData(){
        i=1;
        DefaultTableModel tbl = (DefaultTableModel)tblRslt.getModel();
        tbl.setRowCount(0);
        int quizid =  cmbQuiz.getSelectedIndex()+1;
        String query = "SELECT * FROM `result` WHERE `quiz_id` ="+quizid+" order by score desc limit 10";
        try {
            Statement mystm = dbcon.connection().createStatement();
            ResultSet rs = mystm.executeQuery(query);
            while(rs.next()){
                uid = rs.getInt("uid");                
                name = getName(uid);
                score = rs.getString("score");
                
                //store data in array and put it on table
                String[] tbdata = {String.valueOf(i),name,score};
                tbl.addRow(tbdata);
                i++;
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
    }
    
    //get username from user id and return it
    public String getName(int uid){
        String query1 = "SELECT * FROM `user` WHERE `uid` ="+uid;        
            try {
                Statement mystm1 = dbcon.connection().createStatement();
                ResultSet rs1 = mystm1.executeQuery(query1);
                rs1.next();
                name = rs1.getString("name");
            }catch(SQLException e){
                System.out.println(e.toString());
            }
            return name;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRslt = new javax.swing.JTable();
        cmbQuiz = new javax.swing.JComboBox<>();
        BTNhome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUIZHUT-LEADERBOARD");

        jPanel1.setBackground(new java.awt.Color(12, 11, 22));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        tblRslt.setBackground(new java.awt.Color(32, 29, 58));
        tblRslt.setForeground(new java.awt.Color(255, 255, 255));
        tblRslt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Position", "Name", "Score"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRslt.setFocusable(false);
        tblRslt.setGridColor(new java.awt.Color(32, 29, 58));
        tblRslt.setSelectionBackground(new java.awt.Color(32, 29, 58));
        jScrollPane1.setViewportView(tblRslt);
        if (tblRslt.getColumnModel().getColumnCount() > 0) {
            tblRslt.getColumnModel().getColumn(2).setResizable(false);
        }

        cmbQuiz.setBackground(new java.awt.Color(12, 11, 22));
        cmbQuiz.setForeground(new java.awt.Color(255, 255, 255));
        cmbQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbQuizActionPerformed(evt);
            }
        });

        BTNhome.setBackground(new java.awt.Color(120, 109, 188));
        BTNhome.setForeground(new java.awt.Color(255, 255, 255));
        BTNhome.setText("Back to home");
        BTNhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNhomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTNhome, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(cmbQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTNhome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbQuizActionPerformed
        dispData();
    }//GEN-LAST:event_cmbQuizActionPerformed

    private void BTNhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNhomeActionPerformed
        new QuizHutMain(toname,touid).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTNhomeActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(HighScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HighScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HighScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HighScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HighScore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNhome;
    private javax.swing.JComboBox<String> cmbQuiz;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRslt;
    // End of variables declaration//GEN-END:variables
}
