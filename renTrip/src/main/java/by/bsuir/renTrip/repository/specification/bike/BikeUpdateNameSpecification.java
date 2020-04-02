package by.bsuir.renTrip.repository.specification.bike;

import by.bsuir.renTrip.repository.specification.UpdateSpecification;

public class BikeUpdateNameSpecification implements UpdateSpecification {
    private static final String UPDATE_NAME = "UPDATE bike SET name='%s' WHERE id ='%s'";
    private String name;
    private int bikeId;

    public BikeUpdateNameSpecification(int bikeId, String name) {
        this.name = name;
        this.bikeId = bikeId;
    }

    @Override
    public String specify() {
        return String.format(UPDATE_NAME, name, bikeId);
    }
}