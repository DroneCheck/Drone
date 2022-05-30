package repositories;

import Drone.se.Dreone.entities.DroneCheckList;

import java.util.List;

public interface DroneCheckListRepository {
    List<DroneCheckList> findByOperator(String name);
    List<DroneCheckList> findByRemotePilot(String name);
    List<DroneCheckList> findByDroneId(String id);

}
