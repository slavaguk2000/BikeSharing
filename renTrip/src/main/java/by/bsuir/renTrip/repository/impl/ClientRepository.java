package by.bsuir.renTrip.repository.impl;

import by.bsuir.renTrip.entity.Client;
import by.bsuir.renTrip.type.ClientType;
import by.bsuir.renTrip.repository.AbstractRepository;
import by.bsuir.renTrip.repository.DatabaseManager;
import by.bsuir.renTrip.repository.specification.QuerySpecification;
import by.bsuir.renTrip.repository.specification.UpdateSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ClientRepository implements AbstractRepository<Client> {
    private static final ClientRepository instance = new ClientRepository();
    private static final String INSERT =
            "INSERT INTO client (login, password, phone) VALUES (?,?,?)";
    private static Logger Logger = LogManager.getLogger();
    private JdbcTemplate jdbcTemplate;

    private ClientRepository() {
        jdbcTemplate = new JdbcTemplate(DatabaseManager.getInstance().getDataSource());
    }

    public static ClientRepository getInstance() {
        return instance;
    }

    @Override
    public void save(Client entity) {
        jdbcTemplate.update(INSERT, entity.getLogin(), entity.getPassword(), entity.getPhone());
    }

    @Override
    public void remove(Client entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Client> query(QuerySpecification specification) {
        return jdbcTemplate.query(specification.specify(), (resultSet, i) -> {
            Client client = new Client();
            client.setId(resultSet.getInt("client.id"));
            client.setRole(ClientType.valueOf(resultSet.getString("role.name").toUpperCase()));
            client.setLogin(resultSet.getString("login"));
            client.setPassword(resultSet.getString("password"));
            client.setPhone(resultSet.getString("phone"));
            client.setStatus(resultSet.getBoolean("status"));
            return client;
        });
    }

    @Override
    public void update(UpdateSpecification specification) {
        jdbcTemplate.update(specification.specify());
    }
}






