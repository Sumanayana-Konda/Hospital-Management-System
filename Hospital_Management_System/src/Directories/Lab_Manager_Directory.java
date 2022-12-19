/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.Insurance_Request;
import Roles.Lab_Manager;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Lab_Manager_Directory {
    
    private ArrayList<Lab_Manager> labManagerList;

    public Lab_Manager_Directory(ArrayList<Lab_Manager> labManagerList) {
        this.labManagerList = labManagerList;
    }
public Lab_Manager_Directory() {
        this.labManagerList = new ArrayList<Lab_Manager>();
    }
    public ArrayList<Lab_Manager> getLabManagerList() {
        return labManagerList;
    }

    public void setLabManagerList(ArrayList<Lab_Manager> labManagerList) {
        this.labManagerList = labManagerList;
    }
    
    
    
}
