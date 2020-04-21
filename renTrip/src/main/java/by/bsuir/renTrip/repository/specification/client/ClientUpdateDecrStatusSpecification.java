package by.bsuir.renTrip.repository.specification.client;

import by.bsuir.renTrip.repository.specification.UpdateSpecification;

public class ClientUpdateDecrStatusSpecification implements UpdateSpecification {
    private static final String UPDATE = "UPDATE client SET status = status - 1 WHERE id ='%s'";
    private int id;

    public ClientUpdateDecrStatusSpecification(int id) {
        this.id = id;
    }

    @Override
    public String specify() {
        return String.format(UPDATE, id);
    }
}
