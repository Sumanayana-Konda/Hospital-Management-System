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
public class Doctor extends Person {
    
    private String DepartmentName;
 private String specialisation;
    private String degree;
    private int experience;

    public Doctor() {
    }

    public Doctor(String DepartmentName, String specialisation, String degree, int experience, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, House house, String role, String password) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber, house, role, password);
        this.DepartmentName = DepartmentName;
        this.degree = degree;
        this.specialisation = specialisation;
        this.experience = experience;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    
    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }

    @Override
    public String toString() {
        return this.getFirstName()+" "+this.getLastName();
    }
    
    
    
    

}
