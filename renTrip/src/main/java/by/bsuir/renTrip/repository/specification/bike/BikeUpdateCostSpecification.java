package by.bsuir.renTrip.repository.specification.bike;

import by.bsuir.renTrip.repository.specification.UpdateSpecification;

public class BikeUpdateCostSpecification implements UpdateSpecification {
    private static final String UPDATE_COST = "UPDATE bike SET cost='%s' WHERE id ='%s'";
    private int cost;
    private int bikeId;

    public BikeUpdateCostSpecification(int bikeId, int cost) {
        this.cost = cost;
        this.bikeId = bikeId;
    }

    @Override
    public String specify() {
        return String.format(UPDATE_COST, cost, bikeId);
    }
}
