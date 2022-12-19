/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.Beds;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Beds_Directory {
    
    private ArrayList<Beds> bedsList;

    public Beds_Directory(ArrayList<Beds> bedsList) {
        this.bedsList = bedsList;
    }
public Beds_Directory() {
        this.bedsList = new ArrayList<>();
    }
    public ArrayList<Beds> getBedsList() {
        return bedsList;
    }

    public void setBedsList(ArrayList<Beds> bedsList) {
        this.bedsList = bedsList;
    }
    
    
    
    
}
