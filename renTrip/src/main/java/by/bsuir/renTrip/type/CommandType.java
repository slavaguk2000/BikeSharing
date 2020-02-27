package by.bsuir.renTrip.type;


import by.bsuir.renTrip.command.ActionCommand;
import by.bsuir.renTrip.command.impl.*;

public enum CommandType {
    LOGOUT {
        {
            this.command = new LogoutCommand();
        }
    };

    ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }
}