/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.Payment;
import Roles.Pharmacist;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Pharmacist_Directory {
    
    private ArrayList<Pharmacist> pharmacistList;

    public Pharmacist_Directory(ArrayList<Pharmacist> pharmacistList) {
        this.pharmacistList = pharmacistList;
    }
public Pharmacist_Directory() {
        this.pharmacistList = new ArrayList<Pharmacist>();
    }
    public ArrayList<Pharmacist> getPharmacistList() {
        return pharmacistList;
    }

    public void setPharmacistList(ArrayList<Pharmacist> pharmacistList) {
        this.pharmacistList = pharmacistList;
    }
    
    
}
