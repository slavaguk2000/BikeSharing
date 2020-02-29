package by.bsuir.renTrip.repository.specification.bike;

import by.bsuir.renTrip.repository.specification.QuerySpecification;

public class BikeSelectAllSpecification implements QuerySpecification {
    private static final String SELECT_ALL =
            "SELECT status, id, name, cost, description, image, time, address FROM bike WHERE status = 0";

    @Override
    public String specify() {
        return SELECT_ALL;
    }
}
