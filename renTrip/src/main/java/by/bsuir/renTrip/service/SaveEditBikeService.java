package by.bsuir.renTrip.service;

import by.bsuir.renTrip.entity.Bike;
import by.bsuir.renTrip.repository.impl.BikeRepository;
import by.bsuir.renTrip.repository.specification.bike.BikeUpdateAddressSpecification;
import by.bsuir.renTrip.repository.specification.bike.BikeUpdateCostSpecification;
import by.bsuir.renTrip.repository.specification.bike.BikeUpdateDescriptionSpecification;
import by.bsuir.renTrip.repository.specification.bike.BikeUpdateNameSpecification;

public class SaveEditBikeService {
    private static SaveEditBikeService instance;

    private SaveEditBikeService() {
    }

    public static SaveEditBikeService getInstance() {
        if (instance == null) {
            instance = new SaveEditBikeService();
        }
        return instance;
    }

    public void editBike(Bike bike, String field, String value) {
        switch (field) {
            case "name":
                BikeRepository.getInstance().update(new BikeUpdateNameSpecification(bike.getId(), value));
                bike.setName(value);
                break;
            case "cost":
                int cost = Integer.parseInt(value);
                BikeRepository.getInstance().update(new BikeUpdateCostSpecification(bike.getId(), cost));
                bike.setCost(cost);
                break;
            case "address":
                BikeRepository.getInstance().update(new BikeUpdateAddressSpecification(bike.getId(), value));
                bike.setAddress(value);
                break;
            case "description":
                BikeRepository.getInstance().update(new BikeUpdateDescriptionSpecification(bike.getId(), value));
                bike.setDescription(value);
                break;
            default:
        }
    }
}
