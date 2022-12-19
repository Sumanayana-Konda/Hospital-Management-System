/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.Appointments;
import Model.Lab_Reports;
import Model.LocalMessage;
import java.util.ArrayList;

/**
 *
 * @author sonalibandi
 */
public class LocalMessagesDirectory {
    
    private ArrayList<LocalMessage> LocalMessageList;

    public LocalMessagesDirectory(ArrayList<LocalMessage> LocalMessageList) {
        this.LocalMessageList = LocalMessageList;
    }
public LocalMessagesDirectory() {
        this.LocalMessageList = new ArrayList<LocalMessage>();
    }
    public ArrayList<LocalMessage> getLocalMessageList() {
        return LocalMessageList;
    }

    public void setLocalMessageList(ArrayList<LocalMessage> LocalMessageList) {
        this.LocalMessageList = LocalMessageList;
    }
    
    
    
}
