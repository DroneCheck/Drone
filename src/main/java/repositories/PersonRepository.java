package repositories;

import Drone.se.Dreone.entities.Person;

import java.util.Optional;

public interface PersonRepository {
    Optional<Person> findByName(String name);
    Optional<Person> findByEmail(String email);
    Optional<Person> findByPhoneNumber(String number);
}
