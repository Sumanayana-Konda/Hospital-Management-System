/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.Lab_Reports;
import Roles.Lab_Manager;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Lab_Reports_Directory {
    
    private ArrayList<Lab_Reports> labReportsList;

    public Lab_Reports_Directory(ArrayList<Lab_Reports> labReportsList) {
        this.labReportsList = labReportsList;
    }
    public Lab_Reports_Directory() {
        this.labReportsList = new ArrayList<Lab_Reports>();
    }
    public ArrayList<Lab_Reports> getLabReportsList() {
        return labReportsList;
    }

    public void setLabReportsList(ArrayList<Lab_Reports> labReportsList) {
        this.labReportsList = labReportsList;
    }
    
    
    
    
    
}
