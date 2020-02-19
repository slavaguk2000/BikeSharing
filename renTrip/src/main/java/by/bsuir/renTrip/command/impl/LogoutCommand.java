package by.bsuir.renTrip.command.impl;


import by.bsuir.renTrip.command.ActionCommand;
import by.bsuir.renTrip.controller.ConfigurationManager;
import by.bsuir.renTrip.type.PageChangeType;
import by.bsuir.renTrip.controller.Router;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServletRequest;

public class LogoutCommand implements ActionCommand {
    private static Logger Logger = LogManager.getLogger();

    @Override
    public Router execute(HttpServletRequest request) {
        Logger.debug("Logout command");
        Router router = new Router();
        request.getSession().invalidate();
        router.setPage(ConfigurationManager.getProperty("path.page.index"));
        router.setWay(PageChangeType.REDIRECT);
        return router;
    }
}