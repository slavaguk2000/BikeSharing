package by.bsuir.renTrip.command.impl;

import by.bsuir.renTrip.command.ActionCommand;
import by.bsuir.renTrip.controller.ConfigurationManager;
import by.bsuir.renTrip.controller.Router;
import by.bsuir.renTrip.entity.Bike;
import by.bsuir.renTrip.entity.Client;
import by.bsuir.renTrip.entity.Order;
import by.bsuir.renTrip.repository.impl.BikeRepository;
import by.bsuir.renTrip.repository.impl.ClientRepository;
import by.bsuir.renTrip.repository.impl.OrderRepository;
import by.bsuir.renTrip.repository.specification.bike.BikeSelectByIdNotRentSpecification;
import by.bsuir.renTrip.repository.specification.bike.BikeUpdateStatusSpecification;
import by.bsuir.renTrip.repository.specification.client.ClientSelectByIdWhereCanRentMoreSpecification;
import by.bsuir.renTrip.repository.specification.client.ClientUpdateIncrStatusSpecification;
import by.bsuir.renTrip.repository.specification.order.OrderSelectByUserIdSpecification;
import by.bsuir.renTrip.type.PageChangeType;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class RentBikeCommand implements ActionCommand {
    @Override
    public Router execute(HttpServletRequest request) {
        Router router = new Router();
        int bikeId = Integer.parseInt(request.getParameter("bike_id"));

        int userId = (int) request.getSession().getAttribute("id");
        router.setPage(ConfigurationManager.getProperty("path.page.orders"));

        List<Bike> bikes = BikeRepository.getInstance().query(new BikeSelectByIdNotRentSpecification(bikeId));
        boolean bikeIsFree = !bikes.isEmpty();
        List<Client> users = ClientRepository.getInstance().query(new ClientSelectByIdWhereCanRentMoreSpecification(userId));
        boolean userCanRentMore = !users.isEmpty();

        if (bikeIsFree && userCanRentMore) {
            Order order = new Order(userId, bikeId);
            OrderRepository.getInstance().save(order);
            BikeRepository.getInstance().update(new BikeUpdateStatusSpecification(bikeId, 1));
            ClientRepository.getInstance().update(new ClientUpdateIncrStatusSpecification(userId));
        } else {
            if (!userCanRentMore) {
                request.setAttribute("invalid", "you cannot rent more than 3 bikes");
            } else {
                request.setAttribute("invalid", "oops, this bike has been already rented");
            }
        }


        List<Order> orders = OrderRepository.getInstance().query(new OrderSelectByUserIdSpecification(userId));
        orders.forEach(o -> o.setImage("bike_image/" + o.getImage()));
        request.getSession().setAttribute("orders", orders);

        router.setWay(PageChangeType.FORWARD);
        return router;
    }
}
