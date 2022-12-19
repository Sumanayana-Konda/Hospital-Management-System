/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.LocalMessage;
import Model.Medicine;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Medicine_Directory {
    
     private ArrayList<Medicine> MedicineList;

    public Medicine_Directory(ArrayList<Medicine> MedicineList) {
        this.MedicineList = MedicineList;
    }
public Medicine_Directory() {
        this.MedicineList = new ArrayList<Medicine>();
    }
    public ArrayList<Medicine> getMedicineList() {
        return MedicineList;
    }

    public void setMedicineList(ArrayList<Medicine> MedicineList) {
        this.MedicineList = MedicineList;
    }
    
    
    
}
