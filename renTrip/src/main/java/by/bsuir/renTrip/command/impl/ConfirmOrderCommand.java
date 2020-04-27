package by.bsuir.renTrip.command.impl;

import by.bsuir.renTrip.command.ActionCommand;
import by.bsuir.renTrip.controller.ConfigurationManager;
import by.bsuir.renTrip.controller.Router;
import by.bsuir.renTrip.entity.Order;
import by.bsuir.renTrip.repository.impl.OrderRepository;
import by.bsuir.renTrip.repository.specification.order.OrderUpdateStatusAndTimeByIdSpecification;
import by.bsuir.renTrip.type.PageChangeType;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@SuppressWarnings("unchecked")
public class ConfirmOrderCommand implements ActionCommand {

    @Override
    public Router execute(HttpServletRequest request) {

        int orderId = Integer.parseInt(request.getParameter("order_id"));

        List<Order> orders = (List<Order>) request.getSession().getAttribute("orders");
        orders.stream()
                .filter(obj -> orderId == obj.getId())
                .findFirst().ifPresent(o -> o.setStatus(true));

        OrderRepository.getInstance().update(new OrderUpdateStatusAndTimeByIdSpecification(orderId));

        return CancelOrderCommand.getRouter();
    }
}
