package de.cofinpro.hackaton.registration.rest.controller;

import de.cofinpro.hackaton.registration.User;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Controller
@Path("/view")
public class ViewController {

    @Inject
    private Models models;

    @PersistenceContext
    private EntityManager entityManager;

    @GET
    @Path("/{id}")
    public String viewUser(@PathParam("id") @NotNull Long id) {
        User user = entityManager.find(User.class, id);

        models.put("user", user);
        return "/WEB-INF/view.jsp";
    }

}
