package by.bsuir.renTrip.repository.specification.client;

import by.bsuir.renTrip.repository.specification.QuerySpecification;

public class ClientSelectByPhoneAndPasswordSpecification implements QuerySpecification {
    private static final String SELECT_BY_PHONE_AND_PASSWORD =
            "SELECT client.id, role.name, login, password, phone, status  FROM client " +
                    "JOIN role ON client.role = role.id WHERE phone='%s' AND password='%s'";
    private String phone;
    private String password;

    public ClientSelectByPhoneAndPasswordSpecification(String phone, String password) {
        this.phone = phone;
        this.password = password;
    }

    @Override
    public String specify() {
        return String.format(SELECT_BY_PHONE_AND_PASSWORD, phone, password);
    }
}
