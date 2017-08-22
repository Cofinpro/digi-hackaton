package de.cofinpro.hackaton.registration.rest.controller;

import de.cofinpro.hackaton.registration.User;
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

    private Logger log = LoggerFactory.getLogger(getClass());

    @GET
    public String showConfirm() {
        return "/WEB-INF/confirmation.jsp";
    }
}
