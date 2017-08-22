package de.cofinpro.hackaton.registration.rest.controller;

import de.cofinpro.hackaton.registration.User;
import de.cofinpro.hackaton.registration.rest.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.validation.constraints.NotNull;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
        models.put("user", userService.getUser());
        return "/WEB-INF/confirmation.jsp";
    }
}
