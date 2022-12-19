/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import Directories.Medicine_Directory;
import Model.Beds;
import Model.House;
import Model.Payment;
import Model.Person;
import java.util.Date;

/**
 *
 * @author sumanayanakonda
 */
public class Patient extends Person{
    
private Medicine_Directory medicinedir;

    public Patient() {
    }

    public Patient(Medicine_Directory medicinedir, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, House house, String role, String password, Beds beds) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber, house, role, password);
        this.medicinedir = medicinedir;
        this.beds=beds;
    }

    public Medicine_Directory getMedicinedir() {
        return medicinedir;
    }

    public void setMedicinedir(Medicine_Directory medicinedir) {
        this.medicinedir = medicinedir;
    }

    private Beds beds;
    public Beds getBeds() {
        return beds;
    }

    public void setBeds(Beds beds) {
        this.beds = beds;
    }
   
    
     @Override
    public String toString() {
        return this.getFirstName()+" "+this.getLastName();
    }
    
}
