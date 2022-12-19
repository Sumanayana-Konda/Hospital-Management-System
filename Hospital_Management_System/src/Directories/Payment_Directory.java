/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.Bills;
import Model.Orders;
import Model.Payment;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Payment_Directory {
     private ArrayList<Payment> paymentList;

    public Payment_Directory(ArrayList<Payment> billsList) {
        this.paymentList = billsList;
    }
public Payment_Directory() {
        this.paymentList = new ArrayList<Payment>();
    }
    public ArrayList<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(ArrayList<Payment> paymentList) {
        this.paymentList = paymentList;
    }
    
}
