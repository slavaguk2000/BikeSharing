package by.bsuir.renTrip.command.impl;

import by.bsuir.renTrip.command.ActionCommand;
import by.bsuir.renTrip.controller.ConfigurationManager;
import by.bsuir.renTrip.controller.Router;
import by.bsuir.renTrip.entity.Order;
import by.bsuir.renTrip.repository.impl.OrderRepository;
import by.bsuir.renTrip.repository.specification.order.OrderSelectAllSpecification;
import by.bsuir.renTrip.repository.specification.order.OrderSelectByUserIdSpecification;
import by.bsuir.renTrip.service.GetOrdersService;
import by.bsuir.renTrip.type.PageChangeType;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class GetOrdersCommand implements ActionCommand {
    @Override
    public Router execute(HttpServletRequest request) {
        Router router = new Router();
        router.setPage(ConfigurationManager.getProperty("path.page.orders"));
        router.setWay(PageChangeType.FORWARD);
        String role = (String) request.getSession().getAttribute("role");
        int userId = (int) request.getSession().getAttribute("id");
        List<Order> orders = null;
        orders = new GetOrdersService().getOrders(role, userId, orders);
        request.getSession().setAttribute("orders", orders);
        return router;
    }


}
