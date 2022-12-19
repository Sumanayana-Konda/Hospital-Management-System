/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package OperationManager;

import Model.GlobalMessage;
import javax.swing.table.DefaultTableModel;
import Hospital.Ecosystem;
import Model.LocalMessage;
import Model.Messages;
import Model.Person;
import Roles.Operation_Manager;
import UserInterface.Login;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author sumanayanakonda
 */
public class OperationWorkArea extends javax.swing.JPanel {
    
    Ecosystem ecoSystem;
    Operation_Manager opManager;



    /**
     * Creates new form OperationWorkArea
     */
    public OperationWorkArea(Ecosystem ecoSystem, Operation_Manager opManager) {
        initComponents();
        this.ecoSystem=ecoSystem;
        this.opManager = opManager;
        populateGlobalTable();
        populatePersonalTable();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opManagerPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        detailsBtn = new javax.swing.JButton();
        reqBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Order = new javax.swing.JButton();
        dash = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        globalMsgTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personalMsgTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        detailsBtn.setBackground(new java.awt.Color(204, 204, 255));
        detailsBtn.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        detailsBtn.setText("Details");
        detailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsBtnActionPerformed(evt);
            }
        });

        reqBtn.setBackground(new java.awt.Color(204, 204, 255));
        reqBtn.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        reqBtn.setText("Requests");
        reqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqBtnActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/back-button.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton1.setText("Bills");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton2.setText("Dashboard");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton4.setText("Messages");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Order.setBackground(new java.awt.Color(204, 204, 255));
        Order.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        Order.setText("Order");
        Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton4)
                            .addComponent(detailsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reqBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(jButton1)
                            .addComponent(Order, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {detailsBtn, jButton1, reqBtn});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton2, jButton4});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(197, 197, 197)
                .addComponent(jButton2)
                .addGap(27, 27, 27)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(detailsBtn)
                .addGap(18, 18, 18)
                .addComponent(reqBtn)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(Order)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {detailsBtn, jButton1, jButton2, jButton4, reqBtn});

        opManagerPane.setLeftComponent(jPanel1);

        dash.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Interstate Light", 1, 12)); // NOI18N
        jLabel1.setText("GLOBAL FORUM");

        globalMsgTable.setBackground(new java.awt.Color(153, 153, 255));
        globalMsgTable.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        globalMsgTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "From", "Occupation", "Message"
            }
        ));
        jScrollPane2.setViewportView(globalMsgTable);

        jLabel2.setFont(new java.awt.Font("Interstate Light", 1, 12)); // NOI18N
        jLabel2.setText("PERSONAL FORUM");

        personalMsgTable.setBackground(new java.awt.Color(153, 153, 255));
        personalMsgTable.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        personalMsgTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "From", "Occupation", "Message"
            }
        ));
        jScrollPane1.setViewportView(personalMsgTable);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Dashboard");

        javax.swing.GroupLayout dashLayout = new javax.swing.GroupLayout(dash);
        dash.setLayout(dashLayout);
        dashLayout.setHorizontalGroup(
            dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashLayout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashLayout.createSequentialGroup()
                        .addGroup(dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashLayout.createSequentialGroup()
                        .addGroup(dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(222, 222, 222))))
        );
        dashLayout.setVerticalGroup(
            dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        opManagerPane.setRightComponent(dash);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opManagerPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opManagerPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void detailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsBtnActionPerformed
        // TODO add your handling code here:
        OperationManagerDetails detailsPanel = new OperationManagerDetails(ecoSystem, opManager);
        opManagerPane.setRightComponent(detailsPanel);
    }//GEN-LAST:event_detailsBtnActionPerformed

    private void reqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqBtnActionPerformed
        // TODO add your handling code here:
        RequestsWorkArea reqPanel = new RequestsWorkArea(ecoSystem);
        opManagerPane.setRightComponent(reqPanel);
    }//GEN-LAST:event_reqBtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Login.dB4OUtil.storeSystem(ecoSystem);
        Login home = new Login();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        home.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BillsOper reqPanel = new BillsOper(ecoSystem, opManager);
        opManagerPane.setRightComponent(reqPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        OperationWorkArea ob = new OperationWorkArea(ecoSystem, opManager);
        opManagerPane.setRightComponent(ob.dash);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        opMsgPanel ob = new opMsgPanel(ecoSystem, opManager);
        opManagerPane.setRightComponent(ob);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderActionPerformed
        // TODO add your handling code here:
        OrderJPanel ob = new OrderJPanel(ecoSystem, opManager);
        opManagerPane.setRightComponent(ob);
    }//GEN-LAST:event_OrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Order;
    private javax.swing.JPanel dash;
    private javax.swing.JButton detailsBtn;
    private javax.swing.JTable globalMsgTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane opManagerPane;
    private javax.swing.JTable personalMsgTable;
    private javax.swing.JButton reqBtn;
    // End of variables declaration//GEN-END:variables

    private void populateGlobalTable() {
        DefaultTableModel model = (DefaultTableModel) globalMsgTable.getModel();
          model.setRowCount(0);  
          for(Messages en : ecoSystem.getMessagesdir().getMessagesList())             
            {
                
               if(en.getType().equals("Global")){             
               Object[] row = new Object[3];
         
         //   row[1] = en.getDoctor().getFirstName()+""+en.getDoctor().getLastName();
         //   row[2] = en.getPatient().getFirstName()+""+en.getPatient().getLastName();  
               row[0] = en.getFrom().getFirstName()+" "+en.getFrom().getLastName();
               row[1] = en.getFrom().getRole();
               row[2] = en.getMessage();        
              
           
               model.addRow(row);
               }
            }        
    }

    private void populatePersonalTable() {
        DefaultTableModel model = (DefaultTableModel) personalMsgTable.getModel();
          model.setRowCount(0);  
          for(Messages en : ecoSystem.getMessagesdir().getMessagesList())             
            {
                
               if(en.getType().equals("Personal") && en.getTo().getEmailId().equalsIgnoreCase(opManager.getEmailId())){ 
               Object[] row = new Object[3];
         
         //   row[1] = en.getDoctor().getFirstName()+""+en.getDoctor().getLastName();
         //   row[2] = en.getPatient().getFirstName()+""+en.getPatient().getLastName();  
               row[0] = en.getFrom().getFirstName()+" "+en.getFrom().getLastName();
               row[1] = en.getFrom().getRole();
               row[2] = en.getMessage();        
              
           
               model.addRow(row);
               }
            }        
        
        
    }

    
    
    
    
    
    
    }
