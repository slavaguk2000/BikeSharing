package by.bsuir.renTrip.repository.specification.order;

import by.bsuir.renTrip.repository.specification.QuerySpecification;

public class OrderSelectByUserIdSpecification implements QuerySpecification {
    private static final String SELECT_ALL =
            "SELECT orders.id, bike_id, user_id, time, login, phone, orders.status, address, image, cost, name FROM orders " +
                    "JOIN client ON client.id = orders.user_id " +
                    "JOIN bike ON bike.id = orders.bike_id WHERE user_id = '%s'";
    private int id;

    public OrderSelectByUserIdSpecification(int id) {
        this.id = id;
    }

    @Override
    public String specify() {
        return String.format(SELECT_ALL, id);
    }
}