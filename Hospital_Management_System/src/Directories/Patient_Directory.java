/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Roles.Patient;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Patient_Directory {
    
     private ArrayList<Patient> patientList;

    public Patient_Directory(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
public Patient_Directory()
{
this.patientList = new ArrayList<Patient>();
}
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
     
     
}
