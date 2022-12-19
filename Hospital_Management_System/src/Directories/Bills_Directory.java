/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.Bills;
import Roles.Bed_Manager;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Bills_Directory {
    
    private ArrayList<Bills> billsList;

    public Bills_Directory(ArrayList<Bills> billsList) {
        this.billsList = billsList;
    }
public Bills_Directory() {
        this.billsList = new ArrayList<Bills>();
    }
    public ArrayList<Bills> getBillsList() {
        return billsList;
    }

    public void setBillsList(ArrayList<Bills> billsList) {
        this.billsList = billsList;
    }
    
    
    
}
