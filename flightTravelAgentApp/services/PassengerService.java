
package flightTravelAgentApp.services;

import flightTravelAgentApp.entities.Passengers;

import java.util.List;

public interface PassengerService {
    List<Passengers> getAllPassengers();
    void addPassenger(Passengers passenger);
    boolean removePassenger(Integer id);
    boolean editPassenger(Integer id, Passengers updatedPassenger);
}
