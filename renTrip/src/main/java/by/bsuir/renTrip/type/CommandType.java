package by.bsuir.renTrip.type;


import by.bsuir.renTrip.command.ActionCommand;
import by.bsuir.renTrip.command.impl.GetBikeListCommand;
import by.bsuir.renTrip.command.impl.LogoutCommand;

public enum CommandType {
    LOGOUT {
        {
            this.command = new LogoutCommand();
        }
    },
    BIKES{
        {
            this.command = new GetBikeListCommand();
        }
    };

    ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }
}