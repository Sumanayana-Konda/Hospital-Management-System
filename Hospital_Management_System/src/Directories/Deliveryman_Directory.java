/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Roles.Bed_Manager;
import Roles.Delivery_Man;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Deliveryman_Directory {
    
    private ArrayList<Delivery_Man> delveryManList;

    public Deliveryman_Directory(ArrayList<Delivery_Man> delveryManList) {
        this.delveryManList = delveryManList;
    }
public Deliveryman_Directory() {
        this.delveryManList = new ArrayList<Delivery_Man>();
    }
    public ArrayList<Delivery_Man> getDelveryManList() {
        return delveryManList;
    }

    public void setDelveryManList(ArrayList<Delivery_Man> delveryManList) {
        this.delveryManList = delveryManList;
    }
    
    
    
    
    
}
