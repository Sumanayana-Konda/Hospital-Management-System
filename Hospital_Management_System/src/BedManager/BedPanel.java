/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package BedManager;

import Hospital.Ecosystem;
import Model.Beds;
import Roles.Bed_Manager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rutu
 */
public class BedPanel extends javax.swing.JPanel {
    Ecosystem ecoSystem;
    int rowNum;

    /**
     * Creates new form BedPanel
     */
    public BedPanel(Ecosystem ecoSystem, Bed_Manager bedmanager) {
        initComponents();
        this.ecoSystem = ecoSystem;
        populateBedsTable();
        populateBedsTable1();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bedsTable = new javax.swing.JTable();
        addBtn1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        bedNameTxt = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bedsTable1 = new javax.swing.JTable();
        viewBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bednametxt = new javax.swing.JTextPane();
        updateBtrn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        availability = new javax.swing.JComboBox<>();
        clean = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 204, 255));

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        bedsTable.setBackground(new java.awt.Color(153, 153, 255));
        bedsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Bedname", "Availability", "Clean"
            }
        ));
        jScrollPane1.setViewportView(bedsTable);

        addBtn1.setBackground(new java.awt.Color(153, 153, 255));
        addBtn1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        addBtn1.setText("Add");
        addBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setText("Bedname");

        bedNameTxt.setBackground(new java.awt.Color(153, 153, 255));
        jScrollPane5.setViewportView(bedNameTxt);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(addBtn1)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(addBtn1)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Beds Directory", jPanel1);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        bedsTable1.setBackground(new java.awt.Color(153, 153, 255));
        bedsTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Bedname", "Availability", "Clean"
            }
        ));
        jScrollPane2.setViewportView(bedsTable1);

        viewBtn.setBackground(new java.awt.Color(153, 153, 255));
        viewBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setText("Bedname");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("Availability");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("Clean");

        bednametxt.setBackground(new java.awt.Color(153, 153, 255));
        jScrollPane3.setViewportView(bednametxt);

        updateBtrn.setBackground(new java.awt.Color(153, 153, 255));
        updateBtrn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        updateBtrn.setText("Update");
        updateBtrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtrnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(153, 153, 255));
        deleteBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        availability.setBackground(new java.awt.Color(153, 153, 255));
        availability.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No", "Pending" }));

        clean.setBackground(new java.awt.Color(153, 153, 255));
        clean.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No", "Pending" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(updateBtrn)
                        .addGap(22, 22, 22)
                        .addComponent(deleteBtn))
                    .addComponent(jScrollPane3)
                    .addComponent(availability, 0, 173, Short.MAX_VALUE)
                    .addComponent(clean, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(viewBtn)))
                .addContainerGap(198, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(viewBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(availability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(clean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtrn)
                    .addComponent(deleteBtn))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Update/Delete", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn1ActionPerformed
        // TODO add your handling code here:
        for(Beds en : ecoSystem.getBeddir().getBedsList()){
            if(en.getBedName().equals(bedNameTxt.getText())){
                JOptionPane.showMessageDialog(this,"Bed already exists");
                return;
            }
                       
        }
        Beds ob = new Beds();
        ob.setBedName(bedNameTxt.getText());
        ob.setAvailable("Available");
        ob.setClean("Clean");
        
        ecoSystem.getBeddir().getBedsList().add(ob);
        bedNameTxt.setText("");
        
        populateBedsTable();
    }//GEN-LAST:event_addBtn1ActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        int selectRowIndex = bedsTable1.getSelectedRow();
        rowNum = selectRowIndex;
        
        if (selectRowIndex < 0){
            JOptionPane.showMessageDialog(this,"Select a row to view");
            return;        
        }
        DefaultTableModel model = (DefaultTableModel) bedsTable1.getModel();
        Beds selOp = (Beds)model.getValueAt(selectRowIndex, 0);
        
        bednametxt.setText(selOp.getBedName());
        availability.setSelectedItem(selOp.getAvailable());
        clean.setSelectedItem(selOp.getClean());
    }//GEN-LAST:event_viewBtnActionPerformed

    private void updateBtrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtrnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) bedsTable1.getModel();
        Beds ob = (Beds)model.getValueAt(rowNum, 0);
        
        if(bedsTable1.getSelectedRowCount() == 1){
            ob.setBedName(bednametxt.getText());
            ob.setAvailable(availability.getSelectedItem().toString());
            
            bednametxt.setText("");
            populateBedsTable1();
                       
        }
        
    }//GEN-LAST:event_updateBtrnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) bedsTable1.getModel();
        Beds ob = (Beds)model.getValueAt(rowNum, 0);
        
        ecoSystem.getBeddir().getBedsList().remove(ob);
        bednametxt.setText("");
        populateBedsTable1();
        populateBedsTable();
        
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn1;
    private javax.swing.JComboBox<String> availability;
    private javax.swing.JTextPane bedNameTxt;
    private javax.swing.JTextPane bednametxt;
    private javax.swing.JTable bedsTable;
    private javax.swing.JTable bedsTable1;
    private javax.swing.JComboBox<String> clean;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton updateBtrn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables

    private void populateBedsTable() {
        DefaultTableModel model = (DefaultTableModel) bedsTable.getModel();
        model.setRowCount(0);
        for(Beds en : ecoSystem.getBeddir().getBedsList()){
            Object[] row = new Object[3];
            row[0] = en;
            row[1] = en.getAvailable();
            row[2] = en.getClean();
            
            model.addRow(row);
        }
    }

    private void populateBedsTable1() {
        DefaultTableModel model = (DefaultTableModel) bedsTable1.getModel();
        model.setRowCount(0);
        for(Beds en : ecoSystem.getBeddir().getBedsList()){
            Object[] row = new Object[3];
            row[0] = en;
            row[1] = en.getAvailable();
            row[2] = en.getClean();
            
            model.addRow(row);
        }

    }
}
