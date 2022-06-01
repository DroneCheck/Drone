package model;

import java.time.LocalDate;

public class Flight {

    private int idFlight;
    private String zone;
    private float totalWeight;
    private Person idPerson;
    private LocalDate date;

    public Flight(int idFlight, String zone, float totalWeight, Person idPerson, LocalDate date) {
        this.idFlight = idFlight;
        this.zone = zone;
        this.totalWeight = totalWeight;
        this.idPerson = idPerson;
        this.date = date;
    }
}
