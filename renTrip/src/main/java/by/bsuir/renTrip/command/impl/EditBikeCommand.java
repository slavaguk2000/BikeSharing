package by.bsuir.renTrip.command.impl;

import by.bsuir.renTrip.command.ActionCommand;
import by.bsuir.renTrip.controller.ConfigurationManager;
import by.bsuir.renTrip.controller.Router;
import by.bsuir.renTrip.entity.Bike;
import by.bsuir.renTrip.type.PageChangeType;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@SuppressWarnings("unchecked")
public class EditBikeCommand implements ActionCommand {
    @Override
    public Router execute(HttpServletRequest request) {
        Router router = new Router();
        router.setPage(ConfigurationManager.getProperty("path.page.editBike"));
        router.setWay(PageChangeType.FORWARD);
        int bikeId = Integer.parseInt(request.getParameter("bike_id"));
        List<Bike> bikes = (List<Bike>) request.getSession().getAttribute("bikes");
        Bike bike = bikes.stream()
                .filter(obj -> bikeId == obj.getId())
                .findFirst()
                .orElse(null);
        request.getSession().setAttribute("bike", bike);
        return router;
    }
}
