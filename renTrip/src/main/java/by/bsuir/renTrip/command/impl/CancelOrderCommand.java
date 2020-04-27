package by.bsuir.renTrip.command.impl;

import by.bsuir.renTrip.command.ActionCommand;
import by.bsuir.renTrip.controller.ConfigurationManager;
import by.bsuir.renTrip.controller.Router;
import by.bsuir.renTrip.entity.Order;
import by.bsuir.renTrip.repository.impl.BikeRepository;
import by.bsuir.renTrip.repository.impl.ClientRepository;
import by.bsuir.renTrip.repository.impl.OrderRepository;
import by.bsuir.renTrip.repository.specification.bike.BikeUpdateStatusSpecification;
import by.bsuir.renTrip.repository.specification.client.ClientUpdateDecrStatusSpecification;
import by.bsuir.renTrip.repository.specification.order.OrderDeleteByIdSpecification;
import by.bsuir.renTrip.service.CancelOrderService;
import by.bsuir.renTrip.type.PageChangeType;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@SuppressWarnings("unchecked")
public class CancelOrderCommand implements ActionCommand {
    public static Router getRouter(){
        Router router = new Router();
        router.setPage(ConfigurationManager.getProperty("path.page.orders"));
        router.setWay(PageChangeType.FORWARD);
        return router;
    }
    @Override
    public Router execute(HttpServletRequest request) {

        int orderId = Integer.parseInt(request.getParameter("order_id"));

        List<Order> orders = (List<Order>) request.getSession().getAttribute("orders");
        new CancelOrderService().controlOrders(orderId, orders);
        return getRouter();
    }


}
