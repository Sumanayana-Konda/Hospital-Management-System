/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.Department;
import Roles.Delivery_Man;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Department_Directory {
    
    private ArrayList<Department> departmentList;

    public Department_Directory(ArrayList<Department> departmentList) {
        this.departmentList = departmentList;
    }
public Department_Directory() {
        this.departmentList = new ArrayList<Department>();
    }
    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(ArrayList<Department> departmentList) {
        this.departmentList = departmentList;
    }
    
    
    
    
    
}
