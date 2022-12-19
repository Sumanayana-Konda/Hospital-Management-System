/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sumanayanakonda
 */
public class Operations {
    

    private int OperationTheaterNumber;
    private String Available;
    private String Clean;
    
    
    public int getOperationTheaterNumber() {
        return OperationTheaterNumber;
    }

    public void setOperationTheaterNumber(int OperationTheaterNumber) {
        this.OperationTheaterNumber = OperationTheaterNumber;
    }

    public String getAvailable() {
        return Available;
    }

    public void setAvailable(String Available) {
        this.Available = Available;
    }

    public String getClean() {
        return Clean;
    }

    public void setClean(String Clean) {
        this.Clean = Clean;
    }
    
    public String toString(){
        return Integer.toString(OperationTheaterNumber);
    }

    
    
    
}
