package flightTravelAgentApp.repositories;
import flightTravelAgentApp.entities.Passengers;

import java.util.List;

public interface PassengerRepository {
    void addPassenger(Passengers passenger); // Tambahkan data penumpang
    List<Passengers> getAllPassengers();     // Dapatkan semua data penumpang
    Passengers getPassengerById(Integer id); // Cari data penumpang berdasarkan ID
    void updatePassenger(Passengers passenger); // Perbarui data penumpang
    void deletePassengerById(Integer id);   // Hapus data penumpang berdasarkan ID
}

