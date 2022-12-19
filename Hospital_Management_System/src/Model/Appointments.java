/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Roles.Doctor;
import Roles.Patient;
import java.util.Date;

/**
 *
 * @author sumanayanakonda
 */
public class Appointments {
    private Patient patient;
    private String Temperature;
    private String BloodPressure;
    private String diagnosis;
    private Doctor doctor;
    private Date encounterDate;
    private int Weight;
    private int Height;
    
    public Appointments(Date encounterDate,String Temperature, String BloodPressure,int Weight, int Height, String diagnosis, Patient patient, Doctor doctor) {
       
        this.encounterDate = encounterDate;
        this.Temperature = Temperature;
        this.BloodPressure = BloodPressure;
        this.diagnosis = diagnosis;
        this.patient = patient;
        this.doctor = doctor;
        this.Weight = Weight;
        this.Height = Height;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int Weight) {
        this.Weight = Weight;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int Height) {
        this.Height = Height;
    }

    public String getTemperature() {
        return Temperature;
    }

    public void setTemperature(String Temperature) {
        this.Temperature = Temperature;
    }

    public String getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(String BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(Date encounterDate) {
        this.encounterDate = encounterDate;
    }

    @Override
    public String toString() {
        return patient.getFirstName()+" "+patient.getLastName();
    }
    
    
}
