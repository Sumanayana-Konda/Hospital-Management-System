/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.OperationRequest;
import java.util.ArrayList;
import Roles.Operation_Manager;

/**
 *
 * @author Rutu
 */
public class Operations_Manager_Directory {
    
    private ArrayList<Operation_Manager> opManagerList;

    public Operations_Manager_Directory(ArrayList<Operation_Manager> opManagerList) {
        this.opManagerList = opManagerList;
    }
public Operations_Manager_Directory() {
        this.opManagerList = new ArrayList<Operation_Manager>();
    }
    public ArrayList<Operation_Manager> getOpManagerList() {
        return opManagerList;
    }

    public void setOpManagerList(ArrayList<Operation_Manager> opManagerList) {
        this.opManagerList = opManagerList;
    }
    
    
    
}
