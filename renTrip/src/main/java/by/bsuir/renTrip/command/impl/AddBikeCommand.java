package by.bsuir.renTrip.command.impl;


import by.bsuir.renTrip.command.ActionCommand;
import by.bsuir.renTrip.controller.ConfigurationManager;
import by.bsuir.renTrip.controller.Router;
import by.bsuir.renTrip.entity.Bike;
import by.bsuir.renTrip.repository.impl.BikeRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

import static by.bsuir.renTrip.type.PageChangeType.FORWARD;
import static by.bsuir.renTrip.type.PageChangeType.REDIRECT;

public class AddBikeCommand implements ActionCommand {

    private static org.apache.logging.log4j.Logger Logger = LogManager.getLogger();

    @Override
    public Router execute(HttpServletRequest request) {

        Logger.debug("Add bike command");
        Router router = new Router();
        String applicationDir = request.getServletContext().getRealPath("");
        String uploadFileDir = applicationDir + File.separator + "bike_image" + File.separator;
        File fileSaveDir = new File(uploadFileDir);
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdirs();
        }
        String imagePath = null;
        Part part;
        try {
            part = request.getParts().stream()
                    .filter(p -> p.getSubmittedFileName() != null && !p.getSubmittedFileName().isEmpty())
                    .findFirst().orElse(null);
        }catch (IOException | ServletException e){
            throw new RuntimeException();
        }



        String name = request.getParameter("name");
        String cost = request.getParameter("cost");
        String description = request.getParameter("description");
        String address = request.getParameter("address");

       /* Map<String, Boolean> resultOfError = AddBikeService.getInstance()
                .checkAddBikeForm(name, cost, description, address, part);
        boolean invalidResult = resultOfError.values().stream().filter(o -> o.equals(true)).findAny().orElse(false);*/

//        if (!invalidResult) {
            try {
                String path = part.getSubmittedFileName();
                imagePath = UUID.randomUUID() + path.substring(path.indexOf("."));
                part.write(uploadFileDir + imagePath);
            } catch (IOException e) {
                Logger.error(e);
            }

            Bike bike = new Bike(name, Double.parseDouble(cost), address, description, imagePath);

            BikeRepository.getInstance().save(bike);

            router.setWay(REDIRECT);
            router.setPage(ConfigurationManager.getProperty("path.page.index"));
        /*} else {
            router.setWay(FORWARD);
            resultOfError.forEach(request::setAttribute);
            router.setPage(ConfigurationManager.getProperty("path.page.addBike"));
        }*/
        return router;
    }
}