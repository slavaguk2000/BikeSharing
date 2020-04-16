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
    },
    CANCEL_ORDER{
        {
            this.command = new CancelOrderCommand();
        }
    },
    CONFIRM_ORDER{
        {
            this.command = new ConfirmOrderCommand();
        }
    };

    ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }
}