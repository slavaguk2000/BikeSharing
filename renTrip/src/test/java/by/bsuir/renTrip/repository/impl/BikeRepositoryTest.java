package by.bsuir.renTrip.repository.impl;

import by.bsuir.renTrip.entity.Bike;
import by.bsuir.renTrip.repository.specification.bike.BikeSelectAllSpecification;
import by.bsuir.renTrip.repository.specification.bike.BikeUpdateCostSpecification;
import by.bsuir.renTrip.repository.specification.bike.BikeUpdateStatusSpecification;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BikeRepositoryTest {
    int bikeId = 44;

    @Test
    public void getInstance() {
        assertNotNull(BikeRepository.getInstance());
    }

    @Test
    public void selectAllTest() {
        List<Bike> bikes = BikeRepository.getInstance().query(new BikeSelectAllSpecification());
        assertFalse(bikes.isEmpty());
    }

    @Test
    public void updateBikeTest() {
        BikeRepository.getInstance().update(new BikeUpdateStatusSpecification(bikeId));
        List<Bike> bikes = BikeRepository.getInstance().query(new BikeSelectAllSpecification());
        Bike foundBike = bikes.stream()
                .filter(o -> bikeId == o.getId())
                .findFirst()
                .orElse(null);
        assertNotNull(foundBike);
    }


    @Test
    public void deleteBikeTest() {
        BikeRepository.getInstance().update(new BikeUpdateCostSpecification(bikeId));
        List<Bike> bikes = BikeRepository.getInstance().query(new BikeSelectAllSpecification());
        Bike foundBike = bikes.stream()
                .filter(o -> bikeId == o.getId())
                .findFirst()
                .orElse(null);
        assertNull(foundBike);
    }
}
