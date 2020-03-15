package by.bsuir.renTrip.command.impl;

import by.bsuir.renTrip.command.ActionCommand;
import by.bsuir.renTrip.controller.ConfigurationManager;
import by.bsuir.renTrip.controller.Router;
import by.bsuir.renTrip.entity.Client;
import by.bsuir.renTrip.repository.impl.ClientRepository;
import by.bsuir.renTrip.type.PageChangeType;
import by.bsuir.renTrip.util.EncryptPassword;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServletRequest;

public class RegistrationCommand implements ActionCommand {
    private static Logger Logger = LogManager.getLogger();

    @Override
    public Router execute(HttpServletRequest request) {
        Logger.debug("Registration command");
        Router router = new Router();

        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone").replaceAll("\\s+", "");

        Client client = new Client();
        client.setLogin(login);
        client.setPassword(EncryptPassword.encrypt(password));
        client.setPhone(phone);
        ClientRepository.getInstance().save(client);
        request.getSession().setAttribute("login", login);
        request.getSession().setAttribute("role", "user");
        router.setPage(ConfigurationManager.getProperty("path.page.index"));
        router.setWay(PageChangeType.FORWARD);
        return router;
    }
}
