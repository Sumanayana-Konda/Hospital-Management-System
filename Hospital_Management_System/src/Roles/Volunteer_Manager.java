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
public class Volunteer_Manager extends Person {

    public Volunteer_Manager() {
    }

    public Volunteer_Manager(String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, House house, String role, String password) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber, house, role, password);
    }
    

}
