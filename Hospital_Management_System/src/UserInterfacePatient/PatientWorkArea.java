/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterfacePatient;

import Hospital.Ecosystem;
import Model.Messages;
import Roles.Patient;
import UserInterface.Login;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rutu
 */
public class PatientWorkArea extends javax.swing.JPanel {
    Ecosystem ecoSystem;
    Patient patient;
    /**
     * Creates new form PatientWorkArea
     * @param ecoSystem
     * @param patient
     */
    public PatientWorkArea(Ecosystem  ecoSystem, Patient patient) {
        initComponents();
        this. ecoSystem= ecoSystem;
        this.patient = patient;
        populateGlobalTable();
        populateLocalTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        Details = new javax.swing.JButton();
        Appointments = new javax.swing.JButton();
        Doctors = new javax.swing.JButton();
        Reports = new javax.swing.JButton();
        Deliveries = new javax.swing.JButton();
        Insurance = new javax.swing.JButton();
        Payments = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        dash = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personalMsgTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        globalMsgTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Interstate Light", 1, 12)); // NOI18N
        jLabel1.setText("GLOBAL FORUM");

        jLabel2.setFont(new java.awt.Font("Interstate Light", 1, 12)); // NOI18N
        jLabel2.setText("GLOBAL FORUM");

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jButton3.setText("Appointments");

        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        Details.setBackground(new java.awt.Color(204, 204, 255));
        Details.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        Details.setText("Details");
        Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailsActionPerformed(evt);
            }
        });

        Appointments.setBackground(new java.awt.Color(204, 204, 255));
        Appointments.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        Appointments.setText("Appointments");
        Appointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppointmentsActionPerformed(evt);
            }
        });

        Doctors.setBackground(new java.awt.Color(204, 204, 255));
        Doctors.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        Doctors.setText("Doctors");
        Doctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorsActionPerformed(evt);
            }
        });

        Reports.setBackground(new java.awt.Color(204, 204, 255));
        Reports.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        Reports.setText("Reports");
        Reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportsActionPerformed(evt);
            }
        });

        Deliveries.setBackground(new java.awt.Color(204, 204, 255));
        Deliveries.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        Deliveries.setText("Bed Request");
        Deliveries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeliveriesActionPerformed(evt);
            }
        });

        Insurance.setBackground(new java.awt.Color(204, 204, 255));
        Insurance.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        Insurance.setText("Insurance");
        Insurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsuranceActionPerformed(evt);
            }
        });

        Payments.setBackground(new java.awt.Color(204, 204, 255));
        Payments.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        Payments.setText("Payments");
        Payments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentsActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterfacePatient/icons8-user-90.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setText("Patient");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/back-button.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jButton1.setText("Messages");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jButton5.setText("Dashboard");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(Details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Appointments, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Doctors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Payments, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Insurance, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Reports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Deliveries, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(jLabel7)
                                    .addComponent(jButton1)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Appointments, Deliveries, Details, Doctors, Insurance, Payments, Reports, jButton1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton2)
                .addGap(37, 37, 37)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(21, 21, 21)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Details)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Appointments)
                .addGap(17, 17, 17)
                .addComponent(Doctors)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Payments)
                .addGap(18, 18, 18)
                .addComponent(Insurance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Reports)
                .addGap(18, 18, 18)
                .addComponent(Deliveries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Appointments, Deliveries, Details, Doctors, Insurance, Payments, Reports});

        jSplitPane1.setLeftComponent(jPanel1);

        dash.setBackground(new java.awt.Color(204, 204, 255));

        personalMsgTable.setBackground(new java.awt.Color(153, 153, 255));
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

        globalMsgTable.setBackground(new java.awt.Color(153, 153, 255));
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

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jLabel3.setText("GLOBAL FORUM");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jLabel4.setText("PERSONAL FORUM");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setText("DASHBOARD");

        javax.swing.GroupLayout dashLayout = new javax.swing.GroupLayout(dash);
        dash.setLayout(dashLayout);
        dashLayout.setHorizontalGroup(
            dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashLayout.createSequentialGroup()
                .addGroup(dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel5))
                    .addGroup(dashLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dashLayout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel3))
                            .addGroup(dashLayout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jLabel4)))))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        dashLayout.setVerticalGroup(
            dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(dash);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailsActionPerformed
        // TODO add your handling code here:
        PatientDetails at = new PatientDetails( ecoSystem, patient); 
        jSplitPane1.setRightComponent(at);
    }//GEN-LAST:event_DetailsActionPerformed

    private void AppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppointmentsActionPerformed
        // TODO add your handling code here:
        AppointmentsPatient at = new AppointmentsPatient( ecoSystem, patient); 
        jSplitPane1.setRightComponent(at);
    }//GEN-LAST:event_AppointmentsActionPerformed

    private void DoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorsActionPerformed
        // TODO add your handling code here:
        DoctorsPatient at = new DoctorsPatient( ecoSystem); 
        jSplitPane1.setRightComponent(at);
    }//GEN-LAST:event_DoctorsActionPerformed

    private void PaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentsActionPerformed
        // TODO add your handling code here:
        PaymentPatient at = new PaymentPatient( ecoSystem, patient); 
        jSplitPane1.setRightComponent(at);
    }//GEN-LAST:event_PaymentsActionPerformed

    private void InsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsuranceActionPerformed
        // TODO add your handling code here:
         InsurancePatient at = new InsurancePatient( ecoSystem, patient); 
        jSplitPane1.setRightComponent(at);
    }//GEN-LAST:event_InsuranceActionPerformed

    private void ReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportsActionPerformed
        // TODO add your handling code here:
        ReportsPatient at = new ReportsPatient( ecoSystem, patient); 
        jSplitPane1.setRightComponent(at);
    }//GEN-LAST:event_ReportsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Login.dB4OUtil.storeSystem(ecoSystem);
        Login home = new Login();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        home.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DeliveriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeliveriesActionPerformed
        // TODO add your handling code here:
        BedReqPatient at = new BedReqPatient( ecoSystem,patient); 
        jSplitPane1.setRightComponent(at);
    }//GEN-LAST:event_DeliveriesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        patientMsgPanel ob = new patientMsgPanel(ecoSystem, patient);
        jSplitPane1.setRightComponent(ob);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        PatientWorkArea ob = new PatientWorkArea(ecoSystem, patient);
        jSplitPane1.setRightComponent(ob.dash);
    }//GEN-LAST:event_jButton5ActionPerformed

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
  
    private void populateLocalTable(){
        DefaultTableModel model = (DefaultTableModel) personalMsgTable.getModel();
          model.setRowCount(0);  
          for(Messages en : ecoSystem.getMessagesdir().getMessagesList())             
            {
                
               if(en.getType().equals("Personal") && en.getTo().getEmailId().equalsIgnoreCase(patient.getEmailId())){ 
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Appointments;
    private javax.swing.JButton Deliveries;
    private javax.swing.JButton Details;
    private javax.swing.JButton Doctors;
    private javax.swing.JButton Insurance;
    private javax.swing.JButton Payments;
    private javax.swing.JButton Reports;
    private javax.swing.JPanel dash;
    private javax.swing.JTable globalMsgTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable personalMsgTable;
    // End of variables declaration//GEN-END:variables
}
