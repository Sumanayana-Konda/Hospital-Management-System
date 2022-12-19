/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Roles.Pharmacist;
import Roles.Volunteer;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Volunteer_Directory {
    
    private ArrayList<Volunteer> VolunteerList;

    public Volunteer_Directory(ArrayList<Volunteer> VolunteerList) {
        this.VolunteerList = VolunteerList;
    }
public Volunteer_Directory() {
        this.VolunteerList = new ArrayList<Volunteer>();
    }
    public ArrayList<Volunteer> getVolunteerList() {
        return VolunteerList;
    }

    public void setVolunteerList(ArrayList<Volunteer> VolunteerList) {
        this.VolunteerList = VolunteerList;
    }
    
    
    
}
