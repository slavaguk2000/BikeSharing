package by.bsuir.renTrip.repository.specification.bike;

import by.bsuir.renTrip.repository.specification.UpdateSpecification;

public class BikeUpdateStatusSpecification implements UpdateSpecification {
    private static final String UPDATE_STATUS = "UPDATE bike SET status='%s' WHERE id ='%s'";
    private int status;
    private int bikeId;

    public BikeUpdateStatusSpecification(int bikeId, int status) {
        this.status = status;
        this.bikeId = bikeId;
    }

    @Override
    public String specify() {
        return String.format(UPDATE_STATUS, status, bikeId);
    }
}
