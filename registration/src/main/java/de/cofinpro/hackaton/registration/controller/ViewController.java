package de.cofinpro.hackaton.registration.controller;

import de.cofinpro.hackaton.registration.db.UserEntity;
import de.cofinpro.hackaton.registration.services.UserDAO;

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
    private UserDAO userDAO;

    @GET
    @Path("/{clientId}")
    public String viewUser(@PathParam("clientId") @NotNull String clientId) {
        UserEntity userEntity = userDAO.getUser(clientId);

        models.put("userEntity", userEntity);
        return "/WEB-INF/view.jsp";
    }

}
