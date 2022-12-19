/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sumanayanakonda
 */
public class Beds {
    private String BedName;
    private String Available;
    private String Clean;

    public String getBedName() {
        return BedName;
    }

    public void setBedName(String BedName) {
        this.BedName = BedName;
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

    @Override
    public String toString() {
        return BedName;
    }
    
    
    
    
    
}
