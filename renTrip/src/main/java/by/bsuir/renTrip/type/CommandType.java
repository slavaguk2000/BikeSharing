package by.bsuir.renTrip.type;


import by.bsuir.renTrip.command.ActionCommand;
import by.bsuir.renTrip.command.impl.*;

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
    },
    ADD_BIKE{
        {
            this.command = new AddBikeCommand();
        }
    },
    LOGIN{
        {
            this.command = new LoginCommand();
        }
    },
    REGISTRATION{
        {
            this.command = new RegistrationCommand();
        }
    };

    ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }
}