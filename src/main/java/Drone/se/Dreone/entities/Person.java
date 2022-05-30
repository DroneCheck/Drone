package Drone.se.Dreone.entities;

public class Person {

    private int idPerson;
    private String name;
    private String email;
    private String phoneNumber;

    private boolean remotePilot;
    private boolean operator;

    public Person(int idPerson, String name, String email, String phoneNumber, boolean remotePilot, boolean operator) {
        this.idPerson = idPerson;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.remotePilot = remotePilot;
        this.operator = operator;
    }

    public Person() {
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isRemotePilot() {
        return remotePilot;
    }

    public void setRemotePilot(boolean remotePilot) {
        this.remotePilot = remotePilot;
    }

    public boolean isOperator() {
        return operator;
    }

    public void setOperator(boolean operator) {
        this.operator = operator;
    }
}
