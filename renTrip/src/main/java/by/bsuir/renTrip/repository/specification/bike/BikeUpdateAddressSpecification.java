package by.bsuir.renTrip.repository.specification.bike;

import by.bsuir.renTrip.repository.specification.UpdateSpecification;

public class BikeUpdateAddressSpecification implements UpdateSpecification {
    private static final String UPDATE_ADDRESS = "UPDATE bike SET address='%s' WHERE id ='%s'";
    private String address;
    private int bikeId;

    public BikeUpdateAddressSpecification(int bikeId, String address) {
        this.address = address;
        this.bikeId = bikeId;
    }

    @Override
    public String specify() {
        return String.format(UPDATE_ADDRESS, address, bikeId);
    }
}
