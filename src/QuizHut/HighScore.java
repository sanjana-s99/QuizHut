package QuizHut;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class HighScore extends javax.swing.JFrame {
    
    public String name , score;
    public int i, uid;
    DatabaseCon dbcon = new DatabaseCon();

    public HighScore() {
        initComponents();
        dispData(1);
    }
    
    public void dispData(int quid){
        i=1;
        DefaultTableModel tbl =  (DefaultTableModel)tblRslt.getModel();
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

        cmbQuiz = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRslt = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbQuiz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quiz 1", "Quiz 2", "Quiz 3" }));
        cmbQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbQuizActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(tblRslt);
        if (tblRslt.getColumnModel().getColumnCount() > 0) {
            tblRslt.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(cmbQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(cmbQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbQuizActionPerformed
        int qid = cmbQuiz.getSelectedIndex()+1;
        dispData(qid);
    }//GEN-LAST:event_cmbQuizActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HighScore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbQuiz;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRslt;
    // End of variables declaration//GEN-END:variables
}
