/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;


import Roles.Volunteer;
import Roles.Volunteer_Manager;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Volunteer_Manager_Directory {
   
    private ArrayList<Volunteer_Manager> volunteerManagerList;

    public ArrayList<Volunteer_Manager> getVolunteerManagerList() {
        return volunteerManagerList;
    }
public Volunteer_Manager_Directory() {
        this.volunteerManagerList = new ArrayList<Volunteer_Manager>();
    }
    public void setVolunteerManagerList(ArrayList<Volunteer_Manager> volunteerManagerList) {
        this.volunteerManagerList = volunteerManagerList;
    }

    public Volunteer_Manager_Directory(ArrayList<Volunteer_Manager> volunteerManagerList) {
        this.volunteerManagerList = volunteerManagerList;
    }
    
    
    
}
