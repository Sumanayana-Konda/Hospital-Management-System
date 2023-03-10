/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import BedManager.BedManagerWorkArea;
import DBUtil.DB4OUtil;
import DeliveryManager.DeliveryManWorkArea;
import DeliveryManager.WorkareaDeliverymanager;
import Department.DepartmentWorkArea;
import Doctor.DoctorWorkArea;
import Hospital.Ecosystem;
import static Hospital.Ecosystem.system;
import Insurance.InsuranceWorkArea;
import LabManager.LabWorkArea;
import OperationManager.OperationWorkArea;
import Payment.PaymentWorkArea;
import Pharmacist.PharmacistWorkArea;
import Roles.Bed_Manager;
import Roles.DeliveryManager;
import Roles.Delivery_Man;
import Roles.DepartmentManager;
import Roles.Doctor;
import Roles.InsuranceSpecialist;
import Roles.Lab_Manager;
import Roles.Operation_Manager;
import Roles.Patient;
import Roles.Payment_Manager;
import Roles.Pharmacist;
import Roles.Volunteer;
import Roles.Volunteer_Manager;
import SystemAdmin.SystemAdminWorkArea;
import UserInterfacePatient.PatientWorkArea;
import VolunteerManager.VolWorkArea;
import VolunteerManager.VolunteerWorkArea;
import javax.swing.JOptionPane;

/**
 *
 * @author sumanayanakonda
 */
