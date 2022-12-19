/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.Person;
import java.util.ArrayList;

/**
 *
 * @author sumanayanakonda
 */
public class Person_Directory {
    private ArrayList<Person> personList;

    public Person_Directory() {
        this.personList = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public void addPerson(Person pObj){
        this.personList.add(pObj);
    }
}
