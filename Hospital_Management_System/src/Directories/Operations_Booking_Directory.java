/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.OperationRequest;
import Model.Operations;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Operations_Booking_Directory {
    
    private ArrayList<OperationRequest> opRequestList;

    public Operations_Booking_Directory(ArrayList<OperationRequest> opRequestList) {
        this.opRequestList = opRequestList;
    }
public Operations_Booking_Directory() {
        this.opRequestList = new ArrayList<OperationRequest>();
    }
    public ArrayList<OperationRequest> getOpRequestList() {
        return opRequestList;
    }

    public void setOpRequestList(ArrayList<OperationRequest> opRequestList) {
        this.opRequestList = opRequestList;
    }
    
    
    
    
}
