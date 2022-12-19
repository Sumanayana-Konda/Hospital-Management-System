/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Roles.Bed_Manager;
import Roles.Operation_Manager;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Bed_Manager_Directory {
    private ArrayList<Bed_Manager> bedManagerList;

    public Bed_Manager_Directory(ArrayList<Bed_Manager> bedManagerList) {
        this.bedManagerList = bedManagerList;
    }
public Bed_Manager_Directory() {
        this.bedManagerList = new ArrayList<Bed_Manager>();
    }
    public ArrayList<Bed_Manager> getBedManagerList() {
        return bedManagerList;
    }

    public void setBedManagerList(ArrayList<Bed_Manager> bedManagerList) {
        this.bedManagerList = bedManagerList;
    }
    
}
