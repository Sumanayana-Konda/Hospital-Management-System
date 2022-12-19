/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Roles.Patient;

/**
 *
 * @author sumanayanakonda
 */
public class Insurance_Request {
    
    private Patient patient;
    private int Income;
    private String Employment;
    private String Status;
    private String insurancename;

    public String getInsurancename() {
        return insurancename;
    }

    public void setInsurancename(String insurancename) {
        this.insurancename = insurancename;
    }
    
    

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getIncome() {
        return Income;
    }

    public void setIncome(int Income) {
        this.Income = Income;
    }

    public String getEmployment() {
        return Employment;
    }

    public void setEmployment(String Employment) {
        this.Employment = Employment;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    @Override
    public String toString() {
        return insurancename;
    }
    
    
    
}
