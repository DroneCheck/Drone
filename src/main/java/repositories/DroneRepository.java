package repositories;

import Drone.se.Dreone.entities.Drone;

import java.util.List;
import java.util.Optional;

public interface DroneRepository {
    List<Drone> findByType(String type);
    Optional<Drone> findBySerialNumber(String number);

}
