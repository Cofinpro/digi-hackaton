package de.cofinpro.hackaton.registration.rest.controller;

import de.cofinpro.hackaton.registration.User;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.validation.constraints.NotNull;
import javax.ws.rs.BeanParam;
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

    @POST
    public String showConfirm(@NotNull @BeanParam User user) {
        models.put("user", user);
        return "/WEB-INF/confirmation.jsp";
    }
}
