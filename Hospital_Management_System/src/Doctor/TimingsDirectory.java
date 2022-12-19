/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import Model.Bills;
import java.util.ArrayList;

/**
 *
 * @author sumanayanakonda
 */
public class TimingsDirectory {
    private ArrayList<Timings> TimingList;

    public TimingsDirectory(ArrayList<Timings> TimingList) {
        this.TimingList = TimingList;
    }
public TimingsDirectory() {
        this.TimingList = new ArrayList<Timings>();
    }
    public ArrayList<Timings> getTimingList() {
        return TimingList;
    }

    public void setTimingList(ArrayList<Timings> TimingList) {
        this.TimingList = TimingList;
    }
    
}
