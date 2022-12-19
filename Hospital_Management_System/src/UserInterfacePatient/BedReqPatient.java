/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterfacePatient;

import BedManager.Requests;
import Directories.Beds_Booking_Directory;
import Directories.Beds_Directory;
import Hospital.Ecosystem;
import Model.Beds;
import Model.BedsRequest;
import Model.Department;
import Model.Messages;
import Roles.Patient;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sumanayanakonda
 */
public class BedReqPatient extends javax.swing.JPanel {
    Ecosystem ecoSystem;
    Patient patient;
    /**
     * Creates new form BedReqPatient
     * @param ecoSystem
     * @param patient
     */
    public BedReqPatient(Ecosystem  ecoSystem, Patient patient) {
        initComponents();
        this. ecoSystem= ecoSystem;
        this.patient = patient;
        DefaultComboBoxModel cityModel = new DefaultComboBoxModel();
        for(Beds d:ecoSystem.getBeddir().getBedsList())
        { 
            if(d.getAvailable().equalsIgnoreCase("Yes")){
            cityModel.addElement(d.getBedName());}
        }
       
        bednameBox.setModel(cityModel);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        req = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bednameBox = new javax.swing.JComboBox<>();
        dat = new com.toedter.calendar.JDateChooser();
        reason = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Bed Request");

        req.setBackground(new java.awt.Color(153, 153, 255));
        req.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date its Required", "Inference", "Status", "Bed Name"
            }
        ));
        jScrollPane1.setViewportView(req);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("Bed Name:");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("Date its Required:");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setText("Reason:");

        bednameBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bednameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bednameBoxActionPerformed(evt);
            }
        });

        reason.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operation to be performed", "Minor Case", "Major case", "Others", " " }));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton1.setText("Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bednameBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(reason, 0, 233, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel1)))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(bednameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(dat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(reason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jButton1)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BedsRequest e = new BedsRequest();
        System.out.println(ecoSystem.getBeddir());
      //  Beds b = new Beds();
        if(ecoSystem.getBedsbookingdir()==null){
          //System.out.println(ecoSystem.getBeddir()==null);
            
          Beds_Booking_Directory bd = new Beds_Booking_Directory();
          ecoSystem.setBedsbookingdir(bd);
        }
        System.out.println(ecoSystem.getBeddir()==null);
        int count=0;
        
        for(Beds d:ecoSystem.getBeddir().getBedsList())
        { 
            if(d.getAvailable().equalsIgnoreCase("Yes")){
                count++;
            }
        }
        if(count==0){
            JOptionPane.showMessageDialog(this, "No beds available");
        }
      
        for(Beds b: ecoSystem.getBeddir().getBedsList()){
            if(b.getBedName().equals(bednameBox.getSelectedItem().toString())){
              e.setBed(b);
              e.setDateofOperation(dat.getDate());
              e.setInference(reason.getSelectedItem().toString());
              e.setPatient(patient);
              e.setStatus("Pending");
            }}
        
        System.out.println(ecoSystem.getBedsbookingdir().getBedReqList().size());
        ecoSystem.getBedsbookingdir().getBedReqList().add(e);
        
        
       
//        if(ecoSystem.getBedsbookingdir()==null){
//            
//            ArrayList<BedsRequest> bedReqList= new ArrayList<>();
//            bedReqList.add(e);
//            ecoSystem.getBedsbookingdir().setBedReqList(bedReqList);
//            
//        }
        
        
        populateLocalTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bednameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bednameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bednameBoxActionPerformed

private void populateLocalTable(){
        DefaultTableModel model = (DefaultTableModel) req.getModel();
          model.setRowCount(0);  
          if(ecoSystem.getBedsbookingdir()==null){
              return;
          }
          for(BedsRequest en : ecoSystem.getBedsbookingdir().getBedReqList())             
            {
                
               if(en.getPatient().getEmailId().equals(patient.getEmailId())){ 
               Object[] row = new Object[4];
 
               row[0] = en.getDateofOperation();
               row[1] = en.getInference();
               row[2] = en.getStatus(); 
               row[3] = en.getBed().getBedName();
              
           
               model.addRow(row);
               }
            }
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bednameBox;
    private com.toedter.calendar.JDateChooser dat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> reason;
    private javax.swing.JTable req;
    // End of variables declaration//GEN-END:variables
}