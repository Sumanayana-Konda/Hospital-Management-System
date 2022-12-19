/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Roles.Patient;
import java.util.Date;


/**
 *
 * @author sumanayanakonda
 */
public class Lab_Reports {
    
    private Patient patient;
    private int HemogoblinLevels;
    private int BloodCount;
    private int EEG_Levels;
    private String BloodType;
    private int SugarLevels;
    private Date dateitsdone;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getDateitsdone() {
        return dateitsdone;
    }

    public void setDateitsdone(Date dateitsdone) {
        this.dateitsdone = dateitsdone;
    }
    
    


    public int getHemogoblinLevels() {
        return HemogoblinLevels;
    }

    public void setHemogoblinLevels(int HemogoblinLevels) {
        this.HemogoblinLevels = HemogoblinLevels;
    }

    public int getBloodCount() {
        return BloodCount;
    }

    public void setBloodCount(int BloodCount) {
        this.BloodCount = BloodCount;
    }

    public int getEEG_Levels() {
        return EEG_Levels;
    }

    public void setEEG_Levels(int EEG_Levels) {
        this.EEG_Levels = EEG_Levels;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    public int getSugarLevels() {
        return SugarLevels;
    }

    public void setSugarLevels(int SugarLevels) {
        this.SugarLevels = SugarLevels;
    }

    @Override
    public String toString() {
        return patient.getFirstName()+" "+patient.getLastName();
    }
    
    
    
}
