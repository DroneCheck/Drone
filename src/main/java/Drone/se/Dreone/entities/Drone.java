package Drone.se.Dreone.entities;

public class Drone {

    private int idDrone;
    private String sensor;
    private String serialNumber;
    private String type;
    private double weight;

    public Drone(int idDrone, String sensor, String serialNumber, String type, double weight) {
        this.idDrone = idDrone;
        this.sensor = sensor;
        this.serialNumber = serialNumber;
        this.type = type;
        this.weight = weight;
    }

    public Drone() {
    }

    public int getIdDrone() {
        return idDrone;
    }

    public void setIdDrone(int idDrone) {
        this.idDrone = idDrone;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
