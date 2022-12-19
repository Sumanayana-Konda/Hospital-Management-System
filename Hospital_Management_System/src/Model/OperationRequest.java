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
public class OperationRequest {
    
    private Operations operationRoom;
    private Date dateofOperation;
    private Doctor doctor;
    private Patient patient;
    private String Inference;
    private String status = "Pending";
    
    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Operations getOperationRoom() {
        return operationRoom;
    }

    public void setOperationRoom(Operations operationRoom) {
        this.operationRoom = operationRoom;
    }

    public Date getDateofOperation() {
        return dateofOperation;
    }

    public void setDateofOperation(Date dateofOperation) {
        this.dateofOperation = dateofOperation;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getInference() {
        return Inference;
    }

    public void setInference(String OB) {
        this.Inference = OB;
    }
    
    @Override
    public String toString(){
        return Integer.toString(operationRoom.getOperationTheaterNumber());
    }
    
    
    
    
    
}
