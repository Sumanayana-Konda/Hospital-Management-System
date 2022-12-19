/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.Medicine;
import Model.Operations;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Operation_Room_Directory {
    
    private ArrayList<Operations> operationsList;

    public Operation_Room_Directory(ArrayList<Operations> operationsList) {
        this.operationsList = operationsList;
    }
public Operation_Room_Directory() {
        this.operationsList = new ArrayList<Operations>();
    }
    public ArrayList<Operations> getOperationsList() {
        return operationsList;
    }

    public void setOperationsList(ArrayList<Operations> operationsList) {
        this.operationsList = operationsList;
    }
    
    
    
    
}
