package by.bsuir.renTrip.controller;

import by.bsuir.renTrip.command.ActionCommand;
import by.bsuir.renTrip.command.ActionFactory;
import by.bsuir.renTrip.type.PageChangeType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "renTrip", urlPatterns = {"/renTrip"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024
        , maxFileSize = 1024 * 1024 * 5
        , maxRequestSize = 1024 * 1024 * 5 * 5)
public class Controller extends HttpServlet {
    private static Logger Logger = LogManager.getLogger();
    private static ActionFactory actionFactory = ActionFactory.getInstance();
    private static final String COMMAND = "command";
    private static final String ERROR = "error";
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String commandString = request.getParameter(COMMAND);
        ActionCommand command;
        Router router;
        try {
            command = actionFactory.defineCommand(commandString);
            router = command.execute(request);
        } catch (Exception ex) {
            router = new Router();
            router.setPage(ConfigurationManager.getProperty("path.page.error"));
            router.setWay(PageChangeType.REDIRECT);
            request.getSession().setAttribute(ERROR, ex);
        }

        if (router.getWay() == PageChangeType.FORWARD) {
            getServletContext()
                    .getRequestDispatcher(router.getPage())
                    .forward(request, response);
        } else {
            response.sendRedirect(request.getContextPath() + router.getPage());
        }
    }
}