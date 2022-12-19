/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.Bills;
import Roles.DepartmentManager;
import java.util.ArrayList;

/**
 *
 * @author sumanayanakonda
 */
public class DepartmentManagerDirectory {
    
    private ArrayList<DepartmentManager> deptmanagerList;

    public DepartmentManagerDirectory(ArrayList<DepartmentManager> deptmanagerList) {
        this.deptmanagerList = deptmanagerList;
    }
public DepartmentManagerDirectory() {
        this.deptmanagerList = new ArrayList<DepartmentManager>();
    }

    public ArrayList<DepartmentManager> getDeptmanagerList() {
        return deptmanagerList;
    }

    public void setDeptmanagerList(ArrayList<DepartmentManager> deptmanagerList) {
        this.deptmanagerList = deptmanagerList;
    }
    
}
