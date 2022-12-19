/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import GoogleApi.GoogleMapsLocation;
import Directories.Appointments_Directory;
import Directories.Bed_Manager_Directory;
import Directories.Beds_Booking_Directory;
import Directories.Beds_Directory;
import Directories.Bills_Directory;
import Directories.Delivery_Manager_Directory;
import Directories.Deliveryman_Directory;
import Directories.DepartmentManagerDirectory;
import Directories.Department_Directory;
import Directories.Doctor_Directory;
import Directories.GlobalMessageDirectory;
import Directories.Insurance_Req_Directory;
import Directories.Insurance_Specialist_Directory;
import Directories.Lab_Manager_Directory;
import Directories.Lab_Reports_Directory;
import Directories.LocalMessagesDirectory;
import Directories.Messages_Directory;
import Directories.Medicine_Directory;
import Directories.Operation_Room_Directory;
import Directories.Operations_Booking_Directory;

import Directories.Operations_Manager_Directory;
import Directories.Orders_Directory;
import Directories.Patient_Directory;
import Directories.Payment_Directory;
import Directories.Payment_Manager_Directory;
import Directories.Person_Directory;
import Directories.Pharmacist_Directory;

import Directories.Volunteer_Directory;
import Directories.Volunteer_Manager_Directory;
import Doctor.TimingsDirectory;

/**
 *
 * @author sonalibandi
 */
public class Ecosystem {
    
    public static Ecosystem system;
    private Appointments_Directory appdir;
    private Bed_Manager_Directory bedmanagerdir;
    private Beds_Directory beddir;
    private Beds_Booking_Directory bedsbookingdir;
    private Delivery_Manager_Directory deliverymanagerdir;
    private Deliveryman_Directory deliverymandir;
    private Department_Directory deptdir;
    private Doctor_Directory docdir;
    private Insurance_Req_Directory insurancereqdir;
    private Insurance_Specialist_Directory insurancespecialist;
    private Lab_Manager_Directory labmanagerdir;
    private Lab_Reports_Directory labreportsdir;
    private Medicine_Directory medicinedir;
    private Messages_Directory messagesdir;
    private Operation_Room_Directory operationroomdir;
    private Operations_Booking_Directory operationsbookingdir;
    private Operations_Manager_Directory operationmanagerdir;
    private Orders_Directory ordersdir;
    private Patient_Directory patientdir;
    private Payment_Directory paymentdir;
    private Payment_Manager_Directory paymentmanager;
    private Person_Directory persondir;
    private Pharmacist_Directory pharmacist;
    private Volunteer_Directory volunteerdir;
    private Volunteer_Manager_Directory volunteermanagerdir;
    private GlobalMessageDirectory globalmessagedir;
    private LocalMessagesDirectory localmessagedir;
    private Bills_Directory billsList;
    private DepartmentManagerDirectory deptmanagerdir;
    private TimingsDirectory timingsdirectory;
    private String g;
    public Ecosystem(){
    appdir = new Appointments_Directory();
    bedmanagerdir = new Bed_Manager_Directory();
    deliverymanagerdir = new Delivery_Manager_Directory();
    deliverymandir = new Deliveryman_Directory();
    deptdir = new Department_Directory();
    docdir = new Doctor_Directory();
    insurancereqdir = new Insurance_Req_Directory();
    insurancespecialist = new Insurance_Specialist_Directory();
    persondir = new Person_Directory();
    labmanagerdir = new Lab_Manager_Directory();
    labreportsdir = new Lab_Reports_Directory();
    medicinedir = new Medicine_Directory();
    messagesdir = new Messages_Directory();
    operationroomdir = new Operation_Room_Directory();
    operationsbookingdir = new Operations_Booking_Directory();
    operationmanagerdir = new Operations_Manager_Directory();
    ordersdir = new Orders_Directory();
    paymentdir = new Payment_Directory();
    paymentmanager = new Payment_Manager_Directory();
    patientdir = new Patient_Directory();
    pharmacist = new Pharmacist_Directory();
    volunteerdir = new Volunteer_Directory();
    volunteermanagerdir = new Volunteer_Manager_Directory();
    globalmessagedir = new GlobalMessageDirectory();
    localmessagedir = new LocalMessagesDirectory();
    billsList = new Bills_Directory();
    deptmanagerdir = new DepartmentManagerDirectory();
    timingsdirectory = new TimingsDirectory();
    //g = new GoogleMapsLocation();
    g = " ";
    }
    

    public String getG() {
        return g;
    }

    public void setG(String g) {
        this.g = g;
    }

    public TimingsDirectory getTimingsdirectory() {
        return timingsdirectory;
    }

    public void setTimingsdirectory(TimingsDirectory timingsdirectory) {
        this.timingsdirectory = timingsdirectory;
    }

    public DepartmentManagerDirectory getDeptmanagerdir() {
        return deptmanagerdir;
    }

    public void setDeptmanagerdir(DepartmentManagerDirectory deptmanagerdir) {
        this.deptmanagerdir = deptmanagerdir;
    }

    public Messages_Directory getMessagesdir() {
        return messagesdir;
    }

    public void setMessagesdir(Messages_Directory messagesdir) {
        this.messagesdir = messagesdir;
    }
    
    

    public Bills_Directory getBillsList() {
        return billsList;
    }

    public void setBillsList(Bills_Directory billsList) {
        this.billsList = billsList;
    }
    

    public static Ecosystem getSystem() {
        return system;
    }

    public static void setSystem(Ecosystem system) {
        Ecosystem.system = system;
    }

    public Appointments_Directory getAppdir() {
        return appdir;
    }

    public void setAppdir(Appointments_Directory appdir) {
        this.appdir = appdir;
    }

