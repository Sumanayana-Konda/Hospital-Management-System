/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.Appointments;
import Model.BedsRequest;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Appointments_Directory {
    
    private ArrayList<Appointments> AppointmentList;

    public Appointments_Directory(ArrayList<Appointments> AppointmentList) {
        this.AppointmentList = AppointmentList;
    }
    public Appointments_Directory() {
        this.AppointmentList = new ArrayList<Appointments>();
    }
    public ArrayList<Appointments> getAppointmentList() {
        return AppointmentList;
    }

    public void setAppointmentList(ArrayList<Appointments> AppointmentList) {
        this.AppointmentList = AppointmentList;
    }
    
    
    
}
