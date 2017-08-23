package de.cofinpro.hackaton.registration.controller;

import de.cofinpro.hackaton.registration.api.PersonalData;
import de.cofinpro.hackaton.registration.db.DepotEntity;
import de.cofinpro.hackaton.registration.db.UserEntity;
import de.cofinpro.hackaton.registration.services.DepotDAO;
import de.cofinpro.hackaton.registration.services.UserDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.Viewable;
import javax.mvc.annotation.Controller;
import javax.mvc.annotation.View;
import javax.mvc.binding.BindingResult;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;

@Controller
@Path("/registration")
@View("/WEB-INF/registration.jsp")
public class RegistrationController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Inject
    private BindingResult bindingResult;

    @Inject
    private Models models;

    @Inject
    private UserDAO userDAO;

    @Inject
    private DepotDAO depotDAO;

    @GET
    public String doGet(@QueryParam("uuid") String uuid) {
        String clientId = getClientIdFromToken();

        UserEntity userEntity = userDAO.getUser(clientId);
        if (userEntity == null) {
            // Must create user, we NEED a uuid for depot
            if (uuid == null) {
                throw new BadRequestException("Missing depot-UUID for new user");
            }
            DepotEntity depotEntity = depotDAO.getDepot(uuid);
            userEntity = new UserEntity();
            userEntity.setClientId(clientId);
            userEntity.setDepot(depotEntity);
            userDAO.saveUser(userEntity);
        }

        models.put("user", userEntity);

        return "/WEB-INF/registration.jsp";
    }

    @POST
    public String doSubmit(@BeanParam @NotNull @Valid PersonalData personalData) {
        if (bindingResult.isFailed()) {
            return doGet(null);
        }
        log.info("PersonalData: {}", personalData);
        String clientId = getClientIdFromToken();
        UserEntity user = userDAO.getUser(clientId);
        user.setName(personalData.getName());
        user.setAddress1(personalData.getAddress1());
        user.setAddress2(personalData.getAddress2());
        user.setZip(personalData.getZip());
        user.setCity(personalData.getCity());
        userDAO.saveUser(user);
        return "redirect:/confirmation";
    }

    private String getClientIdFromToken() {
        // TODO Read from token
        return "afb5dad7-f7d5-4fa6-aca2-a46e88370247";
    }

}