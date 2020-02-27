package by.bsuir.renTrip.command;


import by.bsuir.renTrip.controller.Router;

import javax.servlet.http.HttpServletRequest;

public interface ActionCommand {

    Router execute(HttpServletRequest request);
}