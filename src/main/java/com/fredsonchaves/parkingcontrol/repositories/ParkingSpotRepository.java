package com.fredsonchaves.parkingcontrol.repositories;

import com.fredsonchaves.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

    boolean existByLicensePlateCar(String licensePlatedCar);
    boolean existByParkingSpotNumber(String parkingSpotNumber);
    boolean existByApartmentAndBlock(String apartment, String block);
}
