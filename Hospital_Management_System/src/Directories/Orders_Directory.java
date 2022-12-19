/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.OperationRequest;
import Model.Orders;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Orders_Directory {
    
    private ArrayList<Orders> orderList;

    public Orders_Directory(ArrayList<Orders> orderList) {
        this.orderList = orderList;
    }
public Orders_Directory() {
        this.orderList = new ArrayList<Orders>();
    }
    public ArrayList<Orders> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Orders> orderList) {
        this.orderList = orderList;
    }
    
    
    
}
