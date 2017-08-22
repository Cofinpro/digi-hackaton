package de.cofinpro.hackaton.registration.controller;

import de.cofinpro.hackaton.registration.User;
import de.cofinpro.hackaton.registration.services.UserService;
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
    private UserService userService;

    private Logger log = LoggerFactory.getLogger(getClass());

    @GET
    public String showConfirm() {
        User user = userService.getUser();
        models.put("user", user);
        return "/WEB-INF/confirmation.jsp";
    }
}
