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
    LOGIN{
        {
            this.command = new LoginCommand();
        }
    },
    REGISTRATION{
        {
            this.command = new RegistrationCommand();
        }
   },
    EDIT_BIKE{
        {
            this.command = new EditBikeCommand();
        }
    },
    RENT_BIKE{
        {
            this.command = new RentBikeCommand();
        }
    },
    GET_ORDERS{
        {
            this.command = new GetOrdersCommand();
        }
    },
    SAVE_EDIT_BIKE{
        {
            this.command = new SaveEditBikeCommand();
        }
    };
    ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }
}