package Drone.se.Dreone.entities;


import java.util.Date;

public class DroneCheckList {

    private int idFlight;
    private String zone;
    private Date date;
    private String category;

    private Drone droneId;
    private Person remotePilot;
    private Person operator;

    public DroneCheckList(int idFlight, String zone, Date date, String category, Drone droneId, Person remotePilot, Person operator) {
        this.idFlight = idFlight;
        this.zone = zone;
        this.date = date;
        this.category = category;
        this.droneId = droneId;
        this.remotePilot = remotePilot;
        this.operator = operator;
    }

    public DroneCheckList() {
    }

    public int getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(int idFlight) {
        this.idFlight = idFlight;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Drone getDroneId() {
        return droneId;
    }

    public void setDroneId(Drone droneId) {
        this.droneId = droneId;
    }

    public Person getRemotePilot() {
        return remotePilot;
    }

    public void setRemotePilot(Person remotePilot) {
        this.remotePilot = remotePilot;
    }

    public Person getOperator() {
        return operator;
    }

    public void setOperator(Person operator) {
        this.operator = operator;
    }
}
