package by.bsuir.renTrip.command.impl;


import by.bsuir.renTrip.command.ActionCommand;
import by.bsuir.renTrip.controller.ConfigurationManager;
import by.bsuir.renTrip.controller.Router;
import by.bsuir.renTrip.entity.Client;
import by.bsuir.renTrip.repository.impl.ClientRepository;
import by.bsuir.renTrip.repository.specification.client.ClientSelectByPhoneAndPasswordSpecification;
import by.bsuir.renTrip.util.EncryptPassword;
import org.apache.logging.log4j.LogManager;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static by.bsuir.renTrip.type.PageChangeType.FORWARD;

public class LoginCommand implements ActionCommand {
    private static org.apache.logging.log4j.Logger Logger = LogManager.getLogger();

    @Override
    public Router execute(HttpServletRequest request) {
        Logger.debug("Login command");
        Router router = new Router();
        router.setWay(FORWARD);

        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        List<Client> clients = ClientRepository.getInstance().query(
                new ClientSelectByPhoneAndPasswordSpecification(phone, EncryptPassword.encrypt(password)));
        if (!clients.isEmpty()) {
            router.setPage(ConfigurationManager.getProperty("path.page.index"));
            request.getSession().setAttribute("login", clients.get(0).getLogin());
            request.getSession().setAttribute("role", clients.get(0).getRole().toString().toLowerCase());
        } else {
            request.setAttribute("errorLogOrPass", true);
            router.setPage(ConfigurationManager.getProperty("path.page.login"));
        }
        return router;
    }
}
