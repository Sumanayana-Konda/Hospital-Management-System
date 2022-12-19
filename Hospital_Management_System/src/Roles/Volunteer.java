/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import Model.House;
import Model.Person;
import java.util.Date;

/**
 *
 * @author sumanayanakonda
 */
public class Volunteer extends Person{
    
    private String roles;
    private String Feedback;
    private String Status;

    public Volunteer() {
    }

    public Volunteer(String Roles, String Feedback, String Status, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, House house, String role, String password) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber, house, role, password);
        this.roles = Roles;
        this.Feedback = Feedback;
        this.Status = Status;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    

    public String getRoles() {
        return roles;
    }

    public void setRoles(String role) {
        this.roles = role;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String Feedback) {
        this.Feedback = Feedback;
    }
    
    
    

}
