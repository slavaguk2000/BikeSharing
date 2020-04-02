package by.bsuir.renTrip.repository.specification.bike;

import by.bsuir.renTrip.repository.specification.UpdateSpecification;

public class BikeUpdateDescriptionSpecification  implements UpdateSpecification {
    private static final String UPDATE_DESCRIPTION = "UPDATE bike SET description='%s' WHERE id ='%s'";
    private String description;
    private int bikeId;

    public BikeUpdateDescriptionSpecification(int bikeId, String description) {
        this.description = description;
        this.bikeId = bikeId;
    }

    @Override
    public String specify() {
        return String.format(UPDATE_DESCRIPTION, description, bikeId);
    }
}