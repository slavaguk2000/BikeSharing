package by.bsuir.renTrip.repository.specification.client;

import by.bsuir.renTrip.repository.specification.QuerySpecification;

public class ClientSelectByLoginAndPasswordSpecification implements QuerySpecification {
    private static final String SELECT_BY_LOGIN_AND_PASSWORD =
            "SELECT client.id, role.name, login, password, email, cash, status, bike_id  FROM client " +
                    "JOIN role ON client.role = role.id WHERE login=%s AND password=%s";
    private String login;
    private String password;


    public ClientSelectByLoginAndPasswordSpecification(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String specify() {
        return String.format(SELECT_BY_LOGIN_AND_PASSWORD, login, password);
    }
}
