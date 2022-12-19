/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.Messages;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Messages_Directory {
    
    private ArrayList<Messages> messagesList;
    
    public Messages_Directory(){
        this.messagesList = new ArrayList<>();
    }

    public Messages_Directory(ArrayList<Messages> messagesList) {
        this.messagesList = messagesList;
    }
    
    public ArrayList<Messages> getMessagesList() {
        return messagesList;
    }

    public void setMessagesList(ArrayList<Messages> messagesList) {
        this.messagesList = messagesList;
    }
    
    
    
    
}
