package by.bsuir.renTrip.repository.impl;

import by.bsuir.renTrip.entity.Order;
import by.bsuir.renTrip.repository.AbstractRepository;
import by.bsuir.renTrip.repository.DatabaseManager;
import by.bsuir.renTrip.repository.specification.QuerySpecification;
import by.bsuir.renTrip.repository.specification.UpdateSpecification;
import org.apache.logging.log4j.LogManager;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Date;
import java.util.List;

public class OrderRepository implements AbstractRepository<Order> {
    private static final OrderRepository instance = new OrderRepository();
    private static final String INSERT =
            "INSERT INTO orders (user_id, bike_id, time) VALUES (?,?,?)";
    private static org.apache.logging.log4j.Logger Logger = LogManager.getLogger();
    private JdbcTemplate jdbcTemplate;

    private OrderRepository() {
        jdbcTemplate = new JdbcTemplate(DatabaseManager.getInstance().getDataSource());
    }

    public static OrderRepository getInstance() {
        return instance;
    }

    @Override
    public void save(Order entity) {
        jdbcTemplate.update(INSERT, entity.getUserId(), entity.getBikeId(), new Date().getTime());
    }

    @Override
    public void remove(Order entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Order> query(QuerySpecification specification) {
        return jdbcTemplate.query(specification.specify(), (resultSet, i) -> {
            Order order = new Order();
            order.setId(resultSet.getInt("orders.id"));
            order.setUserId(resultSet.getInt("user_id"));
            order.setBikeId(resultSet.getInt("bike_id"));
            order.setTime(resultSet.getLong("time"));
            order.setStatus(resultSet.getBoolean("orders.status"));
            order.setName(resultSet.getString("name"));
            order.setCost(resultSet.getDouble("cost"));
            order.setImage(resultSet.getString("image"));
            order.setAddress(resultSet.getString("address"));
            order.setLogin(resultSet.getString("login"));
            order.setPhone(resultSet.getString("phone"));
            return order;
        });
    }

    @Override
    public void update(UpdateSpecification specification) {
        jdbcTemplate.update(specification.specify());
    }
}
