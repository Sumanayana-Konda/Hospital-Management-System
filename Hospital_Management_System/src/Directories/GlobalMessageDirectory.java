/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.GlobalMessage;
import Model.LocalMessage;
import Roles.Delivery_Man;
import java.util.ArrayList;

/**
 *
 * @author sonalibandi
 */
public class GlobalMessageDirectory {
    
    private ArrayList<GlobalMessage> GlobalMessageList;

    public GlobalMessageDirectory(ArrayList<GlobalMessage> GlobalMessageList) {
        this.GlobalMessageList = GlobalMessageList;
    }
public GlobalMessageDirectory() {
        this.GlobalMessageList = new ArrayList<GlobalMessage>();
    }
    public ArrayList<GlobalMessage> getGlobalMessageList() {
        return GlobalMessageList;
    }

    public void setGlobalMessageList(ArrayList<GlobalMessage> GlobalMessageList) {
        this.GlobalMessageList = GlobalMessageList;
    }
    
}
