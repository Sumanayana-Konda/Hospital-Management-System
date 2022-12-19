/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.Payment;
import Roles.Payment_Manager;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Payment_Manager_Directory {
    
    private ArrayList<Payment_Manager> paymentManagerList;

    public Payment_Manager_Directory(ArrayList<Payment_Manager> paymentManagerList) {
        this.paymentManagerList = paymentManagerList;
    }
public Payment_Manager_Directory() {
        this.paymentManagerList = new ArrayList<Payment_Manager>();
    }
    public ArrayList<Payment_Manager> getPaymentManagerList() {
        return paymentManagerList;
    }

    public void setPaymentManagerList(ArrayList<Payment_Manager> paymentManagerList) {
        this.paymentManagerList = paymentManagerList;
    }
    
    
    
    
}
