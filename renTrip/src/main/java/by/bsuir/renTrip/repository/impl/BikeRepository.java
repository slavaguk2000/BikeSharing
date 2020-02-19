package by.bsuir.renTrip.repository.impl;

import by.bsuir.renTrip.entity.Bike;
import by.bsuir.renTrip.repository.AbstractRepository;
import by.bsuir.renTrip.repository.DatabaseManager;
import by.bsuir.renTrip.repository.specification.QuerySpecification;
import by.bsuir.renTrip.repository.specification.UpdateSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BikeRepository implements AbstractRepository<Bike> {
    private static final BikeRepository instance = new BikeRepository();
    private static final String INSERT =
            "INSERT INTO bike (name, cost, description, image, address) VALUES (?,?,?,?,?)";
    private static Logger Logger = LogManager.getLogger();
    private JdbcTemplate jdbcTemplate;

    private BikeRepository() {
        jdbcTemplate = new JdbcTemplate(DatabaseManager.getInstance().getDataSource());
    }

    public static BikeRepository getInstance() {
        return instance;
    }

    @Override
    public void save(Bike entity) {
        jdbcTemplate.update(INSERT, entity.getName(), entity.getCost(),
                entity.getDescription(), entity.getImage(), entity.getAddress());
    }

    @Override
    public void remove(Bike entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Bike> query(QuerySpecification specification) {
        return jdbcTemplate.query(specification.specify(), (resultSet, i) -> {
            Bike bike = new Bike();
            bike.setId(resultSet.getInt("id"));
            bike.setName(resultSet.getString("name"));
            bike.setDescription(resultSet.getString("description"));
            bike.setImage(resultSet.getString("image"));
            bike.setAddress(resultSet.getString("address"));
            bike.setCost(resultSet.getDouble("cost"));
            bike.setRentTime(resultSet.getLong("time"));
            bike.setStatus(resultSet.getBoolean("status"));
            return bike;
        });
    }

    @Override
    public void update(UpdateSpecification specification) {
        jdbcTemplate.update(specification.specify());
    }
}













