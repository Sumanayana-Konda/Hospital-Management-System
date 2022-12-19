/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.BedsRequest;
import Roles.Bed_Manager;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Beds_Booking_Directory {
    
    private ArrayList<BedsRequest> bedReqList;

    public Beds_Booking_Directory(ArrayList<BedsRequest> bedReqList) {
        this.bedReqList = bedReqList;
    }
    public Beds_Booking_Directory() {
        this.bedReqList = new ArrayList<BedsRequest>();
    }
    public ArrayList<BedsRequest> getBedReqList() {
        return bedReqList;
    }

    public void setBedReqList(ArrayList<BedsRequest> bedReqList) {
        this.bedReqList = bedReqList;
    }
    
    
    
    
    
}
