package by.bsuir.renTrip.repository.specification.client;

import by.bsuir.renTrip.repository.specification.QuerySpecification;

public class ClientSelectAllSpecification implements QuerySpecification {
    private static final String SELECT_ALL = "SELECT client.id, role.name, login, password, phone, status" +
            " FROM client JOIN role ON client.role = role.id";

    @Override
    public String specify() {
         return SELECT_ALL;
    }
}
