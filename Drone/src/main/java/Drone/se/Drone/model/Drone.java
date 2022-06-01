package model;

public class Drone {

private int idDrone;
private String sensor;
private String serialNumber;
private String type;
private float weight;

    public Drone(int idDrone, String sensor, String serialNumber, String type, float weight) {
        this.idDrone = idDrone;
        this.sensor = sensor;
        this.serialNumber = serialNumber;
        this.type = type;
        this.weight = weight;
    }
}
