package by.bsuir.renTrip.command.impl;

import by.bsuir.renTrip.command.ActionCommand;
import by.bsuir.renTrip.controller.ConfigurationManager;
import by.bsuir.renTrip.controller.Router;
import by.bsuir.renTrip.entity.Bike;
import by.bsuir.renTrip.service.SaveEditBikeService;

import javax.servlet.http.HttpServletRequest;

import static by.bsuir.renTrip.type.PageChangeType.FORWARD;

public class SaveEditBikeCommand implements ActionCommand {
    @Override
    public Router execute(HttpServletRequest request) {
        Router router = new Router();
        router.setPage(ConfigurationManager.getProperty("path.page.editBike"));
        router.setWay(FORWARD);

        Bike bike = (Bike) request.getSession().getAttribute("bike");
        String field = request.getParameter("field");
        String value = request.getParameter("value");

        SaveEditBikeService.getInstance().editBike(bike, field, value);

        return router;
    }
}
