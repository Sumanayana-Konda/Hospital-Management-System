/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sumanayanakonda
 */
public class Medicine {
    
    private String MedicineName;
    private String Type;
    private String Dedicatedto;
    private String Kind;
    private String Status;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;

    }

    public String getMedicineName() {
        return MedicineName;
    }

    public void setMedicineName(String MedicineName) {
        this.MedicineName = MedicineName;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getDedicatedto() {
        return Dedicatedto;
    }

    public void setDedicatedto(String Dedicatedto) {
        this.Dedicatedto = Dedicatedto;
    }

    public String getKind() {
        return Kind;
    }

    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    @Override
    public String toString() {
        return MedicineName;
    }
    
    
    
}
