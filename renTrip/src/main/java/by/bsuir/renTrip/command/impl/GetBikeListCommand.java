package by.bsuir.renTrip.command.impl;

import by.bsuir.renTrip.command.ActionCommand;
import by.bsuir.renTrip.controller.ConfigurationManager;
import by.bsuir.renTrip.controller.Router;
import by.bsuir.renTrip.entity.Bike;
import by.bsuir.renTrip.repository.impl.BikeRepository;
import by.bsuir.renTrip.repository.specification.bike.BikeSelectAllSpecification;
import by.bsuir.renTrip.type.PageChangeType;
import org.apache.logging.log4j.LogManager;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

public class GetBikeListCommand implements ActionCommand {
    private static org.apache.logging.log4j.Logger Logger = LogManager.getLogger();

    @Override
    public Router execute(HttpServletRequest request) {
        Logger.debug("Get bike list command");
        Router router = new Router();
        router.setPage(ConfigurationManager.getProperty("path.page.bicycles"));
        router.setWay(PageChangeType.FORWARD);
        List<Bike> bikes = BikeRepository.getInstance().query(new BikeSelectAllSpecification());
        request.getSession().setAttribute("bikes", bikes);
        return router;
    }
}