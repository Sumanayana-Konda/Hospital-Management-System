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
public class BedsRequest {
    
    private Beds bed;
    private Date dateofOperation;
    private Patient patient;
    private String inference;
    private String status = "Pending";

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Beds getBed() {
        return bed;
    }

    public void setBed(Beds bed) {
        this.bed = bed;
    }

    public Date getDateofOperation() {
        return dateofOperation;
    }

    public void setDateofOperation(Date dateofOperation) {
        this.dateofOperation = dateofOperation;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getInference() {
        return inference;
    }

    public void setInference(String inference) {
        this.inference = inference;
    }

    @Override
    public String toString() {
        return bed.getBedName();
    }
    
    
    
    
}
