package by.bsuir.renTrip.repository.impl;

import by.bsuir.renTrip.entity.Order;
import by.bsuir.renTrip.repository.specification.order.OrderDeleteByIdSpecification;
import by.bsuir.renTrip.repository.specification.order.OrderSelectAllSpecification;
import by.bsuir.renTrip.repository.specification.order.OrderSelectByUserIdSpecification;
import by.bsuir.renTrip.repository.specification.order.OrderUpdateStatusAndTimeByIdSpecification;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class OrderRepositoryTest {
    int orderId = 44;

    @Test
    public void getInstance() {
        assertNotNull(OrderRepository.getInstance());
    }

    @Test
    public void selectAllTest() {
        List<Order> orders = OrderRepository.getInstance().query(new OrderSelectAllSpecification());
        assertFalse(orders.isEmpty());
    }

    @Test
    public void saveAndFindOrderTest() {
        int userId = 1;
        int orderId = 14;
        Order order = new Order();
        order.setUserId(userId);
        order.setBikeId(orderId);
        OrderRepository.getInstance().save(order);
        List<Order> orders = OrderRepository.getInstance().query(new OrderSelectAllSpecification());
        Order foundOrder = orders.stream()
                .filter(o -> userId == o.getUserId()
                        && orderId == o.getBikeId())
                .findFirst()
                .orElse(null);
        assertNotNull(foundOrder);
    }

    @Test
    public void updateOrderTest() {
        OrderRepository.getInstance().update(new OrderUpdateStatusAndTimeByIdSpecification(orderId));
        List<Order> orders = OrderRepository.getInstance().query(new OrderSelectAllSpecification());
        Order foundOrder = orders.stream()
                .filter(o -> orderId == o.getId())
                .findFirst()
                .orElse(null);
        assertNotNull(foundOrder);
    }

    @Test
    public void findByUserIdTest() {
        int userId = 1;
        List<Order> orders = OrderRepository.getInstance().query(new OrderSelectByUserIdSpecification(userId));
        assertFalse(orders.isEmpty());
    }

    @Test
    public void deleteOrderTest() {
        OrderRepository.getInstance().update(new OrderDeleteByIdSpecification(orderId));
        List<Order> orders = OrderRepository.getInstance().query(new OrderSelectAllSpecification());
        Order foundOrder = orders.stream()
                .filter(o -> orderId == o.getId())
                .findFirst()
                .orElse(null);
        assertNull(foundOrder);
    }
}