    public Bed_Manager_Directory getBedmanagerdir() {
        return bedmanagerdir;
    }

    public void setBedmanagerdir(Bed_Manager_Directory bedmanagerdir) {
        this.bedmanagerdir = bedmanagerdir;
    }

    public Beds_Directory getBeddir() {
        return beddir;
    }

    public void setBeddir(Beds_Directory beddir) {
        this.beddir = beddir;
    }

    public Beds_Booking_Directory getBedsbookingdir() {
        return bedsbookingdir;
    }

    public void setBedsbookingdir(Beds_Booking_Directory bedsbookingdir) {
        this.bedsbookingdir = bedsbookingdir;
    }

    public Delivery_Manager_Directory getDeliverymanagerdir() {
        return deliverymanagerdir;
    }

    public void setDeliverymanagerdir(Delivery_Manager_Directory deliverymanagerdir) {
        this.deliverymanagerdir = deliverymanagerdir;
    }

    public Deliveryman_Directory getDeliverymandir() {
        return deliverymandir;
    }

    public void setDeliverymandir(Deliveryman_Directory deliverymandir) {
        this.deliverymandir = deliverymandir;
    }

    public Department_Directory getDeptdir() {
        return deptdir;
    }

    public void setDeptdir(Department_Directory deptdir) {
        this.deptdir = deptdir;
    }

    public Doctor_Directory getDocdir() {
        return docdir;
    }

    public void setDocdir(Doctor_Directory docdir) {
        this.docdir = docdir;
    }

    public Insurance_Req_Directory getInsurancereqdir() {
        return insurancereqdir;
    }

    public void setInsurancereqdir(Insurance_Req_Directory insurancereqdir) {
        this.insurancereqdir = insurancereqdir;
    }

    public Insurance_Specialist_Directory getInsurancespecialist() {
        return insurancespecialist;
    }

    public void setInsurancespecialist(Insurance_Specialist_Directory insurancespecialist) {
        this.insurancespecialist = insurancespecialist;
    }

    public Lab_Manager_Directory getLabmanagerdir() {
        return labmanagerdir;
    }

    public void setLabmanagerdir(Lab_Manager_Directory labmanagerdir) {
        this.labmanagerdir = labmanagerdir;
    }

    public Lab_Reports_Directory getLabreportsdir() {
        return labreportsdir;
    }

    public void setLabreportsdir(Lab_Reports_Directory labreportsdir) {
        this.labreportsdir = labreportsdir;
    }

    public Medicine_Directory getMedicinedir() {
        return medicinedir;
    }

    public void setMedicinedir(Medicine_Directory medicinedir) {
        this.medicinedir = medicinedir;
    }

    public Operation_Room_Directory getOperationroomdir() {
        return operationroomdir;
    }

    public void setOperationroomdir(Operation_Room_Directory operationroomdir) {
        this.operationroomdir = operationroomdir;
    }

    public Operations_Booking_Directory getOperationsbookingdir() {
        return operationsbookingdir;
    }

    public void setOperationsbookingdir(Operations_Booking_Directory operationsbookingdir) {
        this.operationsbookingdir = operationsbookingdir;
    }

  
    public Operations_Manager_Directory getOperationmanagerdir() {
        return operationmanagerdir;
    }

    public void setOperationmanagerdir(Operations_Manager_Directory operationmanagerdir) {
        this.operationmanagerdir = operationmanagerdir;
    }

    public Orders_Directory getOrdersdir() {
        return ordersdir;
    }

    public void setOrdersdir(Orders_Directory ordersdir) {
        this.ordersdir = ordersdir;
    }

    public Patient_Directory getPatientdir() {
        return patientdir;
    }

    public void setPatientdir(Patient_Directory patientdir) {
        this.patientdir = patientdir;
    }

    public Payment_Directory getPaymentdir() {
        return paymentdir;
    }

    public void setPaymentdir(Payment_Directory paymentdir) {
        this.paymentdir = paymentdir;
    }

    public Payment_Manager_Directory getPaymentmanager() {
        return paymentmanager;
    }

    public void setPaymentmanager(Payment_Manager_Directory paymentmanager) {
        this.paymentmanager = paymentmanager;
    }

    public Person_Directory getPersondir() {
        return persondir;
    }

    public void setPersondir(Person_Directory persondir) {
        this.persondir = persondir;
    }

    public Pharmacist_Directory getPharmacist() {
        return pharmacist;
    }

    public void setPharmacist(Pharmacist_Directory pharmacist) {
        this.pharmacist = pharmacist;
    }

  
    public Volunteer_Directory getVolunteerdir() {
        return volunteerdir;
    }

    public void setVolunteerdir(Volunteer_Directory volunteerdir) {
        this.volunteerdir = volunteerdir;
    }

    public Volunteer_Manager_Directory getVolunteermanagerdir() {
        return volunteermanagerdir;
    }

    public void setVolunteermanagerdir(Volunteer_Manager_Directory volunteermanagerdir) {
        this.volunteermanagerdir = volunteermanagerdir;
    }

    public GlobalMessageDirectory getGlobalmessagedir() {
        return globalmessagedir;
    }

    public void setGlobalmessagedir(GlobalMessageDirectory globalmessagedir) {
        this.globalmessagedir = globalmessagedir;
    }

    public LocalMessagesDirectory getLocalmessagedir() {
        return localmessagedir;
    }

    public void setLocalmessagedir(LocalMessagesDirectory localmessagedir) {
        this.localmessagedir = localmessagedir;
    }
    public static Ecosystem getInstance() {
        if (system == null) {
            system = new Ecosystem();
            //system.Configure();
            return system;
        }
        return system;
    }
    public static void setInstance(Ecosystem sys) {
       system = sys;
    }
    
    
    
    
}
