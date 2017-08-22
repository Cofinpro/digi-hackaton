package de.cofinpro.hackaton.registration.controller;

import de.cofinpro.hackaton.registration.User;
import de.cofinpro.hackaton.registration.services.UserService;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Controller
@Path("/view")
public class ViewController {

    @Inject
    private Models models;

    @Inject
    private UserService userService;

    @GET
    @Path("/{id}")
    public String viewUser(@PathParam("id") @NotNull Long id) {
        User user = userService.getUser(id);

        models.put("user", user);
        return "/WEB-INF/view.jsp";
    }

}
