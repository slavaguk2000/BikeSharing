package by.bsuir.renTrip.command;


import by.bsuir.renTrip.type.CommandType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ActionFactory {
    private final static ActionFactory instance = new ActionFactory();
    private static Logger Logger = LogManager.getLogger();
    private ActionFactory() {
    }

    public static ActionFactory getInstance() {
        return instance;
    }

    public ActionCommand defineCommand(String commandName) {
        if (commandName == null || commandName.isEmpty()) {
            Logger.error("Unidentified command " + commandName);
            throw new RuntimeException("Unidentified command");
        }

        ActionCommand current;
        try {
            CommandType currentEnum = CommandType.valueOf(commandName.toUpperCase());
            current = currentEnum.getCurrentCommand();
        } catch (IllegalArgumentException e) {
           Logger.error("Unidentified command " + commandName);
           throw new RuntimeException("Unidentified command ", e);
        }
        return current;
    }
}