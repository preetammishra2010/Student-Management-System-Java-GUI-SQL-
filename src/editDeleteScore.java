
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class editDeleteScore extends javax.swing.JFrame {

     Score s  = new Score();
    public editDeleteScore() 
    {
        initComponents();
        s.fillScoreJTable(jTableScoreTable);
        
        jTableScoreTable.setRowHeight(40);
        jTableScoreTable.setShowGrid(true);
        jTableScoreTable.setGridColor(Color.YELLOW);
        jTableScoreTable.setSelectionBackground(Color.BLUE);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPaneladdScore = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldScoreEdit = new javax.swing.JTextField();
        jButtonEditScore = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCourseIdEdit = new javax.swing.JTextField();
        jButtonAddScoreEdit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableScoreTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDescriptionEdit = new javax.swing.JTextField();
        jTextFieldStdIdEdit = new javax.swing.JTextField();
        jButtonRemoveScoreEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPaneladdScore.setBackground(new java.awt.Color(255, 204, 102));
        jPaneladdScore.setPreferredSize(new java.awt.Dimension(1280, 904));
        jPaneladdScore.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Score:");
        jPaneladdScore.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 225, 70, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Course Id:");
        jPaneladdScore.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 163, 110, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel6.setText("Manage Score");
        jPaneladdScore.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 300, -1));

        jTextFieldScoreEdit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPaneladdScore.add(jTextFieldScoreEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 200, -1));

        jButtonEditScore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEditScore.setIcon(new javax.swing.ImageIcon("D:\\Java_Files\\NetBeans\\Images\\icons8-maintenance-48.png")); // NOI18N
        jButtonEditScore.setText("Edit");
        jButtonEditScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditScoreActionPerformed(evt);
            }
        });
        jPaneladdScore.add(jButtonEditScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 160, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("Student Id:");
        jPaneladdScore.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 93, 120, 20));

        jTextFieldCourseIdEdit.setEditable(false);
        jTextFieldCourseIdEdit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPaneladdScore.add(jTextFieldCourseIdEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 200, -1));

        jButtonAddScoreEdit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAddScoreEdit.setIcon(new javax.swing.ImageIcon("D:\\Java_Files\\NetBeans\\Images\\plus.png")); // NOI18N
        jButtonAddScoreEdit.setText("Add");
        jButtonAddScoreEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddScoreEditActionPerformed(evt);
            }
        });
        jPaneladdScore.add(jButtonAddScoreEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 160, 50));

        jTableScoreTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student_ID", "Course_ID", "Score", "Description"
            }
        ));
        jTableScoreTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableScoreTableMouseClicked(evt);
            }
        });
        jTableScoreTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableScoreTableKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTableScoreTable);

        jPaneladdScore.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 680, 490));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Description:");
        jPaneladdScore.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 273, 130, 40));

        jTextFieldDescriptionEdit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPaneladdScore.add(jTextFieldDescriptionEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 200, -1));

        jTextFieldStdIdEdit.setEditable(false);
        jTextFieldStdIdEdit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPaneladdScore.add(jTextFieldStdIdEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 200, -1));

        jButtonRemoveScoreEdit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonRemoveScoreEdit.setIcon(new javax.swing.ImageIcon("D:\\Java_Files\\NetBeans\\Images\\delete.png")); // NOI18N
        jButtonRemoveScoreEdit.setText("Remove");
        jButtonRemoveScoreEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveScoreEditActionPerformed(evt);
            }
        });
        jPaneladdScore.add(jButtonRemoveScoreEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 160, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1380, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPaneladdScore, javax.swing.GroupLayout.PREFERRED_SIZE, 1380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPaneladdScore, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditScoreActionPerformed

           if(jTextFieldStdIdEdit.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Score not selected");
        }
                else
                {
                        int id  = Integer.valueOf(jTextFieldStdIdEdit.getText());
                        int cid = Integer.valueOf(jTextFieldCourseIdEdit.getText());
                        double score = Double.valueOf(jTextFieldScoreEdit.getText());
                        String description = jTextFieldDescriptionEdit.getText();
                        s.insertUpdateDeleteScore('u',id, cid,score,description);
                        jTableScoreTable.setModel(new DefaultTableModel(null,new Object[]{"StudentId","CourseId","StudentScore","Description"}));
                        s.fillScoreJTable(jTableScoreTable);
//                        jTextFieldStdIdEdit.setText("");
//                        jTextFieldCourseIdEdit.setText("");
//                        jTextFieldScoreEdit.setText("");
//                       jTextFieldDescriptionEdit.setText("");
    }//GEN-LAST:event_jButtonEditScoreActionPerformed
    }
    private void jButtonAddScoreEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddScoreEditActionPerformed

                addScore as = new addScore();
                as.setVisible(true);
                as.pack();
                as.setLocationRelativeTo(null);
                as.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonAddScoreEditActionPerformed

    private void jTableScoreTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableScoreTableMouseClicked
        int rowIndex = jTableScoreTable.getSelectedRow();
        jTextFieldStdIdEdit.setText(jTableScoreTable.getValueAt(rowIndex,0).toString());
        jTextFieldCourseIdEdit.setText(jTableScoreTable.getValueAt(rowIndex,1).toString());
        jTextFieldScoreEdit.setText(jTableScoreTable.getValueAt(rowIndex,2).toString());
        jTextFieldDescriptionEdit.setText(jTableScoreTable.getValueAt(rowIndex,3).toString());
    }//GEN-LAST:event_jTableScoreTableMouseClicked

    private void jTableScoreTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableScoreTableKeyReleased
                     int rowIndex = jTableScoreTable.getSelectedRow();
                       if(evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN)
                       {
                       rowIndex = jTableScoreTable.getSelectedRow();
                       jTextFieldStdIdEdit.setText(jTableScoreTable.getValueAt(rowIndex,0).toString());
                       jTextFieldCourseIdEdit.setText(jTableScoreTable.getValueAt(rowIndex,1).toString());
                       jTextFieldScoreEdit.setText(jTableScoreTable.getValueAt(rowIndex,2).toString());
                       jTextFieldDescriptionEdit.setText(jTableScoreTable.getValueAt(rowIndex,3).toString());
                       }
    }//GEN-LAST:event_jTableScoreTableKeyReleased

    private void jButtonRemoveScoreEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveScoreEditActionPerformed
            int id = Integer.valueOf(jTextFieldStdIdEdit.getText());
            int cid = Integer.valueOf(jTextFieldCourseIdEdit.getText());
        if(jTextFieldStdIdEdit.getText().equals(""))
          {
              JOptionPane.showMessageDialog(null,"Score not selected"); 
          }
          else
          {
              s.insertUpdateDeleteScore('d', id, cid, null, null);
              jTableScoreTable.setModel(new DefaultTableModel(null,new Object[]{"StudentId","CourseId","StudentScore","Description"}));
              s.fillScoreJTable(jTableScoreTable);
          }
        
    }//GEN-LAST:event_jButtonRemoveScoreEditActionPerformed

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
            java.util.logging.Logger.getLogger(editDeleteScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editDeleteScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editDeleteScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editDeleteScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editDeleteScore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddScoreEdit;
    private javax.swing.JButton jButtonEditScore;
    private javax.swing.JButton jButtonRemoveScoreEdit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPaneladdScore;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTableScoreTable;
    private javax.swing.JTextField jTextFieldCourseIdEdit;
    private javax.swing.JTextField jTextFieldDescriptionEdit;
    private javax.swing.JTextField jTextFieldScoreEdit;
    private javax.swing.JTextField jTextFieldStdIdEdit;
    // End of variables declaration//GEN-END:variables
}
