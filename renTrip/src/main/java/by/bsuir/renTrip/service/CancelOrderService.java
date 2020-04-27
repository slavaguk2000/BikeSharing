package by.bsuir.renTrip.service;

import by.bsuir.renTrip.entity.Order;
import by.bsuir.renTrip.repository.impl.BikeRepository;
import by.bsuir.renTrip.repository.impl.ClientRepository;
import by.bsuir.renTrip.repository.impl.OrderRepository;
import by.bsuir.renTrip.repository.specification.bike.BikeUpdateStatusSpecification;
import by.bsuir.renTrip.repository.specification.client.ClientUpdateDecrStatusSpecification;
import by.bsuir.renTrip.repository.specification.order.OrderDeleteByIdSpecification;

import java.util.List;

public class CancelOrderService {
    public void controlOrders(int orderId, List<Order> orders) {
        Order order = orders.stream()
                .filter(obj -> orderId == obj.getId())
                .findFirst().orElse(null);

        orders.remove(order);
        OrderRepository.getInstance().update(new OrderDeleteByIdSpecification(orderId));
        BikeRepository.getInstance().update(new BikeUpdateStatusSpecification(order.getBikeId(), 0));
        ClientRepository.getInstance().update(new ClientUpdateDecrStatusSpecification(order.getUserId()));
    }
}
