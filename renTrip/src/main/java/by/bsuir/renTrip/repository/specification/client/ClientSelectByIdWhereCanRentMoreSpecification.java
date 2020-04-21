package by.bsuir.renTrip.repository.specification.client;

import by.bsuir.renTrip.repository.specification.QuerySpecification;

public class ClientSelectByIdWhereCanRentMoreSpecification implements QuerySpecification {
    private static final String SELECT_BY_PHONE_AND_PASSWORD =
            "SELECT client.id, role.name, login, password, phone, status  FROM client " +
                    "JOIN role ON client.role = role.id WHERE client.id='%s' AND status < 3";
    private int id;

    public ClientSelectByIdWhereCanRentMoreSpecification(int id) {
        this.id = id;
    }

    @Override
    public String specify() {
        return String.format(SELECT_BY_PHONE_AND_PASSWORD, id);
    }
}
