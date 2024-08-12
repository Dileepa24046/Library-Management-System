/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.coursework.view;

import edu.ijse.coursework.controller.BorrowController;
import edu.ijse.coursework.controller.ReturnController;
import edu.ijse.coursework.dto.ReturnDto;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sithum
 */
public class ReturnView extends javax.swing.JFrame {
    private final ReturnController  RETURN_CONTROLLER;
    private final BorrowController BORROW_CONTROLLER;

    /**
     * Creates new form ReturnView
     */
    public ReturnView() {
        this.RETURN_CONTROLLER=new ReturnController();
        this.BORROW_CONTROLLER=new BorrowController();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookIdLabel = new java.awt.Label();
        memberIdLabel = new java.awt.Label();
        issueDateLabel = new java.awt.Label();
        dueDateLabel = new java.awt.Label();
        searchButton = new java.awt.Button();
        placeReturnButton = new java.awt.Button();
        fineLabel = new java.awt.Label();
        fineDataLabel = new java.awt.Label();
        memberIdField = new javax.swing.JTextField();
        bookIdField = new javax.swing.JTextField();
        issueDateFileld = new javax.swing.JTextField();
        dueDateField = new javax.swing.JTextField();
        fineField = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));

        bookIdLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bookIdLabel.setText("Book ID");

        memberIdLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        memberIdLabel.setText("Member ID");

        issueDateLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        issueDateLabel.setText("Issue Date");

        dueDateLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dueDateLabel.setText("Due Date");

        searchButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        searchButton.setLabel("Search");
        searchButton.setName(""); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        placeReturnButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        placeReturnButton.setLabel("Place Return");
        placeReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeReturnButtonActionPerformed(evt);
            }
        });

        fineLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fineLabel.setText("Fine ");

        fineDataLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        memberIdField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        memberIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberIdFieldActionPerformed(evt);
            }
        });

        bookIdField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bookIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookIdFieldActionPerformed(evt);
            }
        });

        issueDateFileld.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        dueDateField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        fineField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fineField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fineFieldActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setText("Rs");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(placeReturnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fineDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bookIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(issueDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dueDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(memberIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(issueDateFileld)
                                            .addComponent(dueDateField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fineField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(bookIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(memberIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(31, 31, 31)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(memberIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(bookIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(issueDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                        .addComponent(memberIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(issueDateFileld, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dueDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dueDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fineField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(fineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76)
                .addComponent(fineDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(placeReturnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try {
            // TODO add your handling code here:
            getDetails();
        } catch (Exception ex) {
            Logger.getLogger(ReturnView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void memberIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memberIdFieldActionPerformed

    private void bookIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookIdFieldActionPerformed

    private void placeReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeReturnButtonActionPerformed
        try {
            // TODO add your handling code here:
            placeReturn();
        } catch (Exception ex) {
            Logger.getLogger(ReturnView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_placeReturnButtonActionPerformed

    private void fineFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fineFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fineFieldActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnView().setVisible(true);
            }
        });
    }
    
    public void getDetails()throws Exception{
        try {
            String memberId=memberIdField.getText();
            String bookId=bookIdField.getText();
            ReturnDto returnDto=RETURN_CONTROLLER.get(memberId,bookId);
            if (returnDto!=null){
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                
                issueDateFileld.setText(sdf.format(returnDto.getBoorowDate()));
                dueDateField.setText(sdf.format(returnDto.getDueDate()));
                double fine=returnDto.getFine();
                if (fine<0){
                    fine=0.0;
                }
                fineField.setText(Double.toString(fine));
                fineDataLabel.setText(sdf.format(returnDto.getReturningDate()));    
            }else{
                JOptionPane.showMessageDialog(this, "Incorrect  Details");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }
    
    public void placeReturn()throws Exception{
        try {
            ReturnDto dto=new ReturnDto();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            dto.setMemberId(memberIdField.getText());
            dto.setBookId(bookIdField.getText());
            dto.setBoorowDate(sdf.parse(issueDateFileld.getText()));
            dto.setDueDate(sdf.parse(dueDateField.getText()));
            dto.setReturningDate(sdf.parse(fineDataLabel.getText()));
            dto.setFine(Double.parseDouble(fineField.getText()));
            
            String rsp=RETURN_CONTROLLER.placeReturn(dto);
            JOptionPane.showMessageDialog(this, rsp);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookIdField;
    private java.awt.Label bookIdLabel;
    private javax.swing.JTextField dueDateField;
    private java.awt.Label dueDateLabel;
    private java.awt.Label fineDataLabel;
    private javax.swing.JTextField fineField;
    private java.awt.Label fineLabel;
    private javax.swing.JTextField issueDateFileld;
    private java.awt.Label issueDateLabel;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField memberIdField;
    private java.awt.Label memberIdLabel;
    private java.awt.Button placeReturnButton;
    private java.awt.Button searchButton;
    // End of variables declaration//GEN-END:variables
}
