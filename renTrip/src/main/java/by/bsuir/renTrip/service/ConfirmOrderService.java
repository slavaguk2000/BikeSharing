package by.bsuir.renTrip.service;

import by.bsuir.renTrip.entity.Order;
import by.bsuir.renTrip.repository.impl.OrderRepository;
import by.bsuir.renTrip.repository.specification.order.OrderUpdateStatusAndTimeByIdSpecification;

import java.util.List;

public class ConfirmOrderService {
    public void confirm(int orderId, List<Order> orders) {
        orders.stream()
                .filter(obj -> orderId == obj.getId())
                .findFirst().ifPresent(o -> o.setStatus(true));

        OrderRepository.getInstance().update(new OrderUpdateStatusAndTimeByIdSpecification(orderId));
    }
}
