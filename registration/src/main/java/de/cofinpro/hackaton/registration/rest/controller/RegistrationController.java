package de.cofinpro.hackaton.registration.rest.controller;

import javax.mvc.annotation.Controller;
import javax.ws.rs.Path;
import javax.ws.rs.GET;


@Controller
@Path("/registration")
public class RegistrationController {

    @GET
    public String doGet() {
        return "/WEB-INF/registration.jsp";
    }
}