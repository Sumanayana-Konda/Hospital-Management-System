/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Roles.Delivery_Man;
import Roles.Doctor;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Doctor_Directory {
    
    private ArrayList<Doctor> docList;

    public Doctor_Directory(ArrayList<Doctor> docList) {
        this.docList = docList;
    }
public Doctor_Directory() {
        this.docList = new ArrayList<Doctor>();
    }
    public ArrayList<Doctor> getDocList() {
        return docList;
    }

    public void setDocList(ArrayList<Doctor> docList) {
        this.docList = docList;
    }
    
    
    
    
}
