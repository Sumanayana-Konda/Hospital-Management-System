/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import Roles.Patient;
import java.util.Date;

/**
 *
 * @author Rutu
 */
public class ConfigureSystem {
    public static Ecosystem configure(){
        Ecosystem system = Ecosystem.getInstance();
//        Date d = new Date();
//        Patient pObj = new Patient("Sujith","Sujith","Kaluva",d,"sujith@gmail.com","Male",8572458702l);
//        system.patientdirectory.addPatient(pObj);
        return system;
    }
    
}
