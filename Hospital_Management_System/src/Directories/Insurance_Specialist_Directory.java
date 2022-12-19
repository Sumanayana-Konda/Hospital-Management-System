/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.Insurance_Request;
import Roles.InsuranceSpecialist;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Insurance_Specialist_Directory {
    
    private ArrayList<InsuranceSpecialist> insuranceSpecialistList;

    public Insurance_Specialist_Directory(ArrayList<InsuranceSpecialist> insuranceSpecialistList) {
        this.insuranceSpecialistList = insuranceSpecialistList;
    }
public Insurance_Specialist_Directory() {
        this.insuranceSpecialistList = new ArrayList<InsuranceSpecialist>();
    }
    public ArrayList<InsuranceSpecialist> getInsuranceSpecialistList() {
        return insuranceSpecialistList;
    }

    public void setInsuranceSpecialistList(ArrayList<InsuranceSpecialist> insuranceSpecialistList) {
        this.insuranceSpecialistList = insuranceSpecialistList;
    }
    
    
    
    
}