public class Login extends javax.swing.JFrame {
Ecosystem ecoSystem;
Patient patient;
Doctor doc;
Bed_Manager bed;
DepartmentManager dept;
InsuranceSpecialist ins;
Lab_Manager lab;
Operation_Manager oper;
Payment_Manager pay;
Pharmacist phar;
Volunteer_Manager vol;
Volunteer vol1;
public static DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
       this.ecoSystem = dB4OUtil.retrieveSystem();
//        Ecosystem.setInstance(system);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        UserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Roles = new javax.swing.JComboBox<>();
        SignIn = new javax.swing.JButton();
        SignUp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/hospital.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Kohinoor Bangla", 1, 36)); // NOI18N
        jLabel4.setText("HOSPITAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(95, 95, 95))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        UserName.setBackground(new java.awt.Color(153, 153, 255));
        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/user.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/padlock.png"))); // NOI18N

        Roles.setBackground(new java.awt.Color(153, 153, 255));
        Roles.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        Roles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System Admin", "Patient", "Doctor", "Department Manager", "Operation Manager", "Lab Manager", "Finance Manager", "Bed Manager", "Pharmacist", "Insurance Specialist", "Delivery Manager", "Delivery Man", "Volunteer Manager", "Volunteer", " ", " " }));
        Roles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RolesActionPerformed(evt);
            }
        });

        SignIn.setBackground(new java.awt.Color(153, 153, 255));
        SignIn.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        SignIn.setText("Sign In");
        SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInActionPerformed(evt);
            }
        });

        SignUp.setBackground(new java.awt.Color(153, 153, 255));
        SignUp.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        SignUp.setText("Sign Up");
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Password.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(SignUp)
                        .addGap(176, 176, 176)
                        .addComponent(SignIn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Roles, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(228, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jButton1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(Roles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignUp)
                    .addComponent(SignIn))
                .addGap(74, 74, 74)
                .addComponent(jButton1)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameActionPerformed

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
        // TODO add your handling code here:
         if(Roles.getSelectedItem().toString().equals("Patient")){
            CreatePatient createPatientCmp = new CreatePatient( ecoSystem);
            this.setContentPane(createPatientCmp);
            this.invalidate();
            this.validate();
        }
        else{
            JOptionPane.showMessageDialog(this, "Please Contact Admin for Sign Up!");
        }
    }//GEN-LAST:event_SignUpActionPerformed

    private void RolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RolesActionPerformed
        // TODO add your handling code here:
         if (Roles.getSelectedItem().toString() == "Patient") {
            SignUp.setEnabled(true);
        } else {
            SignUp.setEnabled(false);
        }
    }//GEN-LAST:event_RolesActionPerformed

    private void SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInActionPerformed
        // TODO add your handling code here:
        if(UserName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter valid username.");
        }
        else if(!Password.isValid()){
            JOptionPane.showMessageDialog(this, "Please enter valid password.");
        }
        else if(Roles.getSelectedItem().toString().equals("Patient")){
             for(Patient patient : ecoSystem.getPatientdir().getPatientList()){
            if(UserName.getText().equals(patient.getEmailId()) && Password.getText().equals(patient.getPassword())){
                 PatientWorkArea patWrkArea = new PatientWorkArea( ecoSystem, patient);
                this.setContentPane(patWrkArea);
                this.invalidate();
                this.validate();
            }
            
        }}
        else if(Roles.getSelectedItem().toString().equals("Doctor")){
             for(Doctor doc : ecoSystem.getDocdir().getDocList()){
            if(UserName.getText().equals(doc.getEmailId()) && Password.getText().equals(doc.getPassword())){
                 DoctorWorkArea patWrkArea = new DoctorWorkArea( ecoSystem, doc);
                this.setContentPane(patWrkArea);
                this.invalidate();
                this.validate();
            }
            
        }}
        else if(Roles.getSelectedItem().toString().equals("System Admin")){
           
            if(UserName.getText().equals("sysadmin") && Password.getText().equals("sysadmin")){
                 SystemAdminWorkArea patWrkArea = new SystemAdminWorkArea(this.ecoSystem);
                this.setContentPane(patWrkArea);
                this.invalidate();
                this.validate();
            
            
        }
    }
        else if(Roles.getSelectedItem().toString().equals("Bed Manager")){
             for(Bed_Manager bed : ecoSystem.getBedmanagerdir().getBedManagerList()){
            if(UserName.getText().equals(bed.getEmailId()) && Password.getText().equals(bed.getPassword())){
                BedManagerWorkArea patWrkArea = new BedManagerWorkArea( ecoSystem, bed);
                this.setContentPane(patWrkArea);
                this.invalidate();
                this.validate();
            }
            
        }}
        else if(Roles.getSelectedItem().toString().equals("Department Manager")){
             for(DepartmentManager dept : ecoSystem.getDeptmanagerdir().getDeptmanagerList()){
            if(UserName.getText().equals(dept.getEmailId()) && Password.getText().equals(dept.getPassword())){
                DepartmentWorkArea patWrkArea = new DepartmentWorkArea( ecoSystem, dept);
                this.setContentPane(patWrkArea);
                this.invalidate();
                this.validate();
            }
            
        }}
        else if(Roles.getSelectedItem().toString().equals("Insurance Specialist")){
             for(InsuranceSpecialist ins : ecoSystem.getInsurancespecialist().getInsuranceSpecialistList()){
            if(UserName.getText().equals(ins.getEmailId()) && Password.getText().equals(ins.getPassword())){
                InsuranceWorkArea patWrkArea = new InsuranceWorkArea( ecoSystem, ins);
                this.setContentPane(patWrkArea);
                this.invalidate();
                this.validate();
            }
            
        }}
        else if(Roles.getSelectedItem().toString().equals("Lab Manager")){
             for(Lab_Manager lab : ecoSystem.getLabmanagerdir().getLabManagerList()){
            if(UserName.getText().equals(lab.getEmailId()) && Password.getText().equals(lab.getPassword())){
                 LabWorkArea patWrkArea = new LabWorkArea( ecoSystem, lab);
                this.setContentPane(patWrkArea);
                this.invalidate();
                this.validate();
            }
            
        }}
        else if(Roles.getSelectedItem().toString().equals("Operation Manager")){
             for(Operation_Manager oper : ecoSystem.getOperationmanagerdir().getOpManagerList()){
            if(UserName.getText().equals(oper.getEmailId()) && Password.getText().equals(oper.getPassword())){
                OperationWorkArea patWrkArea = new OperationWorkArea( ecoSystem, oper);
                this.setContentPane(patWrkArea);
                this.invalidate();
                this.validate();
            }
            
        }}
         else if(Roles.getSelectedItem().toString().equals("Finance Manager")){
             for(Payment_Manager pay : ecoSystem.getPaymentmanager().getPaymentManagerList()){
            if(UserName.getText().equals(pay.getEmailId()) && Password.getText().equals(pay.getPassword())){
                PaymentWorkArea patWrkArea = new PaymentWorkArea( ecoSystem, pay);
                this.setContentPane(patWrkArea);
                this.invalidate();
                this.validate();
            }
            
        }}
         else if(Roles.getSelectedItem().toString().equals("Pharmacist")){
             for(Pharmacist phar : ecoSystem.getPharmacist().getPharmacistList()){
            if(UserName.getText().equals(phar.getEmailId()) && Password.getText().equals(phar.getPassword())){
                PharmacistWorkArea patWrkArea = new PharmacistWorkArea( ecoSystem, phar);
                this.setContentPane(patWrkArea);
                this.invalidate();
                this.validate();
            }
            
        }}
         
         else if(Roles.getSelectedItem().toString().equals("Volunteer Manager")){
             for(Volunteer_Manager vol : ecoSystem.getVolunteermanagerdir().getVolunteerManagerList()){
            if(UserName.getText().equals(vol.getEmailId()) && Password.getText().equals(vol.getPassword())){
                VolunteerWorkArea patWrkArea = new VolunteerWorkArea( ecoSystem, vol);
                this.setContentPane(patWrkArea);
                this.invalidate();
                this.validate();
            }
            
        }}
         else if(Roles.getSelectedItem().toString().equals("Volunteer")){
             for(Volunteer vol1 : ecoSystem.getVolunteerdir().getVolunteerList()){
            if(UserName.getText().equals(vol1.getEmailId()) && Password.getText().equals(vol1.getPassword())){
                VolWorkArea patWrkArea = new VolWorkArea( ecoSystem, vol1);
                this.setContentPane(patWrkArea);
                this.invalidate();
                this.validate();
            }
            
        }}
         else if(Roles.getSelectedItem().toString().equals("Delivery Man")){
             for(Delivery_Man dman : ecoSystem.getDeliverymandir().getDelveryManList()){
            if(UserName.getText().equals(dman.getEmailId()) && Password.getText().equals(dman.getPassword())){
                DeliveryManWorkArea patWrkArea = new DeliveryManWorkArea( ecoSystem, dman);
                this.setContentPane(patWrkArea);
                this.invalidate();
                this.validate();
            }
            
        }}
          else if(Roles.getSelectedItem().toString().equals("Delivery Manager")){
             for(DeliveryManager del : ecoSystem.getDeliverymanagerdir().getDeliveryManagerList()){
            if(UserName.getText().equals(del.getEmailId()) && Password.getText().equals(del.getPassword())){
                WorkareaDeliverymanager patWrkArea = new WorkareaDeliverymanager( ecoSystem, del);
                this.setContentPane(patWrkArea);
                this.invalidate();
                this.validate();
            }
            
        }}
        else{
               
                
                JOptionPane.showMessageDialog(this, "Login Failed, please enter valid credentials.");
            }
    }//GEN-LAST:event_SignInActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dB4OUtil.storeSystem(ecoSystem);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JComboBox<String> Roles;
    private javax.swing.JButton SignIn;
    private javax.swing.JButton SignUp;
    private javax.swing.JTextField UserName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
