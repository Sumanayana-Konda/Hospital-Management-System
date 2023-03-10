/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package OperationManager;

import Hospital.Ecosystem;
import Model.Orders;
import Roles.Delivery_Man;
import Roles.Operation_Manager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sumanayanakonda
 */
public class OrderJPanel extends javax.swing.JPanel {
Ecosystem ecoSystem;
Operation_Manager opManager;
    /**
     * Creates new form OrderJPanel
     */
    public OrderJPanel(Ecosystem ecoSystem, Operation_Manager opManager) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.opManager= opManager;
        TableFilling1();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        order = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        type = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        order.setBackground(new java.awt.Color(153, 153, 255));
        order.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Order Name", "Order Status", "Delivery Man", "Order Type", "Buyer Name", "Buyer Address", "Zipcode"
            }
        ));
        jScrollPane2.setViewportView(order);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delivery History", jPanel1);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Order Name:");

        jLabel2.setText("Order Amount:");

        jLabel3.setText("Order Type:");

        name.setBackground(new java.awt.Color(153, 153, 255));

        amount.setBackground(new java.awt.Color(153, 153, 255));

        type.setBackground(new java.awt.Color(153, 153, 255));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(amount)
                            .addComponent(type)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jButton1)))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jButton1)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Create Delivery", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Orders e = new Orders();
        e.setAmount(Integer.valueOf(amount.getText()));
        e.setOrderName(name.getText());
        e.setOrderStatus("Pending");
        e.setPerson(opManager);
        Delivery_Man deliveryman = new Delivery_Man();
        e.setDeliveryman(deliveryman);
        ecoSystem.getOrdersdir().getOrderList().add(e);
        TableFilling1();
    }//GEN-LAST:event_jButton1ActionPerformed
 private void TableFilling1() {
  
     DefaultTableModel model = (DefaultTableModel) order.getModel();
        model.setRowCount(0);
        
        for(Orders en : ecoSystem.getOrdersdir().getOrderList())             
            {
                  if(en.getPerson().getEmailId().equals(opManager.getEmailId())){        
            Object[] row = new Object[8];

               row[0] = en.getOrderName();
               row[1] = en.getOrderStatus();
               row[2] = en.getDeliveryman().getFirstName()+" "+en.getDeliveryman().getLastName();
               row[3] = en.getOrderType();
               row[4] = en.getPerson().getFirstName()+" "+en.getPerson().getLastName();
               row[5] = en.getPerson().getHouse().getAddressLine1()+", "+en.getPerson().getHouse().getAddressLine2();
               row[6] = en.getPerson().getHouse().getZipCode();
              
              
            model.addRow(row);}
            }   
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTable order;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
