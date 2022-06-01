package model;

public class Person {

    private int idPerson; //String?
    private String name;
    private String email;
    private String phoneNumber;

    public Person(int idPerson, String name, String email, String phoneNumber) {
        this.idPerson = idPerson;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
