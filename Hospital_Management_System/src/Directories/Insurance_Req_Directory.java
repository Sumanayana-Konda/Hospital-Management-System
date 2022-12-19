/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.Insurance_Request;
import Roles.Delivery_Man;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Insurance_Req_Directory {
    
    private ArrayList<Insurance_Request> insuranceReqList;

    public Insurance_Req_Directory(ArrayList<Insurance_Request> insuranceReqList) {
        this.insuranceReqList = insuranceReqList;
    }
public Insurance_Req_Directory() {
        this.insuranceReqList = new ArrayList<Insurance_Request>();
    }
    public ArrayList<Insurance_Request> getInsuranceReqList() {
        return insuranceReqList;
    }

    public void setInsuranceReqList(ArrayList<Insurance_Request> insuranceReqList) {
        this.insuranceReqList = insuranceReqList;
    }
    
    
    
    
}
