package by.bsuir.renTrip.service;

import by.bsuir.renTrip.entity.Order;
import by.bsuir.renTrip.repository.impl.OrderRepository;
import by.bsuir.renTrip.repository.specification.order.OrderSelectAllSpecification;
import by.bsuir.renTrip.repository.specification.order.OrderSelectByUserIdSpecification;

import java.util.List;

public class GetOrdersService {
    public List<Order> getOrders(String role, int userId, List<Order> orders) {
        if(role.equals("user")){
            orders = OrderRepository.getInstance().query(new OrderSelectByUserIdSpecification(userId));
        }else if(role.equals("admin")){
            orders = OrderRepository.getInstance().query(new OrderSelectAllSpecification());
        }
        orders.forEach(o->o.setImage("bike_image/" + o.getImage()));
        return orders;
    }
}
