/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VolunteerManager;

import Hospital.Ecosystem;
import Model.Messages;
import Payment.PaymentsRequests;
import Roles.Volunteer_Manager;
import UserInterface.Login;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sumanayanakonda
 */
public class VolunteerWorkArea extends javax.swing.JPanel {
    Ecosystem ecoSystem;
    Volunteer_Manager vman;

    /**
     * Creates new form VolunteerWorkArea
     */
    public VolunteerWorkArea(Ecosystem  ecoSystem, Volunteer_Manager vman) {
        initComponents();
        this. ecoSystem= ecoSystem;
        this.vman = vman;
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        dash = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        globalMsgTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personalMsgTable = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/back-button.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton1.setText("Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton2.setText("Volunteers");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton3.setText("Messages");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton4.setText("Dashboard");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addGap(95, 95, 95)
                .addComponent(jButton4)
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(471, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

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

        javax.swing.GroupLayout dashLayout = new javax.swing.GroupLayout(dash);
        dash.setLayout(dashLayout);
        dashLayout.setHorizontalGroup(
            dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        dashLayout.setVerticalGroup(
            dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jSplitPane1.setRightComponent(dash);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Login.dB4OUtil.storeSystem(ecoSystem);
        Login home = new Login();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        home.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VolunteerDetails at = new VolunteerDetails( ecoSystem, vman); 
        jSplitPane1.setRightComponent(at);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Volunteers at = new Volunteers( ecoSystem); 
        jSplitPane1.setRightComponent(at);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         volManMsgPanel at = new volManMsgPanel( ecoSystem, vman); 
        jSplitPane1.setRightComponent(at);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        VolunteerWorkArea ob = new VolunteerWorkArea(ecoSystem, vman);
        jSplitPane1.setRightComponent(ob.dash);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dash;
    private javax.swing.JTable globalMsgTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable personalMsgTable;
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
                
               if(en.getType().equals("Personal") && en.getTo().getEmailId().equalsIgnoreCase(vman.getEmailId())){ 
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
