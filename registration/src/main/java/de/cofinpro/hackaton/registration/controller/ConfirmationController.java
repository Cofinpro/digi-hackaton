package de.cofinpro.hackaton.registration.controller;

import de.cofinpro.hackaton.registration.db.UserEntity;
import de.cofinpro.hackaton.registration.services.UserDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Gregor Tudan, Cofinpro AG
 */
@Controller
@Path("/confirmation")
public class ConfirmationController {

    @Inject
    private Models models;

    @Inject
    private UserDAO userDAO;

    private Logger log = LoggerFactory.getLogger(getClass());

    @GET
    public String showConfirm() {
        String clientId = getClientIdFromToken();
        UserEntity userEntity = userDAO.getUser(clientId);
        models.put("userEntity", userEntity);
        return "/WEB-INF/confirmation.jsp";
    }

    private String getClientIdFromToken() {
        // TODO Read from token
        return "afb5dad7-f7d5-4fa6-aca2-a46e88370247";
    }

}
